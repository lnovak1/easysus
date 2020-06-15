package com.example.easysuspai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.*;
import android.view.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;


public class Queue extends AppCompatActivity {
    ArrayList<Controle> controles;
    Controle controleDados;
    Paciente pacienteLogado;
    int qtdPacientesFila;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queue);
        controleDados = (Controle) getIntent().getSerializableExtra("controledadosuserscreen");

        pacienteLogado = controleDados.getRegistro().existePacienteLogado();

        TextView timequeue = (TextView) findViewById(R.id.timequeue);
        java.util.GregorianCalendar gc = new java.util.GregorianCalendar();
        gc.setTime(new java.util.Date());

        java.text.DateFormat sdf = new java.text.SimpleDateFormat("HH:mm");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT-3"));
        qtdPacientesFila = controleDados.getFila().getQuantidadePacientes();
        gc.add(java.util.Calendar.MINUTE,15 * (qtdPacientesFila - 1));
        timequeue.setText(sdf.format(gc.getTime()));

        TextView filaposicao = (TextView) findViewById(R.id.filaposicao);
        TextView nomeInicio = (TextView) findViewById(R.id.textNomeActivityQueue);
        nomeInicio.setText(pacienteLogado.getNome() + ",");
        Button buttonVoltar=(Button)findViewById(R.id.bt_voltar_queue);
        Button sair=(Button)findViewById(R.id.bt_sair_queue);
        filaposicao.setText("Atualmente tem " +" "+ (qtdPacientesFila - 1) +" pessoas na sua frente");

        sair.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view){
                controles = new ArrayList<Controle>();
                controles.add(controleDados);
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                intent.putExtra("controledadosqueue", controles.get(0));
                startActivity(intent);
            }
        });
        buttonVoltar.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view){
                controles = new ArrayList<Controle>();
                controles.add(controleDados);
                Intent intent = new Intent(getBaseContext(), Userscreen.class);
                intent.putExtra("controledadosqueue", controles.get(0));
                startActivity(intent);
            }
        });
    }
}