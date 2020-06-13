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
        TextView welcome=(TextView)findViewById(R.id.welcome) ;
        Button buttonMarcarConsulta=(Button)findViewById(R.id.bt_marcar_consulta);
        Button sairuser=(Button)findViewById(R.id.bt_sair);
        String nome ="Cremenoso!";//trocar nome pelo da database OBS.: so o primeiro nome
        String welcome1=getString(R.string.bem_vindo);
        welcome.setText(welcome1.toString()+nome.toString());
        final boolean checkfila=false;
        if(checkfila) {
            buttonMarcarConsulta.setText(R.string.bt_checarfila);

        }
        else{
            buttonMarcarConsulta.setText(R.string.bt_entrar_fila);

        }

        buttonMarcarConsulta.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (checkfila) {


                    Intent intent = new Intent(getBaseContext(), Queue.class);
                    startActivity(intent);
                }
                if (!checkfila) {
                    //inserçaodatabase
                    Intent intent = new Intent(getBaseContext(), Queue.class);
                    startActivity(intent);
                }

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
