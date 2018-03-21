package com.example.acer.radioreyna;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class FullmageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullmage);


        Intent intent = getIntent();

        int position = intent.getExtras().getInt("id");
        ImageAdapter adapter=new ImageAdapter(this);

        ImageView imageView=(ImageView)findViewById(R.id.imageView);
        imageView.setImageResource(adapter.images[position]);
    }
}
