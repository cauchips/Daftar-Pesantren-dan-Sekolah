package com.azhar.daftarpesantren.main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.azhar.daftarpesantren.R;
import com.azhar.daftarpesantren.network.RetrofitClient;
import com.azhar.daftarpesantren.network.SekolahServices;
import com.azhar.daftarpesantren.sekolah.ModelSekolah;
import com.azhar.daftarpesantren.sekolah.SekolahActivity;
import com.azhar.daftarpesantren.sekolah.SekolahAdapter;

import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainSekolahActivity extends AppCompatActivity {

    private EditText etKeyword;
    private Button btnSearch;
    private RecyclerView recyclerView;
    private SekolahAdapter sekolahAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sekolah);

        etKeyword = findViewById(R.id.etKeyword);
        btnSearch = findViewById(R.id.btnSearch);

        btnSearch.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String keyword = etKeyword.getText().toString().trim();
                    if (!keyword.isEmpty()) {
                        navigateToSekolahActivity(keyword);
                    } else {
                        Toast.makeText(MainSekolahActivity.this, "Please enter a keyword", Toast.LENGTH_SHORT).show();
                    }
                }
            });
    }

            private void navigateToSekolahActivity(String keyword) {
                Intent intent = new Intent(MainSekolahActivity.this, SekolahActivity.class);
                intent.putExtra("keyword", keyword);
                startActivity(intent);
            }

        }
