package com.example.pc.practica4pmdm;

import android.net.Uri;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SeleccionandoImagenes extends AppCompatActivity implements View.OnClickListener, FragmentRosa.OnFragmentInteractionListener, FragmentTulipan.OnFragmentInteractionListener, FragmentMargarita.OnFragmentInteractionListener, FragmentClavel.OnFragmentInteractionListener{
    Button btnRosa;
    Button btnTulipan;
    Button btnMargarita;
    Button btnClavel;
    FragmentMargarita fragmentMargarita;
    FragmentRosa fragmentRosa;
    FragmentTulipan fragmentTulipan;
    FragmentClavel fragmentClavel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccionando_imagenes);

         fragmentRosa = new FragmentRosa();
         fragmentMargarita = new FragmentMargarita();
         fragmentTulipan = new FragmentTulipan();
         fragmentClavel = new FragmentClavel();



        getSupportFragmentManager().beginTransaction().add(R.id.contenedorFragment, fragmentRosa).commit();
        btnRosa = findViewById(R.id.btnRosa);
        btnTulipan = findViewById(R.id.btnTulipan);
        btnMargarita = findViewById(R.id.btnMargarita);
        btnClavel = findViewById(R.id.btnClavel);
    }

    @Override
    public void onClick(View v) {

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();



        switch (v.getId())
        {
            case R.id.btnRosa:

                transaction.replace(R.id.contenedorFragment,fragmentRosa);


                break;

            case R.id.btnTulipan:
                transaction.replace(R.id.contenedorFragment,fragmentTulipan);

                break;

            case R.id.btnMargarita:
                transaction.replace(R.id.contenedorFragment,fragmentMargarita);

                break;
            case R.id.btnClavel:
                transaction.replace(R.id.contenedorFragment,fragmentClavel);

                break;


        }
        transaction.commit();

    }
    public void onFragmentInteraction(Uri uri) {

    }

}
