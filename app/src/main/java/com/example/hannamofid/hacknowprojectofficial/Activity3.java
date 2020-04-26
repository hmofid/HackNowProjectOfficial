package com.example.hannamofid.hacknowprojectofficial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class Activity3 extends AppCompatActivity {

    android.widget.ImageView imageView;
    Random r;
    Integer [] Images = {R.drawable.meme1, R.drawable.meme2, R.drawable.meme3,R.drawable.meme4,R.drawable.meme5,R.drawable.meme6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        imageView = (android.widget.ImageView) findViewById(R.id.imageView);

        r = new Random();
        imageView.setImageResource(Images[r.nextInt(Images.length)]);

    }
}
