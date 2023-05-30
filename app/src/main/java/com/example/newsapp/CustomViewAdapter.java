package com.example.newsapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CustomViewAdapter extends RecyclerView.ViewHolder {
    TextView txt_title, txt_description;
    ImageView imageView;
    CardView cardView;
    public CustomViewAdapter(@NonNull View itemView) {
        super(itemView);
        txt_title=itemView.findViewById(R.id.title);
        txt_description=itemView.findViewById(R.id.description);
        imageView=itemView.findViewById(R.id.img);
        cardView=itemView.findViewById(R.id.card_view);
    }
}
