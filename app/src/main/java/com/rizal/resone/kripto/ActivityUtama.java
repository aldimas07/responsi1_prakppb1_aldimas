package com.rizal.resone.kripto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityUtama extends AppCompatActivity {

    private Button btnList, btnProfil, btnExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utama);
        btnList = (Button) findViewById(R.id.btnList);
        btnProfil = (Button) findViewById(R.id.btnProfil);
        btnExit = (Button) findViewById(R.id.btnExit);
        btnList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityUtama.this, ListCoinActivity.class);
                startActivity(intent);
            }
        });
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
            }
        });
        btnProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityUtama.this, ProfilActivity.class);
                startActivity(intent);
            }
        });
    }
}