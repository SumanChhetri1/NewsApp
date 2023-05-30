package com.example.newsapp;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomViewAdapter> {
    @NonNull
    @Override
    public CustomViewAdapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewAdapter holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
