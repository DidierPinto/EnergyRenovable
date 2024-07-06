package com.example.energyrenovable;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SunyPower extends AppCompatActivity {
    private User usuario;
    private TextView validarUsuario;
    private TextView validarSalida;
    private Button volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_suny_power);

        validarUsuario = findViewById(R.id.textViewUsernameValue);
        validarSalida = findViewById(R.id.textViewCurrentPowerOutput);
        volver = findViewById(R.id.button3);

        SolarPanelSystem solarPanelsystem = new SolarPanelSystem(100.0, 90.0);
        usuario = new User("User1",solarPanelsystem);
        updateUI();

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent back = new Intent(SunyPower.this,MainActivity.class);
                startActivity(back);
            }
        });
    }
    private void updateUI() {
        validarUsuario.setText(usuario.username);
        validarSalida.setText(String.format("%.2f kW", usuario.getSolarPanelSystem().getCurrentPowerOutput()));
    }
}

