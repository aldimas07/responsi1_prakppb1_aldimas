package com.rizal.resone.kripto.adapter;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rizal.resone.kripto.ItemCoinActivity;
import com.rizal.resone.kripto.R;
import com.rizal.resone.kripto.model.Koin;

import java.util.List;

public class KoinAdapter extends RecyclerView.Adapter<KoinAdapter.ViewHolder>{

    private List<Koin> listKoin;
    public KoinAdapter(List<Koin> listKoin) {
        this.listKoin = listKoin;
    }
    @NonNull
    @Override
    public KoinAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_coin, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull KoinAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.txtNamaCoinCard.setText(listKoin.get(position).getNama());
        holder.imgKoinCard.setImageResource(listKoin.get(position).getIcon());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), ItemCoinActivity.class);
                intent.putExtra("KOIN", listKoin.get(position));
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listKoin.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgKoinCard;
        private TextView txtNamaCoinCard;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgKoinCard = (ImageView) itemView.findViewById(R.id.imgKoinCard);
            txtNamaCoinCard = (TextView) itemView.findViewById(R.id.txtNamaKoinCard);
        }
    }
}
