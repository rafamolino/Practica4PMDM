package com.example.pc.practica4pmdm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class NumerosPrimos extends AppCompatActivity {
    EditText editNumero;
    Button btnCalcular;
    TextView txtResultadoP;
    int numero;
    int i;
    int contador;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros_primos);

        editNumero = findViewById(R.id.editNumero);
        btnCalcular = findViewById(R.id.btnCalcular);
        txtResultadoP = findViewById(R.id.txtResultadoP);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                if(!editNumero.getText().toString().isEmpty())
                {
                    numero=Integer.parseInt(editNumero.getText().toString());
                    contador=0;
                    for(i = 1; i <= numero; i++)
                    {
                        if((numero % i) == 0)
                        {
                            contador++;
                        }
                    }

                    if(contador <= 2)
                    {
                        txtResultadoP.setText(getResources().getString(R.string.numerosiprimo));
                    }
                    else
                    {
                        txtResultadoP.setText(getResources().getString(R.string.numeronoprimo));
                    }

                }
                else
                {
                    Toast toast = Toast.makeText(getApplicationContext(), "¡INTRODUCE UN NÚMERO!" , Toast.LENGTH_LONG);
                    toast.setGravity(Gravity.CENTER_HORIZONTAL|Gravity.CENTER_VERTICAL,0,20);
                    toast.show();
                }

            }


        });
    }
}
