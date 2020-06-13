package com.example.easysuspai;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class Register extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button button1=(Button)findViewById(R.id.register);
        final EditText  susnumberreg=(EditText)findViewById(R.id.susnumberreg);
        final EditText  personname=(EditText)findViewById(R.id.personname);
        final EditText  passwordreg=(EditText)findViewById(R.id.passwordreg);
        final EditText  passwordconfirmreg=(EditText)findViewById(R.id.passwordconfirmreg);

        Spinner spinnermun = (Spinner) findViewById(R.id.spinnermunicipio);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.municipio, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnermun.setAdapter(adapter);

        Spinner spinnerbairro = (Spinner) findViewById(R.id.spinnerbairro);
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.bairro, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerbairro.setAdapter(adapter2);

        button1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(susnumberreg.getText().toString().compareTo("")==0){
                    TextView numsusregister=(TextView)findViewById(R.id.textView4);
                    numsusregister.setTextColor(Color.parseColor("#f04747"));
                    return;
                }

                if (personname.getText().toString().compareTo("")==0) {

                    TextView namereg=(TextView)findViewById(R.id.textView);
                        namereg.setTextColor(Color.parseColor("#f04747"));
                        return;
                }


                if (passwordreg.getText().toString().compareTo("")==0) {

                    TextView passreg=(TextView)findViewById(R.id.textView2);
                        passreg.setTextColor(Color.parseColor("#f04747"));
                        return;

                }
                if (passwordconfirmreg.getText().toString().compareTo(passwordreg.getText().toString())!=0) {
                    TextView passconfirm=(TextView)findViewById(R.id.textView3);
                    String textooriginal=passconfirm.getText().toString();
                    passconfirm.setTextColor(Color.parseColor("#f04747"));
                    passconfirm.setText(textooriginal + " Senhas nao conferem");
                    return;

                }


            }
        });
    }
}