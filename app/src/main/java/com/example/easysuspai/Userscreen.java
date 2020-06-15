package com.example.easysuspai;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;
import android.view.*;

import java.util.ArrayList;


public class Userscreen extends AppCompatActivity {
    ArrayList<Controle> controles;
    Controle controleDados;
    Paciente pacienteLogado;
    Boolean pacienteNaFila;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userscreen);

        controleDados = (Controle) getIntent().getSerializableExtra("controledadoslogin");
        if (controleDados == null)
            controleDados = (Controle) getIntent().getSerializableExtra("controledadosqueue");
        TextView welcome=(TextView)findViewById(R.id.welcome) ;
        TextView upa=(TextView)findViewById(R.id.upa) ;
        TextView end=(TextView)findViewById(R.id.end) ;
        Button buttonMarcarConsulta=(Button)findViewById(R.id.bt_marcar_consulta);
        Button sairuser=(Button)findViewById(R.id.bt_sair);
        pacienteLogado = controleDados.getRegistro().existePacienteLogado();
        String nome =pacienteLogado.getNome();
        String upa2 ="UPA - Tijuca";
        String end2 ="Rua Conde de Bonfim, s/n - Tijuca, Rio de Janeiro - RJ, 20520-054";
        String welcome1= getString(R.string.bem_vindo);
        String upa1=getString(R.string.nome_unidade);
        String end1=getString(R.string.endereco_unidade);
        welcome.setText(welcome1.toString()+" "+nome.toString());
        upa.setText(upa1.toString()+upa2.toString());
        end.setText(end1.toString()+end2.toString());
        pacienteNaFila = controleDados.getFila().pacienteNaFila(pacienteLogado.getNumeroSUS());
        if(pacienteNaFila) {
            buttonMarcarConsulta.setText(R.string.bt_checarfila);

        }
        else{
            buttonMarcarConsulta.setText(R.string.bt_entrar_fila);

        }

        buttonMarcarConsulta.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (pacienteNaFila) {
                    controles = new ArrayList<Controle>();
                    controles.add(controleDados);
                    Intent intent = new Intent(getBaseContext(), Queue.class);
                    intent.putExtra("controledadosuserscreen", controles.get(0));
                    startActivity(intent);
                }
                if (!pacienteNaFila) {
                    controleDados.getFila().addPaciente(pacienteLogado);
                    controles = new ArrayList<Controle>();
                    controles.add(controleDados);
                    Intent intent = new Intent(getBaseContext(), Queue.class);
                    intent.putExtra("controledadosuserscreen", controles.get(0));
                    startActivity(intent);
                }

                }

        });
        sairuser.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View view){
                controles = new ArrayList<Controle>();
                controles.add(controleDados);
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                intent.putExtra("controledadosuserscreen", controles.get(0));
                startActivity(intent);
            }
        });
    }
}
