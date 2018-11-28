package com.example.pc.practica4pmdm;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class JuegodeAciertos extends AppCompatActivity {

    RadioGroup radGPais;
    RadioButton rad1;
    RadioButton rad2;
    RadioButton rad3;
    RadioButton rad4;
    RadioButton rad5;
    RadioButton rad6;
    RadioButton rad7;
    RadioButton rad8;
    RadioButton rad9;
    RadioButton rad10;

    RadioGroup radGCapital;
    RadioButton rad11;
    RadioButton rad12;
    RadioButton rad13;
    RadioButton rad14;
    RadioButton rad15;
    RadioButton rad16;
    RadioButton rad17;
    RadioButton rad18;
    RadioButton rad19;
    RadioButton rad20;
    TextView txtPais;
    TextView txtCapital;
    TextView txtResultado;

    Button btnVerificar;

    String pais,capital;

    ImageView imgAcierto;
    ImageView imgFallo;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegode_aciertos);

        radGPais = findViewById(R.id.radGPais);
        rad1 = findViewById(R.id.radNic);
        rad2 = findViewById(R.id.radPor);
        rad3 = findViewById(R.id.radSL);
        rad4 = findViewById(R.id.radIta);
        rad5 = findViewById(R.id.radAle);
        rad6 = findViewById(R.id.radPNG);
        rad7 = findViewById(R.id.radJap);
        rad8 = findViewById(R.id.radZim);
        rad9 = findViewById(R.id.radEti);
        rad10 = findViewById(R.id.radGeo);

        radGCapital = findViewById(R.id.radGCapital);
        rad11 = findViewById(R.id.radTok);
        rad12 = findViewById(R.id.radTif);
        rad13 = findViewById(R.id.radFT);
        rad14 = findViewById(R.id.radMan);
        rad15 = findViewById(R.id.radAA);
        rad16 = findViewById(R.id.radLis);
        rad17 = findViewById(R.id.radHar);
        rad18 = findViewById(R.id.radRom);
        rad19 = findViewById(R.id.radPM);
        rad20 = findViewById(R.id.radBer);
        txtPais = findViewById(R.id.txtPais);
        txtCapital = findViewById(R.id.txtCapital);

        btnVerificar = findViewById(R.id.btnVerificar);

        imgAcierto = findViewById(R.id.imgAcierto);
        imgFallo = findViewById(R.id.imgFallo);





        Fragment1 fragment1 = new Fragment1();
        Fragment2 fragment2 = new Fragment2();


        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.placeholder,fragment1,null);
        fragmentTransaction.add(R.id.placeholder,fragment2,null);

        fragmentTransaction.commit();
        radGPais.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(rad1.isChecked())  txtPais.setText("Nicaragua");
                if(rad2.isChecked()) txtPais.setText("Portugal");
                if(rad3.isChecked()) txtPais.setText("Sierra Leona");
                if(rad4.isChecked()) txtPais.setText("Italia");
                if(rad5.isChecked()) txtPais.setText("Alemania");
                if(rad6.isChecked()) txtPais.setText("Papúa Nueva Guinea");
                if(rad7.isChecked()) txtPais.setText("Japón");
                if(rad8.isChecked()) txtPais.setText("Zimbabue");
                if(rad9.isChecked()) txtPais.setText("Etiopía");
                if(rad10.isChecked()) txtPais.setText("Georgia");

            }
        });
        radGCapital.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(rad11.isChecked())  txtCapital.setText("Tokio");
                if(rad12.isChecked()) txtCapital.setText("Tiflis");
                if(rad13.isChecked()) txtCapital.setText("FreeTown");
                if(rad14.isChecked()) txtCapital.setText("Managua");
                if(rad15.isChecked()) txtCapital.setText("Adís Abeba");
                if(rad16.isChecked()) txtCapital.setText("Lisboa");
                if(rad17.isChecked()) txtCapital.setText("Harare");
                if(rad18.isChecked()) txtCapital.setText("Roma");
                if(rad19.isChecked()) txtCapital.setText("Puerto Moresby");
                if(rad20.isChecked()) txtCapital.setText("Berlín");

            }
        });

        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pais=txtPais.getText().toString();
                capital=txtCapital.getText().toString();

                if(pais.equals("Nicaragua") && capital.equals("Managua") || pais.equals("Portugal") && capital.equals("Lisboa") ||
                        pais.equals("Sierra Leona") && capital.equals("FreeTown") || pais.equals("Italia") && capital.equals("Roma") ||
                        pais.equals("Alemania") && capital.equals("Berlín") || pais.equals("Papúa Nueva Guinea") && capital.equals("Puerto Moresby") ||
                        pais.equals("Japón") && capital.equals("Tokio") || pais.equals("Zimbabue") && capital.equals("Harare") || pais.equals("Etiopía") && capital.equals("Adís Abeba") ||
                        pais.equals("Georgia") && capital.equals("Tiflis"))
                {
                    imgAcierto.setVisibility(View.VISIBLE);
                    imgFallo.setVisibility(View.INVISIBLE);
                }
                else
                {
                    imgAcierto.setVisibility(View.INVISIBLE);
                    imgFallo.setVisibility(View.VISIBLE);

                }



            }
        });






    }


}
