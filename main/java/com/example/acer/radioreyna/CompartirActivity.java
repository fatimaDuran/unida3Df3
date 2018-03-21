package com.example.acer.radioreyna;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CompartirActivity extends AppCompatActivity {

    private Button buttonCompartir,buttonface,buttontuiter,buttonwuast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compartir);


        buttonCompartir=(Button) findViewById(R.id.buttonShare);

        buttonCompartir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "Radio Reyna http://radioreyna.net/Inicio");
                startActivity(Intent.createChooser(intent,"share with"));


            }
        });
    }
}
