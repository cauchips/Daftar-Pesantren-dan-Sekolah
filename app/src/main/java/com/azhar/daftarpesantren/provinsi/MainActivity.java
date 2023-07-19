package com.azhar.daftarpesantren.provinsi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.azhar.daftarpesantren.provinsi.MainSekolahActivity;
import com.azhar.daftarpesantren.R;

public class MainActivity extends AppCompatActivity {

    private Button btnPesantren;
    private Button btnSekolah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPesantren = findViewById(R.id.btnPesantren);
        btnSekolah = findViewById(R.id.btnSekolah);

        btnPesantren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainPesantrenActivity.class);
                startActivity(intent);
            }
        });

        btnSekolah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainSekolahActivity.class);
                startActivity(intent);
            }
        });
    }
}
