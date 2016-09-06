package com.example.zhuangqf.animationsdemo;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.ImageView;

public class DrawableAnimationActivity extends AppCompatActivity {

    AnimationDrawable animationDrawable;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable_animation);
        ImageView imageView = (ImageView)findViewById(R.id.image_drawable);
        animationDrawable = (AnimationDrawable)imageView.getDrawable();

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            animationDrawable.stop();
            animationDrawable.start();
            return true;
        }
        return super.onTouchEvent(event);
    }

}
