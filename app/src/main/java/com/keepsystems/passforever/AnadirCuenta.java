package com.keepsystems.passforever;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class AnadirCuenta extends AppCompatActivity {

    Spinner cuentas;
    String Cuenta;
    ArrayAdapter<CharSequence> cuentass;
    EditText otro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anadir_cuenta);

        otro = (EditText)findViewById(R.id.txtotro);
        cuentas = (Spinner)findViewById(R.id.cuentas);

        cuentass = ArrayAdapter.createFromResource(this, R.array.cuentas_array, 	    	android.R.layout.simple_spinner_item);
        cuentass.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cuentas.setAdapter(cuentass);

        cuentas.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Cuenta = cuentas.getSelectedItem().toString().trim();

                if (Cuenta.equals("Otro")){
                    otro.setVisibility(View.VISIBLE);
                }else {
                    otro.setVisibility(View.GONE);
                    otro.setFocusable(true);
                    otro.requestFocus();
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
