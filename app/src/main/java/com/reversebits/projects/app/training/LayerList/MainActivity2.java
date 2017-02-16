package com.reversebits.projects.app.training.LayerList;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.reversebits.projects.app.training.R;

public class MainActivity2 extends AppCompatActivity {
    Button button1;
    Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_2);
        button1 = (Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                button1.setBackgroundResource(R.drawable.btn_color);
                button2.setBackgroundResource(R.drawable.simple);

            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Button button2 = (Button)findViewById(R.id.button2);
                button2.setBackgroundResource(R.drawable.btn_color);
                button1.setBackgroundResource(R.drawable.simple);

            }
        });
    }
}