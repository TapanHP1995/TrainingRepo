package com.reversebits.projects.app.training.Lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import android.util.Log;

import com.reversebits.projects.app.training.R;

/**
 * Created by Dhruvin on 13-02-2017.
 */


public class ActivityLife extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Activity is created", Toast.LENGTH_SHORT).show();
        Log.i("onCreate():","Activity is created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Activity is started", Toast.LENGTH_SHORT).show();
        Log.i("onStart():","Activity started");
    }

    @Override
    protected void onRestart() {

        super.onRestart();
        Toast.makeText(this, "Activity is Restarted", Toast.LENGTH_SHORT).show();
        Log.i("onRestart():","Activity Restarted");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Activity is Resumed", Toast.LENGTH_SHORT).show();
        Log.i("onResume():","Activity Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Activity is Paused", Toast.LENGTH_SHORT).show();
        Log.i("onPause():","Activity paused");
    }

    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        super.onStop();
        Toast.makeText(this, "Activity is Stopped", Toast.LENGTH_SHORT).show();
        Log.i("onStop():","Activity stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Activity is Destroyed", Toast.LENGTH_SHORT).show();
        Log.i("onDestroy():","Activity destroyed");
    }

}