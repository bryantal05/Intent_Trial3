package com.example.trialdays3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilan_depan);

    }

    public void clickRS(View view) {
        //icon RS di tekan
        Intent i = new Intent(this,RS.class);
        startActivity(i);
    }

    public void clickPolisi(View view) {
        //icon Polisi di tekan
        Intent i = new Intent(this, Polisi.class);
        startActivity(i);
    }

    public void clickSupemarket(View view) {
        //icon Polisi di tekan
        Intent i = new Intent(this, Supermarket.class);
        startActivity(i);
    }

    public void clickSekolah(View view) {
        //icon Polisi di tekan
        Intent i = new Intent(this, Sekolah.class);
        startActivity(i);
    }
}