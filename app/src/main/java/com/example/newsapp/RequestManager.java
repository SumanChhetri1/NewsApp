package com.example.newsapp;

import android.content.Context;

import retrofit2.Retrofit;

public class RequestManager {
    Context context;
    Retrofit retrofit=new Retrofit.Builder().baseUrl("https://newsapi.org/v2/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
