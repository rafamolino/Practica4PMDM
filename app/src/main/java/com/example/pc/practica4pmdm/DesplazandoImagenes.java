package com.example.pc.practica4pmdm;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DesplazandoImagenes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_desplazando_imagenes);


        Fragment3 fragment3 = new Fragment3();
        Fragment4 fragment4 = new Fragment4();


        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.imagenes,fragment3,null);
        fragmentTransaction.add(R.id.imagenes,fragment4,null);

        fragmentTransaction.commit();

    }
}
