package com.example.aplicativoentrega;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText inputAutor, inputGenero, inputNombre, inputAño;
    TextView txtMostrarResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputAutor = findViewById(R.id.inputAutor);
        inputGenero = findViewById(R.id.inputGenero);
        inputNombre = findViewById(R.id.inputNombre);
        inputAño = findViewById(R.id.inputAño);
        txtMostrarResultado = findViewById(R.id.txtMostrarResultado);
    }

    public void enviarData(View view) {
        String autor = inputAutor.getText().toString();
        String genero = inputGenero.getText().toString();
        String nombre = inputNombre.getText().toString();
        String año = inputAño.getText().toString();

        aplicativoEntrega aplicativoEntrega1 = new aplicativoEntrega(autor, genero, nombre, año);

        Toast.makeText(this, "BUSQUEDA EXITOSA", Toast.LENGTH_LONG).show();

        String resultadoText = aplicativoEntrega1.autor + " " + aplicativoEntrega1.genero +
                " " + aplicativoEntrega1.nombre + " " + aplicativoEntrega1.año;

        txtMostrarResultado.setText(resultadoText);
    }
}

