package com.example.easysuspai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.*;
import android.view.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;




public class Queue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queue);



       int b=3;//valor ilusorio de N fila inserir numero da database aqui


        TextView timequeue = (TextView) findViewById(R.id.timequeue);
        java.util.GregorianCalendar gc = new java.util.GregorianCalendar();
        gc.setTime(new java.util.Date());

        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("HH:mm");
        gc.add(java.util.Calendar.MINUTE,15*b);
        timequeue.setText(sdf.format(gc.getTime()));




        TextView filaposicao = (TextView) findViewById(R.id.filaposicao);
        Button buttonVoltar=(Button)findViewById(R.id.bt_voltar_queue);
        Button sair=(Button)findViewById(R.id.bt_sair_queue);
        String texto1 = filaposicao.getText().toString();
        String texto2 = getString(R.string.activity_queue_position2);
        filaposicao.setText(texto1.toString() +" "+ b +" "+ texto2.toString());

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