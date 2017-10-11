package com.keepsystems.passforever;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    Intent intent;
    EditText Usuario,Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Usuario = (EditText) findViewById(R.id.txtusuario);
        Password = (EditText) findViewById(R.id.txtpass);
    }


    public void Registrarse (View view){
        intent = new Intent(this,Registrarse.class);
        startActivity(intent);
    }

    public void Acceder (View view){
        intent = new Intent(this,Menu.class);
        startActivity(intent);
        finish();
}
}
