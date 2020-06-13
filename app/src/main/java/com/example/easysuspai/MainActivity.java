package com.example.easysuspai;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.*;
import android.view.*;
import android.app.*;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button1.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view){

               Intent intent = new Intent(getBaseContext(), Register.class);
               startActivity(intent);


            }
        });
        button2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent intent = new Intent(getBaseContext(), Login.class);
                startActivity(intent);


            }
        });
    }

    }
