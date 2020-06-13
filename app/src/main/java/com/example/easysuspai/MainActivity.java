package com.example.easysuspai;

import androidx.appcompat.app.AppCompatActivity;
import android.view.*;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1=(Button)findViewById(R.id.registermain);
        Button button2=(Button)findViewById(R.id.loginmain);
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
