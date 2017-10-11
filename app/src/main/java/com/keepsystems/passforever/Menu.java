package com.keepsystems.passforever;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionMenu;

public class Menu extends AppCompatActivity {

    FloatingActionMenu actionMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        actionMenu = (FloatingActionMenu) findViewById(R.id.action);
        actionMenu.setClosedOnTouchOutside(true);

    }

    public void  configuracion (View view){
        Toast.makeText(this, "Tranquilo xD", Toast.LENGTH_SHORT).show();
    }
    public void anadir (View view){
        Intent intent = new Intent(this,AnadirCuenta.class);
        startActivity(intent);
    }
    public void menu (View view){

    }
}
