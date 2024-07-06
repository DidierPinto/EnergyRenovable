package com.example.energyrenovable;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText HorasUso;
    private Button Calcular;
    private TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        HorasUso = findViewById(R.id.editTextText);
        Calcular = findViewById(R.id.button);
        Resultado = findViewById(R.id.textView2);

        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcularEnergiaConsumo();
            }
        });
    }
        private void calcularEnergiaConsumo () {
            String HorasUsoStr = HorasUso.getText().toString();

            if (!HorasUsoStr.isEmpty()) {
                int HorasEnUso = Integer.parseInt(HorasUsoStr);

                Electrodomestico electrodomestico = new Electrodomestico("Maquina de coser", 400, 90);
                int consumption = CalculadoraConsumo.calcularConsumoDiario(electrodomestico, HorasEnUso);
                Resultado.setText("Consumo diario: " + consumption + " Wh");
            } else {
                Resultado.setText("Ingrese las horas de uso");
            }
        }
    }
