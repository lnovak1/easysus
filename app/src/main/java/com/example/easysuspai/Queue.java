package com.example.easysuspai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.*;
import android.view.*;
import android.app.*;

public class Queue extends AppCompatActivity {
    private Button buttonVoltar;
    private Button sair;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queue);
        sair=(Button)findViewById(R.id.bt_sair_queue);
        buttonVoltar=(Button)findViewById(R.id.bt_voltar_queue);
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