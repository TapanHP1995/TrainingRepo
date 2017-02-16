package com.reversebits.projects.app.training.Lifecycle;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.text.Layout;
import android.view.View;
import android.widget.Button;

import com.reversebits.projects.app.training.MainActivity;
import com.reversebits.projects.app.training.R;

/**
 * Created by user on 16-02-2017.
 */

public class SplashScreen extends Activity {

    public static  int SPLASH_TIMEOUT = 3000;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        new Handler().postDelayed(new Runnable() {



            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {

                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(SplashScreen.this, MidClass.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, SPLASH_TIMEOUT);
    }
}
