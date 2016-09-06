package com.example.zhuangqf.animationsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

public class ViewAnimationActivity extends AppCompatActivity {

     private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_animation);

        imageView = (ImageView) findViewById(R.id.image_view);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation myViewAnimation = AnimationUtils.loadAnimation(v.getContext(),R.anim.anim_my);
                imageView.startAnimation(myViewAnimation);
            }
        });
    }
    @Override
    protected void onResume(){
        super.onResume();
        Animation alphaAnimation = new AlphaAnimation(0.0f,0.1f);
        alphaAnimation.setDuration(3000);
        Animation translateAnimation = new TranslateAnimation(-1000,0,0,1000);
        translateAnimation.setDuration(3000);
        Animation scaleAnimation = new ScaleAnimation(0f,1.0f,0,1.0f);
        scaleAnimation.setDuration(3000);
        Animation rotateAnimation = new RotateAnimation(0,360);
        rotateAnimation.setDuration(3000);
        imageView.startAnimation(alphaAnimation);
        imageView.startAnimation(translateAnimation);
        imageView.startAnimation(scaleAnimation);
        imageView.startAnimation(rotateAnimation);
    }

}
