package com.example.myapplication8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import static com.example.myapplication8.R.*;





        public class MainActivity extends AppCompatActivity {
            private TextView mhellotextview;
            private android.widget.ImageButton imageRed;
            private android.widget.ImageButton imageYel;
            private android.widget.ImageButton imageGreen;
            private ConstraintLayout screen ;
            @Override

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(layout.activity_main);





                setContentView(layout.activity_main);
                screen=findViewById(id.screen);
                mhellotextview=findViewById(id.textView);
                imageRed=findViewById(id.imageRed);
                imageYel=findViewById(id.imageYel);
                imageGreen=findViewById(id.imageGreen);

            }

            public void onClick_rd(View view){
                    mhellotextview.setText("Красный стой!");
                imageRed.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.redColor));
                imageYel.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.redColor));
                imageGreen.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.redColor));
                screen.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.redColor));
                }













            @SuppressLint("ResourceType")
            public void onClick_yel(View view){
                mhellotextview.setText("Желтый жди!");
                imageYel.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.yellowColor));
                imageRed.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.yellowColor));
                imageGreen.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.yellowColor));
                screen.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.yellowColor));




            }
            @SuppressLint("ResourceType")
            public void onClick_gr(View view){
                mhellotextview.setText("На зеленый проходи!");
                imageGreen.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.greenColor));
                imageYel.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.greenColor));
                imageRed.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.greenColor));
                screen.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.color.greenColor));


            }
}
