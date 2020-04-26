package com.example.hannamofid.hacknowprojectofficial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class Activity4 extends AppCompatActivity {

    android.widget.ImageView imageView;
    Random r;
    Integer [] Images = {R.drawable.positive1,R.drawable.positive2,R.drawable.positive3,R.drawable.positive4};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        imageView = (android.widget.ImageView) findViewById(R.id.imageView1);

        r = new Random();
        imageView.setImageResource(Images[r.nextInt(Images.length)]);




    }
}
