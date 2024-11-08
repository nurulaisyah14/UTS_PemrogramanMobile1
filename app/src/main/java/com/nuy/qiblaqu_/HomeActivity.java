package com.nuy.qiblaqu_;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.card.MaterialCardView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Inisialisasi kartu dan elemen lainnya
        MaterialCardView card1 = findViewById(R.id.card1);
        MaterialCardView card2 = findViewById(R.id.card2);
        MaterialCardView card3 = findViewById(R.id.card3);
        MaterialCardView card4 = findViewById(R.id.card4);
        TextView viewAll = findViewById(R.id.viewAll);

        // Event untuk masing-masing kartu
        card1.setOnClickListener(v -> {
            // Aksi untuk Kartu Doa Makan
            Intent intent = new Intent(HomeActivity.this, Doa1Activity.class);
            startActivity(intent);
        });

        card2.setOnClickListener(v -> {
            // Aksi untuk Kartu Doa Setelah Makan
            Intent intent = new Intent(HomeActivity.this, Doa2Activity.class);
            startActivity(intent);
        });

        card3.setOnClickListener(v -> {
            // Aksi untuk Kartu Doa Bangun Tidur
            Intent intent = new Intent(HomeActivity.this, Doa3Activity.class);
            startActivity(intent);
        });

        card4.setOnClickListener(v -> {
            // Aksi untuk Kartu Doa Mau Tidur
            Intent intent = new Intent(HomeActivity.this, Doa4Activity.class);
            startActivity(intent);
        });

        viewAll.setOnClickListener(v -> {
            // Aksi untuk tombol "Lihat semua"
            Intent intent = new Intent(HomeActivity.this, MenuActivity.class);
            startActivity(intent);
        });
    }
}
