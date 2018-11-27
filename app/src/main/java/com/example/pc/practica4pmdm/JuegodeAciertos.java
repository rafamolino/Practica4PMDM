package com.example.pc.practica4pmdm;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class JuegodeAciertos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juegode_aciertos);

        Fragment1 fragment1 = new Fragment1();
        Fragment2 fragment2 = new Fragment2();


        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.placeholder,fragment1,null);
        fragmentTransaction.add(R.id.placeholder,fragment2,null);

        fragmentTransaction.commit();
    }
}
