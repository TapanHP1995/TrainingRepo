package com.reversebits.projects.app.training;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.sql.BatchUpdateException;

public class MainActivity extends AppCompatActivity {
    Button button1;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Button button1 = (Button)findViewById(R.id.button1);
                Button button2 = (Button)findViewById(R.id.button2);

                button1.setBackgroundResource(R.drawable.btn_selector);
                button2.setBackgroundResource(R.drawable.btn_simple);

            }
        });

        Button button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Button button2 = (Button)findViewById(R.id.button2);
                Button button1 = (Button)findViewById(R.id.button1);
                button2.setBackgroundResource(R.drawable.btn_selector);
                button1.setBackgroundResource(R.drawable.btn_simple);

            }
        });
    }
}
