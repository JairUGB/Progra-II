package com.ugb.controlesbasicos;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TabHost;


public class MainActivity extends AppCompatActivity {
    TextView resultadoTextView;
    EditText metrosConsumidosEditText;
    TabHost tbh;
    TextView tempVal;
    Button calcularButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tbh = findViewById(R.id.tbhTarifa);
        tbh.setup();

        tbh.addTab(tbh.newTabSpec("TAR").setContent(R.id.tab1Tarifa).setIndicator("TARIFA", null));

        resultadoTextView = findViewById(R.id.resultado_text_view);
        metrosConsumidosEditText = findViewById(R.id.metros_consumidos_edit_text);
        calcularButton = findViewById(R.id.calcular_button);

        calcularButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularValorPagar();
            }
        });
    }

    private void calcularValorPagar() {
        String metrosConsumidosStr = metrosConsumidosEditText.getText().toString();
        if (!metrosConsumidosStr.isEmpty()) {
            int metrosConsumidos = Integer.parseInt(metrosConsumidosStr);
            double valorPagar = 0;

            if (metrosConsumidos >= 1 && metrosConsumidos <= 18) {
                valorPagar = 6; // Cuota fija
            } else if (metrosConsumidos >= 19 && metrosConsumidos <= 28) {
                valorPagar = 6 + 0.45 * (metrosConsumidos - 18);
            } else if (metrosConsumidos >= 29) {
                valorPagar = 6 + 0.45 * 10 + 0.65 * (metrosConsumidos - 28);
            }

            resultadoTextView.setText(String.format("Valor a pagar: $%.2f", valorPagar));
        } else {
            resultadoTextView.setText("Por favor ingresa la cantidad de metros consumidos.");
        }
    }
}
