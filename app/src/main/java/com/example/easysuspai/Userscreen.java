package com.example.easysuspai;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import android.view.*;


public class Userscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userscreen);
        Button buttonMarcarConsulta=(Button)findViewById(R.id.bt_marcar_consulta);
        Button sairuser=(Button)findViewById(R.id.bt_sair);
        boolean checkfila=false;
        if(checkfila) {
            buttonMarcarConsulta.setText(R.string.bt_checarfila);
            Intent intent = new Intent(getBaseContext(), Queue.class);
            startActivity(intent);
        }
        else{
            buttonMarcarConsulta.setText(R.string.bt_entrar_fila);
            //injeçao no DB
            Intent intent = new Intent(getBaseContext(), Queue.class);
            startActivity(intent);
        }

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
