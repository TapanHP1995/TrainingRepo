package com.reversebits.projects.app.training;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.CountDownTimer;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.reversebits.projects.app.training.lifecycle.First;

import java.sql.BatchUpdateException;
public class MainActivity extends Activity {

    // Splash screen timer
    private static int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lifecycle);

        Thread timeThread=new Thread(){
            public void run(){

                try {
                    sleep(2000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent intent=new Intent(MainActivity.this,First.class);
                    startActivity(intent);
                }
            }
        };

        timeThread.start();
    }
    @Override
    protected void onPause(){
        super.onPause();
        finish();
    }
}