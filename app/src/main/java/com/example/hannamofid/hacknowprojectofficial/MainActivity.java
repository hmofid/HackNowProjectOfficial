package com.example.hannamofid.hacknowprojectofficial;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    android.widget.Button feelingsButton;
    android.widget.Button jokeButton;
   android.widget.Button songButton;
   android.widget.RelativeLayout background;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        feelingsButton = (android.widget.Button) findViewById(R.id.button1);
        jokeButton = (android.widget.Button) findViewById(R.id.button2);
        songButton = (android.widget.Button) findViewById(R.id.button3);

        setUpListeners();
    }


        public void changeColors(){
                   int redColor;
                   int greenColor;
                   int blueColor;

                   redColor = (int) (Math.random() *256);
                   greenColor = (int) (Math.random() *256);
                   blueColor = (int) (Math.random() *256);

                   jokeButton.setBackgroundColor(Color.rgb(redColor, greenColor, blueColor));

        }

        public void openActivity2(){

        Intent i = new Intent(this, Activity2.class);
        startActivity(i);


        }




        private void setUpListeners(){

            jokeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //where action happens!!!
                    changeColors();


                }
            });

            feelingsButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //where action happens!!!

                    openActivity2();
                }
            });







        }


    }

