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
                if(rad1.isChecked())  txtPais.setText(getResources().getString(R.string.radNicaragua));
                if(rad2.isChecked()) txtPais.setText(getResources().getString(R.string.radPortugal));
                if(rad3.isChecked()) txtPais.setText(getResources().getString(R.string.radSierraLeona));
                if(rad4.isChecked()) txtPais.setText(getResources().getString(R.string.radItalia));
                if(rad5.isChecked()) txtPais.setText(getResources().getString(R.string.radAlemania));
                if(rad6.isChecked()) txtPais.setText(getResources().getString(R.string.radPapua));
                if(rad7.isChecked()) txtPais.setText(getResources().getString(R.string.radJapon));
                if(rad8.isChecked()) txtPais.setText(getResources().getString(R.string.radZimbabue));
                if(rad9.isChecked()) txtPais.setText(getResources().getString(R.string.radEtiopia));
                if(rad10.isChecked()) txtPais.setText(getResources().getString(R.string.radGeorgia));

            }
        });
        radGCapital.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(rad11.isChecked())  txtCapital.setText(getResources().getString(R.string.radTokio));
                if(rad12.isChecked()) txtCapital.setText(getResources().getString(R.string.radTiflis));
                if(rad13.isChecked()) txtCapital.setText(getResources().getString(R.string.radFreeTown));
                if(rad14.isChecked()) txtCapital.setText(getResources().getString(R.string.radManagua));
                if(rad15.isChecked()) txtCapital.setText(getResources().getString(R.string.radAA));
                if(rad16.isChecked()) txtCapital.setText(getResources().getString(R.string.radLisboa));
                if(rad17.isChecked()) txtCapital.setText(getResources().getString(R.string.radHarare));
                if(rad18.isChecked()) txtCapital.setText(getResources().getString(R.string.radRoma));
                if(rad19.isChecked()) txtCapital.setText(getResources().getString(R.string.radPM));
                if(rad20.isChecked()) txtCapital.setText(getResources().getString(R.string.radBerlin));

            }
        });

        btnVerificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pais=txtPais.getText().toString();
                capital=txtCapital.getText().toString();

                if(pais.equals(getResources().getString(R.string.radNicaragua)) && capital.equals(getResources().getString(R.string.radManagua)) || pais.equals(getResources().getString(R.string.radPortugal)) && capital.equals(getResources().getString(R.string.radLisboa)) ||
                        pais.equals(getResources().getString(R.string.radSierraLeona)) && capital.equals(getResources().getString(R.string.radFreeTown)) || pais.equals(getResources().getString(R.string.radItalia)) && capital.equals(getResources().getString(R.string.radRoma)) ||
                        pais.equals(getResources().getString(R.string.radAlemania)) && capital.equals(getResources().getString(R.string.radBerlin)) || pais.equals(getResources().getString(R.string.radPapua)) && capital.equals(getResources().getString(R.string.radPM)) ||
                        pais.equals(getResources().getString(R.string.radJapon)) && capital.equals(getResources().getString(R.string.radTokio)) || pais.equals(getResources().getString(R.string.radZimbabue)) && capital.equals(getResources().getString(R.string.radHarare)) || pais.equals(getResources().getString(R.string.radEtiopia)) && capital.equals(getResources().getString(R.string.radAA)) ||
                        pais.equals(getResources().getString(R.string.radGeorgia)) && capital.equals(getResources().getString(R.string.radTiflis)))
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
