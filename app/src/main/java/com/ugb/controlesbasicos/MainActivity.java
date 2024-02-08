package com.ugb.controlesbasicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tempVal;
    Button btn;
    RadioGroup opt;
    Spinner spn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btnCalcular);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tempVal = findViewById(R.id.txtnum1);
                double num1 = Double.parseDouble(tempVal.getText().toString());

                tempVal = findViewById(R.id.txtnum2);
                double num2 = Double.parseDouble(tempVal.getText().toString());

                double respuesta = 0;
                opt = findViewById(R.id.optOpciones);
                switch (opt.getCheckedRadioButtonId()){
                    case R.id.optSuma:
                        respuesta = num1+num2;
                        break;
                    case R.id.optResta:
                        respuesta=num1-num2;
                        break;
                    case R.id.optMultiplicacion:
                        respuesta=num1*num2;
                        break;
                    case R.id.optDivision:
                        respuesta=num1/num2;
                        break;

                }
                spn = findViewById(R.id.spnOpciones);
                switch (spn.getSelectedItemPosition()){
                    case 0:
                        respuesta = num1 + num2;
                        break;
                    case 1:
                        respuesta = num1 - num2;
                        break;
                    case 2:
                        respuesta = num1 * num2;
                        break;
                    case 3:
                        respuesta = num1 / num2;
                        break;
                    case 4:
                        respuesta = (num1 * num2) / 100;
                        break;
                    case 5:
                        respuesta = Math.pow(num1, num2);
                        break;
                    case 6:
                        int n = (int) num1;
                        int fact = 1;
                        for (int i = 1; i <= n; i++) {
                            fact *= i;
                        }
                        respuesta = fact;
                        break;
                    case 7:

                        /*respuesta = Math.sqrt(num1);*/

                        double x = num1;
                        double y = 1;
                        double e = 0.000001;
                        while (x - y > e) {
                            x = (x + y) / 2;
                            y = num1 / x;
                        }
                        respuesta = x;
                        break;

                }
                tempVal = findViewById(R.id.lblrespuesta);
                tempVal.setText("Respuesta: "+ respuesta);
            }
        });
    }
}