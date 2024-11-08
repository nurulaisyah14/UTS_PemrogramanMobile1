package com.nuy.qiblaqu_;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Doa3Activity extends AppCompatActivity {

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
        tvDoaArab.setText("بِسْمِ اللهِ الرَّحْمَنِ الرَّحِيْمِ، اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ");
        tvDoaArti.setText("Artinya:");
        tvDoaArtiText.setText("“Ya Allah! Dengan nama-Mu, aku hidup dan dengan nama-Mu pula aku mati.”");
    }

    @Override
    public boolean onSupportNavigateUp() {
        // Menangani tombol back di toolbar
        onBackPressed();
        return true;
    }
}
