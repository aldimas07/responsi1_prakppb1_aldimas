package com.rizal.resone.kripto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.rizal.resone.kripto.model.Koin;

public class ItemCoinActivity extends AppCompatActivity {

    private TextView txtNamaKoin, txtDeskripsiKoin, txtSejarahKoin, txtDirectLinkKoin;
    private ImageView imgGambarKoin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_coin);
        txtNamaKoin = (TextView) findViewById(R.id.txtNamaKoin);
        txtDeskripsiKoin = (TextView) findViewById(R.id.txtDeskripsiKoin);
        txtSejarahKoin = (TextView) findViewById(R.id.txtSejarahKoin);
        txtDirectLinkKoin = (TextView) findViewById(R.id.txtDirectLinkKoin);
        imgGambarKoin = (ImageView) findViewById(R.id.imgGambarKoin);
        Intent intent = getIntent();
        Koin koin = intent.getParcelableExtra("KOIN");
        txtNamaKoin.setText(koin.getNama());
        txtSejarahKoin.setText(koin.getSejarah());
        txtDeskripsiKoin.setText(koin.getDeskripsi());
        imgGambarKoin.setImageResource(koin.getIcon());
        txtDirectLinkKoin.setPaintFlags(txtDirectLinkKoin.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        txtDirectLinkKoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri webpage = Uri.parse(koin.getLink());
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(intent);
            }
        });
    }
}