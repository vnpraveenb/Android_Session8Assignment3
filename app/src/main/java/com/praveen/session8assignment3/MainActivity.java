package com.praveen.session8assignment3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView imageGridView;
    ArrayList<Integer> osImageList;
    ImageAdapter imageAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView imageGridView = findViewById(R.id.imageGridView);

        osImageList = new ArrayList<Integer>();
        osImageList.add(R.drawable.gingerbread);
        osImageList.add(R.drawable.honeycomb);
        osImageList.add(R.drawable.icecreamsandwich);
        osImageList.add(R.drawable.jellybean);
        osImageList.add(R.drawable.kitkat);
        osImageList.add(R.drawable.lollipop);

        imageAdapter = new ImageAdapter(getApplicationContext(),osImageList);
        imageGridView.setAdapter(imageAdapter);
       // imageAdapter.notifyDataSetChanged();


    }
}
