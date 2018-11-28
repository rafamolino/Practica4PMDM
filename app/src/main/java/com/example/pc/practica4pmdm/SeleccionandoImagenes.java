package com.example.pc.practica4pmdm;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SeleccionandoImagenes extends AppCompatActivity implements View.OnClickListener {
    Button btnRosa;
    Button btnTulipan;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccionando_imagenes);

        FragmentRosa fragmentRosa = new FragmentRosa();

        getSupportFragmentManager().beginTransaction().add(R.id.fragment, fragmentRosa);
        btnRosa = findViewById(R.id.btnRosa);
        btnTulipan = findViewById(R.id.btnTulipan);


        btnRosa.setOnClickListener(this);
        btnTulipan.setOnClickListener(this);




    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.btnRosa:

                FragmentRosa fragmentRosa = new FragmentRosa();
                FragmentTransaction fragmentTransaction1 = getSupportFragmentManager().beginTransaction();
                fragmentTransaction1.replace(R.id.fragment,fragmentRosa);
                fragmentTransaction1.commit();


                break;

            case R.id.btnTulipan:
                FragmentTulipan fragmentTulipan = new FragmentTulipan();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment,fragmentTulipan);
                fragmentTransaction.commit();

                break;


        }
    }

}
