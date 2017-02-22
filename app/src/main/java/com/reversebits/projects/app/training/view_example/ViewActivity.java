package com.reversebits.projects.app.training.view_example;

import android.graphics.Typeface;
import android.icu.text.DisplayContext;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.reversebits.projects.app.training.R;

public class ViewActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        textView= (TextView) findViewById(R.id.textview);

//        Typeface typeface=Typeface.createFromAsset(getAssets(),"v.ttf");
//        textView.setTypeface(typeface);
    }
}
