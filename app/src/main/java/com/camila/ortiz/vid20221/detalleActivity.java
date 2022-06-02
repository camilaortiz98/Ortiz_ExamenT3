package com.camila.ortiz.vid20221;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class detalleActivity extends AppCompatActivity {

    ImageView imageView;
    TextView nombre, tipo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        imageView = findViewById(R.id.imageView);
        nombre = findViewById(R.id.nombre_detalle);
        tipo = findViewById(R.id.tipo_detalle);

        libro libro = (libro) getIntent().getSerializableExtra("libro");

        nombre.setText(libro.getTitulo());
        tipo.setText(libro.getResumen());

        Picasso.get()
                .load("https://sm.ign.com/ign_es/tv/j/juego-de-t/juego-de-tronos_d4p4.png")
                .into(imageView);

    }
}