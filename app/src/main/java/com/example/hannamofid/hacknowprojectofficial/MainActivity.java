package com.example.hannamofid.hacknowprojectofficial;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    android.widget.Button affirmationsButton;
    android.widget.Button jokeButton;
   android.widget.Button calmButton;
   android.widget.RelativeLayout background;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        affirmationsButton = (android.widget.Button) findViewById(R.id.button7);
        jokeButton = (android.widget.Button) findViewById(R.id.button2);
        calmButton = (android.widget.Button) findViewById(R.id.button1);



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

        public void openActivity3(){

        Intent intent = new Intent(this, Activity3.class);
        startActivity(intent);



        }

    public void openActivity4(){

        Intent intent = new Intent(this, Activity4.class);
        startActivity(intent);

    }





        private void setUpListeners(){

            jokeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //where action happens!!!
                    openActivity3();
                    //changeColors();
                }
            });

            calmButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //where action happens!!!

                    openActivity2();
                }
            });


            affirmationsButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //where action happens!!!
                    openActivity4();
                }
            });




        }


    }

