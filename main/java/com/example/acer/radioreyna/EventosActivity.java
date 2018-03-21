package com.example.acer.radioreyna;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class EventosActivity extends AppCompatActivity {
    ListView listaDatos;
    ArrayList<Datos> Lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventos);
        listaDatos=(ListView)findViewById(R.id.lstDatos);
        Lista=new ArrayList<Datos>();

        Lista.add(new Datos("Gira Radio Reyna",1,R.drawable.event,"Gira"));
        Lista.add(new Datos("Maraton Del Jugete",2,R.drawable.nino,"Dia Del Niño"));
        Lista.add(new Datos("Mexico en la nasa",3,R.drawable.mexico,"Mexico"));
        Lista.add(new Datos("Virgen de la Candelaria",1,R.drawable.imareyna,"Virgen de la Candelaria"));
        Lista.add(new Datos("Ciudades Inteligentes",2,R.drawable.ciudades,"Inteligentes"));
        Lista.add(new Datos("Mensaje Navidad",3,R.drawable.feliz,"Feliz Navidad"));


        Adaptador miadaptador =new Adaptador(getApplicationContext(),Lista);
        listaDatos.setAdapter(miadaptador);

        listaDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Datos obj =(Datos) parent.getItemAtPosition(position);

                Intent paso =new Intent(getApplicationContext(),DeatalleActivity.class);
                paso.putExtra("objeto",(Serializable)obj);
                startActivity(paso);

            }
        });


    }
}
