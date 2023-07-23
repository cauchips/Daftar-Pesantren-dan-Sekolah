package com.azhar.daftarpesantren.sekolah;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.azhar.daftarpesantren.R;
import com.azhar.daftarpesantren.network.RetrofitClient;
import com.azhar.daftarpesantren.network.SekolahServices;
import com.azhar.daftarpesantren.sekolah.ModelSekolah;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SekolahActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private SekolahAdapter sekolahAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sekolah);

        recyclerView = findViewById(R.id.recyclerViewSchools);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Retrieve the keyword from the intent
        String keyword = getIntent().getStringExtra("keyword");
        if (keyword != null && !keyword.isEmpty()) {
            searchSekolah(keyword);
        } else {
            Toast.makeText(this, "Keyword not found", Toast.LENGTH_SHORT).show();
        }
    }

    private void searchSekolah(String keyword) {
        SekolahServices service = RetrofitClient.getRetrofitInstance().create(SekolahServices.class);
        Call<List<ModelSekolah>> call = service.cariSekolah(keyword);
        call.enqueue(new Callback<List<ModelSekolah>>() {
            @Override
            public void onResponse(Call<List<ModelSekolah>> call, Response<List<ModelSekolah>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    List<ModelSekolah> sekolahList = response.body();
                    displaySekolahList(sekolahList);
                } else {
                    Toast.makeText(SekolahActivity.this, "No data found for the given keyword", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<ModelSekolah>> call, Throwable t) {
                Toast.makeText(SekolahActivity.this, "Failed to fetch data. Please try again.", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void displaySekolahList(List<ModelSekolah> sekolahList) {
        sekolahAdapter = new SekolahAdapter(sekolahList);
        recyclerView.setAdapter(sekolahAdapter);
    }
}
