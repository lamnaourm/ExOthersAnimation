package com.example.exothersanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        im = findViewById(R.id.img);
    }

    public void anim1(View view) {
        AlphaAnimation an = new AlphaAnimation(1f,0f);
        an.setDuration(5000);
        an.setFillAfter(true);

        im.startAnimation(an);
    }

    public void anim2(View view) {
        AlphaAnimation an = new AlphaAnimation(0f,1f);
        an.setDuration(5000);
        an.setFillAfter(true);

        im.startAnimation(an);
    }

    public void zoom1(View view) {
        ScaleAnimation an = new ScaleAnimation(0.25f,1.5f,0.25f,1.5f);
        an.setDuration(5000);
        an.setFillAfter(true);

        im.startAnimation(an);
    }

    public void trans1(View view) {
        TranslateAnimation an = new TranslateAnimation(0f,200f,0f,0f);
        an.setDuration(5000);
        an.setFillAfter(true);

        im.startAnimation(an);
    }
}