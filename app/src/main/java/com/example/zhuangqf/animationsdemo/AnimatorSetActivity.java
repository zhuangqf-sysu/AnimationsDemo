package com.example.zhuangqf.animationsdemo;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class AnimatorSetActivity extends AppCompatActivity {

    private ObjectAnimator animator1;
    private ObjectAnimator animator2;
    private ObjectAnimator animator3;
    private ObjectAnimator animator4;
    private ObjectAnimator animator5;

    private AnimatorSet animatorSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property_animator);

        ImageView imageView = (ImageView)findViewById(R.id.image_property);

        animator1 = ObjectAnimator.ofFloat(imageView,"alpha",0f,1f);
        animator1.setDuration(3000);

        animator2 = ObjectAnimator.ofFloat(imageView, "scaleX", 0f,1f);
        animator2.setDuration(3000);

        animator3 = ObjectAnimator.ofFloat(imageView,"alpha",1f,0f);
        animator3.setDuration(3000);

        animator4 = ObjectAnimator.ofFloat(imageView, "scaleX",1f,0f);
        animator4.setDuration(3000);

        animator5 = ObjectAnimator.ofFloat(imageView,"scaleX",0f,-1f);
        animator1.setDuration(3000);

        animatorSet = new AnimatorSet();
        animatorSet.play(animator2).with(animator1);
        animatorSet.play(animator4).with(animator3).after(animator2);
        animatorSet.play(animator5).with(animator1).after(animator4);

    }

    @Override
    protected void onResume(){
        super.onResume();
        animatorSet.start();
    }
}
