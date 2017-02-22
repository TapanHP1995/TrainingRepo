package com.reversebits.projects.app.training.life_cycle;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.reversebits.projects.app.training.R;

public class SplashActivity extends AppCompatActivity {

    private TextView tvDemo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        tvDemo= (TextView) findViewById(R.id.tvDemo);

        ObjectAnimator scaleDownX = ObjectAnimator.ofFloat(tvDemo, "scaleX", 0.5f);
        ObjectAnimator scaleDownY = ObjectAnimator.ofFloat(tvDemo, "scaleY", 0.5f);
        scaleDownY.setDuration(3000);
        AnimatorSet scaleDown = new AnimatorSet();
        scaleDown.play(scaleDownX).with(scaleDownY);
        scaleDown.start();


        Thread timeThread=new Thread(){
            public void run(){

                try {
                    sleep(2000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent intent=new Intent(SplashActivity.this,ButtonActivity.class);
                    startActivity(intent);
                    finish();

                }
            }
        };

        timeThread.start();
    }
    @Override
    protected void onPause(){
        super.onPause();


    }
}


