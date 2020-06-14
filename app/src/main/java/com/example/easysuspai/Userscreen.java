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
        TextView upa=(TextView)findViewById(R.id.upa) ;
        TextView end=(TextView)findViewById(R.id.end) ;
        Button buttonMarcarConsulta=(Button)findViewById(R.id.bt_marcar_consulta);
        Button sairuser=(Button)findViewById(R.id.bt_sair);
        String nome ="Cremenoso!";//trocar nome pelo da database OBS.: so o primeiro nome
        String upa2 ="UPA - Tijuca";// quanto tiver varios banco ira fazer conexao com o banco para mostrar o nome
        String end2 ="Rua Conde de Bonfim, s/n - Tijuca, Rio de Janeiro - RJ, 20520-054";//pode usar a API do SUS para mostrar os enderecos qqnd tiver mais bancos
        String welcome1=getString(R.string.bem_vindo);
        String upa1=getString(R.string.nome_unidade);
        String end1=getString(R.string.endereco_unidade);
        welcome.setText(welcome1.toString()+nome.toString());
        upa.setText(upa1.toString()+upa2.toString());
        end.setText(end1.toString()+end2.toString());
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
