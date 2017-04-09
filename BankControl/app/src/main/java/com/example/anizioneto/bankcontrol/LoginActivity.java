package com.example.anizioneto.bankcontrol;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private Context c = this;  // variavel context para navegar entre telas
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        //associando os valores passados pela tela
        TextView txEmail = (TextView) findViewById(R.id.editTextEmail);
        TextView txSenha = (TextView) findViewById(R.id.editTextSenha);
        Button btnEntrar = (Button) findViewById(R.id.buttonEntrar);

        //envento btnEntrar
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(c, MainActivity.class);




                //navegar para outra tela
                startActivity(intent);
            }
        });






    }
}
