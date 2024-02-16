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
    Button btnConvertirAlmacenamiento;
    Button btnConvertirMonedas;
    Button btnConvertirMasa;
    Button btnConvertirVolumen;
    Button btnConvertirTiempo;
    Button btnConvertirTransferenciaDeDatos;
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
        tbh.addTab(tbh.newTabSpec("VOL").setContent(R.id.tab5Volumen).setIndicator("VOLUMEN", null));
        tbh.addTab(tbh.newTabSpec("TIE").setContent(R.id.tab6Tiempo).setIndicator("TIEMPO", null));
        tbh.addTab(tbh.newTabSpec("TRA").setContent(R.id.tab7TransferenciaDeDatos).setIndicator("TRANSFERENCIA DE DATOS", null));

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

        btnConvertirAlmacenamiento = findViewById(R.id.btnConvertirAlmacenamiento);
        btnConvertirAlmacenamiento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spn = findViewById(R.id.spnDeAlmacenamiento);
                int de = spn.getSelectedItemPosition();

                spn = findViewById(R.id.spnAAlmacenamiento);
                int a = spn.getSelectedItemPosition();

                tempVal = findViewById(R.id.txtCantidadAlmacenamiento);
                double cantidad = Double.parseDouble(tempVal.getText().toString());

                double resp = miObj.convertir(1, de, a, cantidad);
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

                double resp = miObj.convertir(2, de, a, cantidad);
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

                double resp = miObj.convertir(3, de, a, cantidad);
                Toast.makeText(getApplicationContext(), "Respuesta: " + resp, Toast.LENGTH_LONG).show();
            }
        });

        btnConvertirVolumen = findViewById(R.id.btnConvertirVolumen);
        btnConvertirVolumen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spn = findViewById(R.id.spnDeVolumen);
                int de = spn.getSelectedItemPosition();

                spn = findViewById(R.id.spnAVolumen);
                int a = spn.getSelectedItemPosition();

                tempVal = findViewById(R.id.txtCantidadVolumen);
                double cantidad = Double.parseDouble(tempVal.getText().toString());

                double resp = miObj.convertir(4, de, a, cantidad);
                Toast.makeText(getApplicationContext(), "Respuesta: " + resp, Toast.LENGTH_LONG).show();
            }
        });

        btnConvertirTiempo = findViewById(R.id.btnConvertirTiempo);
        btnConvertirTiempo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spn = findViewById(R.id.spnDeTiempo);
                int de = spn.getSelectedItemPosition();

                spn = findViewById(R.id.spnATiempo);
                int a = spn.getSelectedItemPosition();

                tempVal = findViewById(R.id.txtCantidadTiempo);
                double cantidad = Double.parseDouble(tempVal.getText().toString());

                double resp = miObj.convertir(5, de, a, cantidad);
                Toast.makeText(getApplicationContext(), "Respuesta: " + resp, Toast.LENGTH_LONG).show();
            }
        });

        btnConvertirTransferenciaDeDatos = findViewById(R.id.btnConvertirTransferenciaDeDatos);
        btnConvertirTransferenciaDeDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                spn = findViewById(R.id.spnDeTransferenciaDeDatos);
                int de = spn.getSelectedItemPosition();

                spn = findViewById(R.id.spnATransferenciaDeDatos);
                int a = spn.getSelectedItemPosition();

                tempVal = findViewById(R.id.txtCantidadTransferenciaDeDatos);
                double cantidad = Double.parseDouble(tempVal.getText().toString());

                double resp = miObj.convertir(6, de, a, cantidad);
                Toast.makeText(getApplicationContext(), "Respuesta: " + resp, Toast.LENGTH_LONG).show();
            }
        });

    }
}

class conversores {
    double[][] valores = {
            {1, 100, 39.3701, 3.28084, 1.193, 1.09361, 0.001, 0.000621371},
            {1, 0.001, 0.00000001, 0.000000001},
            {1, 17.09, 833.99, 24.63},
            {1, 1000, 1e+9, 1e+6, 35274, 2204.62},
            {1, 1000, 0.264172, 1.05669},
            {1, 60, 3600,  3600002.88},
            {1, 1000, 1e+6},
    };

    public double convertir(int opcion, int de, int a, double cantidad){
        return valores[opcion][a]/valores[opcion][de]*cantidad;
    }
}
