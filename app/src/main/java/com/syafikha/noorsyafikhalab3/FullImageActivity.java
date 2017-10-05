package com.syafikha.noorsyafikhalab3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by Acer on 10/5/2017.
 */

public class FullImageActivity extends Activity {

    public void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_image);
        Intent i=getIntent();

        int position= i.getExtras().getInt("id");
        ImageAdapter imageAdapter= new ImageAdapter(this);

        ImageView imageView=(ImageView) findViewById(R.id.full_image);
        imageView.setImageResource(imageAdapter.mThumbsIds[position]);

    }
}
