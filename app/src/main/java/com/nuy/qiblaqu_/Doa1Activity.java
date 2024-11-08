package com.nuy.qiblaqu_;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Doa1Activity extends AppCompatActivity {

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // Mengatur Toolbar
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // Inisialisasi TextView berdasarkan ID yang ada di XML
        TextView tvDoaArab = findViewById(R.id.tvDoaArab);
        @SuppressLint("CutPasteId") TextView tvDoaArti = findViewById(R.id.tvDoaArti);
        @SuppressLint("CutPasteId") TextView tvDoaArtiText = findViewById(R.id.tvDoaArti);

        // Mengatur teks atau fungsi tambahan jika diperlukan
        tvDoaArab.setText("بِسْمِ اللَّهِ الرَّحْمَنِ الرَّحِيمِ اللَّهُمَّ بَارِكْ لَنَا فِيمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ");
        tvDoaArti.setText("Artinya:");
        tvDoaArtiText.setText("Ya Allah! Berkahilah rezeki yang telah Engkau berikan kepada kami, dan peliharalah kami dari siksa api neraka");
    }
}
