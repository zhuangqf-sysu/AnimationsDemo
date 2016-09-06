package com.example.zhuangqf.animationsdemo;

import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ValueAnimatorActivity extends AppCompatActivity {

    private ImageView imageView;
    private ValueAnimator valueAnimator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_animator);
        imageView = (ImageView) findViewById(R.id.image_property);

        valueAnimator = ValueAnimator.ofInt(0,1000);
        valueAnimator.setDuration(3000);
        valueAnimator.setTarget(imageView);
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                int alpha = (int) animation.getAnimatedValue();
                imageView.setAlpha(alpha);
            }
        });
        valueAnimator.setRepeatCount(ValueAnimator.INFINITE);
        valueAnimator.setRepeatMode(ValueAnimator.REVERSE);
    }

    @Override
    protected void onResume(){
        super.onResume();
        valueAnimator.start();
    }

    @Override
    protected void onPause(){
        super.onPause();
        valueAnimator.cancel();
    }
}
