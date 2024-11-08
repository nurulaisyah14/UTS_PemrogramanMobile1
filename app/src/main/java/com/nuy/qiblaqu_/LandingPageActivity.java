package com.nuy.qiblaqu_;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class LandingPageActivity extends AppCompatActivity {

    private static final long SPLASH_DELAY = 2000 ; // 2 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing_page);

        // Hide the action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        // Handler to delay the transition to the next screen
        new Handler().postDelayed(() -> {
            // Navigate to main activity after delay
            Intent intent = new Intent(LandingPageActivity.this,HomeActivity.class);
            startActivity(intent);
            finish();
        }, SPLASH_DELAY);
    }
}