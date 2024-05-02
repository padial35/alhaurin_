package com.example.alhaurin;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.Button;
import android.widget.TextView; // Agregamos la importación de TextView
import android.widget.Toast; // Agregamos la importación de Toast

public class MainActivity extends AppCompatActivity {
    private Button botonRegistro;
    private String textUsuario; // Cambiamos el nombre de la variable de texto a textUsuario
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        botonRegistro = findViewById(R.id.button_Registro);
        botonRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                TextView textView_TextUsuario = findViewById(R.id.textView_TextUsuario);
                textUsuario = textView_TextUsuario.getText().toString();
                if (textUsuario.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Inserte un valor válido", Toast.LENGTH_SHORT).show();
                } else {
                    // aqui pondriamos si el texto es correcto o no
                }


                Intent intent = new Intent(MainActivity.this, registro1.class);
                startActivity(intent);
            }
        });
    }
}
