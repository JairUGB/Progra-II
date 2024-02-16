package com.ugb.controlesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TabHost tbh;
    TextView tempVal;
    Spinner spn;
    Button btnConvertirLongitud;
    Button btnConvertirMonedas;
    Button btnConvertirMasa;
    conversores miObj = new conversores();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tbh = findViewById(R.id.tbhConversor);
        tbh.setup();

        tbh.addTab(tbh.newTabSpec("LON").setContent(R.id.tab1Longitud).setIndicator("LONGITUD", null));
        tbh.addTab(tbh.newTabSpec("ALM").setContent(R.id.tab2Almacenamiento).setIndicator("ALMACENAMIENTO", null));
        tbh.addTab(tbh.newTabSpec("MON").setContent(R.id.tab3Monedas).setIndicator("MONEDAS", null));
        tbh.addTab(tbh.newTabSpec("MAS").setContent(R.id.tab4Masa).setIndicator("MASA", null));

        btnConvertirLongitud = findViewById(R.id.btnConvertirLongitud);
        btnConvertirLongitud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spn = findViewById(R.id.spnDeLongitud);
                int de = spn.getSelectedItemPosition();

                spn = findViewById(R.id.spnALongitud);
                int a = spn.getSelectedItemPosition();

                tempVal = findViewById(R.id.txtCantidadLongitud);
                double cantidad = Double.parseDouble(tempVal.getText().toString());

                double resp = miObj.convertir(0, de, a, cantidad);
                Toast.makeText(getApplicationContext(), "Respuesta: " + resp, Toast.LENGTH_LONG).show();
            }
        });

        btnConvertirMonedas = findViewById(R.id.btnConvertirMonedas);
        btnConvertirMonedas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spn = findViewById(R.id.spnDeMonedas);
                int de = spn.getSelectedItemPosition();

                spn = findViewById(R.id.spnAMonedas);
                int a = spn.getSelectedItemPosition();

                tempVal = findViewById(R.id.txtCantidadMonedas);
                double cantidad = Double.parseDouble(tempVal.getText().toString());

                double resp = miObj.convertir(1, de, a, cantidad);
                Toast.makeText(getApplicationContext(), "Respuesta: " + resp, Toast.LENGTH_LONG).show();
            }
        });

        btnConvertirMasa = findViewById(R.id.btnConvertirMasa);
        btnConvertirMasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spn = findViewById(R.id.spnDeMasa);
                int de = spn.getSelectedItemPosition();

                spn = findViewById(R.id.spnAMasa);
                int a = spn.getSelectedItemPosition();

                tempVal = findViewById(R.id.txtCantidadMasa);
                double cantidad = Double.parseDouble(tempVal.getText().toString());

                double resp = miObj.convertir(2, de, a, cantidad);
                Toast.makeText(getApplicationContext(), "Respuesta: " + resp, Toast.LENGTH_LONG).show();
            }
        });
    }
}

class conversores {
    double[][] valores = {
            {1, 100, 39.3701, 3.28084, 1.193, 1.09361, 0.001, 0.000621371},
            {1, 17.09, 833.99, 24.63},
            {1, 0.453592, 453592, 453.592, 16, 0.000453592}
    };

    public double convertir(int opcion, int de, int a, double cantidad) {
        return cantidad * valores[opcion][a] / valores[opcion][de];
    }
}
