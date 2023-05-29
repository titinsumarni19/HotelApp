package com.titinsumarni202102246.hotelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private ImageView _imageView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _imageView1 = (ImageView) findViewById(R.id.imageView1);

        String imageUrl = "https://assets.hyatt.com/content/dam/hyatt/hyattdam/images/2019/07/22/1618/Hyatt-Regency-Kuantan-P206-Sampan-Bar.jpg/Hyatt-Regency-Kuantan-P206-Sampan-Bar.4x3.jpg?imwidth=1280";
        Picasso.with(this).load(imageUrl).into(_imageView1);
    }
}