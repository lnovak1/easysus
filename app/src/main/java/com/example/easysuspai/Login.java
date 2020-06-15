package com.example.easysuspai;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Login extends AppCompatActivity {
    ArrayList<Controle> controles;
    Controle controleDados;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        controleDados = (Controle) getIntent().getSerializableExtra("controledadosmain");

        Button login=(Button)findViewById(R.id.login);
        final EditText numsus=(EditText)findViewById(R.id.numsus);
        final EditText password=(EditText)findViewById(R.id.passwordlogin);
        login.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(numsus.getText().toString().compareTo("")==0){
                    TextView txtlogin=(TextView)findViewById(R.id.textView4);
                    txtlogin.setTextColor(Color.parseColor("#f04747"));
                    return;
                }
                    else {
                    if (password.getText().toString().compareTo("")==0) {

                        TextView txtsenha = (TextView) findViewById(R.id.textView2);
                        txtsenha.setTextColor(Color.parseColor("#f04747"));
                        return;
                    }
                }
                    Paciente pacienteLogin = controleDados.getRegistro().existePaciente(Integer.parseInt(numsus.getText().toString()), password.getText().toString());
                if (pacienteLogin == null){
                    Toast toast = Toast.makeText(getApplicationContext(), R.string.loginErrado, Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.CENTER_VERTICAL, 0, 0);
                    toast.show();
                    return;
                }
                pacienteLogin.setLogado(true);
                controles = new ArrayList<Controle>();
                controles.add(controleDados);
                Intent intent = new Intent(getBaseContext(), Userscreen.class);
                intent.putExtra("controledadoslogin", controles.get(0));
                startActivity(intent);


            }
        });
    }


    }