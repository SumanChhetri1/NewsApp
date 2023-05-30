package com.example.newsapp;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SpinnerDemo implements AdapterView.OnItemSelectedListener {

    String[] course={"c","java","c++","python","kotlin"};
    Spinner spinner;
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scroll);
        Spinner spinner=findViewbyId(R.id.coursesspinner);
        AdapterView.OnItemSelectedListener(this);
        ArrayAdapter adapter=new ArrayAdapter(this, andriod.R.layout.simple_expandable_list_item_1,course);
        spinner.setAdapter(adapter);

    }
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
