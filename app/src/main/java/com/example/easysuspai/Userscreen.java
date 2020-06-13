package com.example.easysuspai;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import android.view.*;
import android.app.*;

public class Userscreen extends AppCompatActivity {
    private Button buttonMarcarConsulta;
    private Button sairuser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userscreen);
        buttonMarcarConsulta=(Button)findViewById(R.id.bt_marcar_consulta);
        sairuser=(Button)findViewById(R.id.bt_sair);
        Intent mainToQueue = new Intent();
        buttonMarcarConsulta.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getBaseContext(), Queue.class);
                startActivity(intent);
            }
        });
        sairuser.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
