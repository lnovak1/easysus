package com.example.easysuspai;

import androidx.appcompat.app.AppCompatActivity;
import android.view.*;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private  ArrayList<Controle> controles;
    RegistroPaciente registro;
    FilaPaciente fila;
    Controle controleDados;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        controleDados = (Controle) getIntent().getSerializableExtra("controledadosregister");
        if(controleDados == null)
            controleDados = (Controle) getIntent().getSerializableExtra("controledadosuserscreen");
        if(controleDados == null)
            controleDados = (Controle) getIntent().getSerializableExtra("controledadosqueue");

        if (controleDados == null) {
            registro =  new RegistroPaciente();
            fila = new FilaPaciente();
            controleDados = new Controle(registro, fila);
        }

        Button button1=(Button)findViewById(R.id.registermain);
        Button button2=(Button)findViewById(R.id.loginmain);

        controles = new ArrayList<Controle>();
        controles.add(controleDados);
        button1.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view){

               Intent intent = new Intent(getBaseContext(), Register.class);
               intent.putExtra("controledadosmain", controles.get(0));
               startActivity(intent);


            }
        });
        button2.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view){

                Intent intent = new Intent(getBaseContext(), Login.class);
                intent.putExtra("controledadosmain", controles.get(0));
                startActivity(intent);


            }
        });
    }

    }
