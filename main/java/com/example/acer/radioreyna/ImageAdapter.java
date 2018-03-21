package com.example.acer.radioreyna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by ACER on 16/03/2018.
 */

public class ImageAdapter extends BaseAdapter {

    private Context context;

    public  Integer[] images={
            R.drawable.image6,R.drawable.image1,
            R.drawable.image2,R.drawable.image3,
            R.drawable.image4,R.drawable.images,
            R.drawable.pp,R.drawable.image5,
            R.drawable.sou1,R.drawable.sou2,
            R.drawable.image7,R.drawable.image8


    };

    public ImageAdapter(Context e){

        context=e;
    }


    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {

        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView=new ImageView(context);
        imageView.setImageResource(images[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setLayoutParams(new GridView.LayoutParams(240,240));
        return imageView;
    }
}
