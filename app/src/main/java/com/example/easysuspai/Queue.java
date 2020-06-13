package com.example.easysuspai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.*;
import android.view.*;


public class Queue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queue);
        Button buttonVoltar=(Button)findViewById(R.id.bt_voltar_queue);
        Button sair=(Button)findViewById(R.id.bt_sair_queue);
        sair.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
                                }
        });
        buttonVoltar.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getBaseContext(), Userscreen.class);
                startActivity(intent);
            }
        });
    }
}