package com.example.buttonexercise;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //initialize
        button= findViewById(R.id.NameBtn);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                Toast.makeText(MainActivity.this, "Rafia Shaukat", Toast.LENGTH_SHORT).show();
            }
        });
        //second initialize
        button= findViewById(R.id.CourseBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Android Development Course", Toast.LENGTH_SHORT).show();
            }
        });

        //third initializationn
        button= findViewById(R.id.FeedbackBtn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Amazing", Toast.LENGTH_SHORT).show();
            }
        });
    }
}