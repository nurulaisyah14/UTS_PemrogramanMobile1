package com.nuy.qiblaqu_;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Doa4Activity extends AppCompatActivity {

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa3);

        // Inisialisasi Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Mengaktifkan tombol back di toolbar
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        // Inisialisasi TextView berdasarkan ID yang ada di XML
        TextView tvDoaArab = findViewById(R.id.tvDoaArab);
        TextView tvDoaArti = findViewById(R.id.tvDoaArti);
        TextView tvDoaArtiText = findViewById(R.id.tvDoaArtiText);

        // Mengatur teks untuk TextView
        tvDoaArab.setText("الْحَمْدُ لِلَّهِ الَّذِي أَحْيَانَا بَعْدَ مَا أَمَاتَنَا وَإِلَيْهِ النُّشُور");
        tvDoaArti.setText("Artinya:");
        tvDoaArtiText.setText("Segala puji bagi Allah yang telah mengembalikan kehidupan, mematikan kami, dan hanya kepadaNyalah kami kembali.");
    }

    @Override
    public boolean onSupportNavigateUp() {
        // Menangani tombol back di toolbar
        onBackPressed();
        return true;
    }
}
