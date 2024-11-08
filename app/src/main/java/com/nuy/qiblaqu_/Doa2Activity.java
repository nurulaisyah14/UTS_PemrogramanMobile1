package com.nuy.qiblaqu_;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Doa2Activity extends AppCompatActivity {

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa2);

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
        tvDoaArab.setText("إِنَّ الشَّيْطَانَ يَسْتَحِلُّ الطَّعَامَ إِذَا لَمْ يُذْكَرْ اسْمُ اللَّهِ عَلَيْهِ");
        tvDoaArti.setText("Artinya:");
        tvDoaArtiText.setText("“Sesungguhnya setan mendapatkan bagian makanan yang tidak disebutkan nama Allah padanya”");
    }

    @Override
    public boolean onSupportNavigateUp() {
        // Menangani tombol back di toolbar
        onBackPressed();
        return true;
    }
}
