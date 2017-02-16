package com.reversebits.projects.app.training.life_cycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.reversebits.projects.app.training.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

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


