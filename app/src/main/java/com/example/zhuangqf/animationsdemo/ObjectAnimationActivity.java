package com.example.zhuangqf.animationsdemo;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Interpolator;
import android.widget.ImageView;

public class ObjectAnimationActivity extends AppCompatActivity {

    private ObjectAnimator animator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_animator);

        ImageView imageView = (ImageView)findViewById(R.id.image_property);
        animator = ObjectAnimator.ofFloat(imageView,"alpha",0f,1f);
        animator.setDuration(2000);
        animator.setRepeatCount(ObjectAnimator.INFINITE);
        animator.setRepeatMode(ObjectAnimator.REVERSE);

        animator.setInterpolator(new Interpolator() {
            @Override
            public float getInterpolation(float input) {
                return input * input * input;
            }
        });

        animator.setEvaluator(new TypeEvaluator() {
            @Override
            public Object evaluate(float fraction, Object startValue, Object endValue) {
                return ((float)endValue-(float)startValue)*fraction;
            }
        });
    }

    @Override
    protected void onResume(){
        super.onResume();
        animator.start();
    }

    @Override
    protected void onPause(){
        super.onPause();
        animator.cancel();
    }

}
