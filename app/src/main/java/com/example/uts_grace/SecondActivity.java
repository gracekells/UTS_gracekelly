package com.example.uts_grace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView TvNama, TvNomor, TvJalur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TvNama = findViewById(R.id.TvNama);
        TvNomor = findViewById(R.id.TvNomor);
        TvJalur = findViewById(R.id.TvJalur);

        Intent intent = getIntent();

        TvNama.setText(intent.getStringExtra("Var_nama"));
        TvNomor.setText(intent.getStringExtra("Var_Nopendaftaran"));
        TvJalur.setText(intent.getStringExtra("Var_JalurPendaftaran"));



    }
}