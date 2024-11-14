package com.nuy.qiblaqu_;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Doa1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doa1); // Pastikan nama file layout sesuai

        // Mengatur Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            // Menyembunyikan title default dari Support Action Bar
            getSupportActionBar().setDisplayShowTitleEnabled(false);
        }

        // Tidak perlu mencari TextView dan mengatur teksnya karena
        // semua teks sudah didefinisikan di layout XML
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}