package com.example.easysuspai;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
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
                Intent intent = new Intent(getBaseContext(), Userscreen.class);
                startActivity(intent);


            }
        });
    }
}