package com.example.acer.radioreyna;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DeatalleActivity extends AppCompatActivity {
    ImageView foto;
    TextView titulo;
    TextView detalle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deatalle);

        foto=(ImageView) findViewById(R.id.imagFoto);
        titulo=(TextView) findViewById(R.id.textTitulo);
        detalle=(TextView) findViewById(R.id.textDetalle);

        Datos obj =(Datos) getIntent().getExtras().getSerializable("objeto");

        titulo.setText(obj.getTitulo());
        detalle.setText(obj.getDetalle());
        foto.setImageResource(obj.getImagen());
    }
}
