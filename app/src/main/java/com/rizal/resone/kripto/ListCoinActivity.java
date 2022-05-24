package com.rizal.resone.kripto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.rizal.resone.kripto.adapter.KoinAdapter;
import com.rizal.resone.kripto.model.Koin;

import java.util.List;

public class ListCoinActivity extends AppCompatActivity {

    private RecyclerView recyKoin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_coin);
        recyKoin = (RecyclerView) findViewById(R.id.recyKoin);
        List<Koin> listKoin = Koin.listKoin;
        recyKoin.setLayoutManager(new LinearLayoutManager(ListCoinActivity.this));
        recyKoin.setAdapter(new KoinAdapter(listKoin));
    }
}