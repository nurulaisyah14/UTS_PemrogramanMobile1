package com.nuy.qiblaqu_;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.button.MaterialButton;

public class MenuActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Set toolbar
        Toolbar toolbar = findViewById(R.id.backButton);
        setSupportActionBar(toolbar);

        // Inisialisasi tombol
        @SuppressLint("CutPasteId") MaterialButton btnDoaMakanan = findViewById(R.id.btnDoaMakanan);
        @SuppressLint("CutPasteId") MaterialButton btnDoaSetelahMakan = findViewById(R.id.btnDoaSetelahMakan);
        MaterialButton btnDoaTidur = findViewById(R.id.btnDoaTidur);
        MaterialButton btnDoaBangunTidur = findViewById(R.id.btnDoaBangunTidur);
        MaterialButton btnDoaBulanPuasa = findViewById(R.id.btnDoaBulanPuasa);

        // Set klik listener untuk setiap tombol
        btnDoaMakanan.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, Doa1Activity.class);
            startActivity(intent);
        });

        btnDoaSetelahMakan.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, Doa2Activity.class);
            startActivity(intent);
        });

        btnDoaTidur.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, Doa3Activity.class);
            startActivity(intent);
        });

        btnDoaBangunTidur.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, Doa4Activity.class);
            startActivity(intent);
        });

        btnDoaBulanPuasa.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, Doa5Activity.class);
            startActivity(intent);
        });
    }
}
