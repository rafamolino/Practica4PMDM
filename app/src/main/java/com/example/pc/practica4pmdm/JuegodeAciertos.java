package com.example.pc.practica4pmdm;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;

public class JuegodeAciertos extends AppCompatActivity {

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
    TextView txtResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegode_aciertos);

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



        Fragment1 fragment1 = new Fragment1();
        Fragment2 fragment2 = new Fragment2();


        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.placeholder,fragment1,null);
        fragmentTransaction.add(R.id.placeholder,fragment2,null);

        fragmentTransaction.commit();

        if(rad1.isChecked())  txtResultado.setText("Nicaragua");
        if(rad2.isChecked()) txtResultado.setText("Portugal");
        if(rad3.isChecked()) txtResultado.setText("Sirra Leona");
        if(rad4.isChecked()) txtResultado.setText("Italia");
        if(rad5.isChecked()) txtResultado.setText("Alemania");
        if(rad6.isChecked()) txtResultado.setText("Papúa Nueva Guinea");
        if(rad7.isChecked()) txtResultado.setText("Japón");
        if(rad8.isChecked()) txtResultado.setText("Zimbaue");
        if(rad9.isChecked()) txtResultado.setText("Etiopía");
        if(rad10.isChecked()) txtResultado.setText("Georgia");



    }

}
