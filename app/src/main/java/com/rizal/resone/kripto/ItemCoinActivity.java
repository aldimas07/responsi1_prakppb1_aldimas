package com.rizal.resone.kripto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.rizal.resone.kripto.model.Koin;

public class ItemCoinActivity extends AppCompatActivity {

    private TextView txtNamaKoin, txtDeskripsiKoin, txtSejarahKoin;
    private ImageView imgGambarKoin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_coin);
        txtNamaKoin = (TextView) findViewById(R.id.txtNamaKoin);
        txtDeskripsiKoin = (TextView) findViewById(R.id.txtDeskripsiKoin);
        txtSejarahKoin = (TextView) findViewById(R.id.txtSejarahKoin);
        imgGambarKoin = (ImageView) findViewById(R.id.imgGambarKoin);
        Intent intent = getIntent();
        Koin koin = intent.getParcelableExtra("KOIN");
        txtNamaKoin.setText(koin.getNama());
        txtSejarahKoin.setText(koin.getSejarah());
        txtDeskripsiKoin.setText(koin.getDeskripsi());
        imgGambarKoin.setImageResource(koin.getIcon());
    }
}