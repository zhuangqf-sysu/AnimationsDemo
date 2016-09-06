package com.example.zhuangqf.animationsdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button)findViewById(R.id.button_view);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ViewAnimationActivity.class);
                startActivity(intent);
            }
        });
        Button button2 = (Button)findViewById(R.id.button_drawable);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,DrawableAnimationActivity.class);
                startActivity(intent);
            }
        });
        Button button3 = (Button)findViewById(R.id.button_value);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ValueAnimatorActivity.class);
                startActivity(intent);
            }
        });
        Button button4 = (Button)findViewById(R.id.button_object);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ObjectAnimationActivity.class);
                startActivity(intent);
            }
        });
        Button button5 = (Button)findViewById(R.id.button_set);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AnimatorSetActivity.class);
                startActivity(intent);
            }
        });
    }
}
