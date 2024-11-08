package com.nuy.qiblaqu_;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Doa5Activity extends AppCompatActivity {

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
        tvDoaArab.setText("اللّهُمَّ لَكَ صُمْتُ وَبِكَ آمَنْتُ وَعَلَى رِزْقِكَ أَفْطَرْت بِرَحْمَتِكَ يَا اَرْحَمَ الرَّحِمِيْنَ");
        tvDoaArti.setText("Artinya:");
        tvDoaArtiText.setText("ya_allah_dzat_yang_maha_pemurah_dari_segalanya_untuk_mu_aku_berpuasa_dan_dengan_rizki_dan_kasih_sayang_mu_aku_berbuka");
    }

    @Override
    public boolean onSupportNavigateUp() {
        // Menangani tombol back di toolbar
        onBackPressed();
        return true;
    }
}
