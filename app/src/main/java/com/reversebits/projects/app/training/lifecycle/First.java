package com.reversebits.projects.app.training.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.reversebits.projects.app.training.R;

import static com.reversebits.projects.app.training.R.layout.activity_first;

public class First extends AppCompatActivity {

    Button button1;
    Button button2;
    Button button3;
    LinearLayout activity_main;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_first);

        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        final LinearLayout layout =(LinearLayout)findViewById(R.id.activity_first);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(First.this, Form.class);
                intent.putExtra("color","1");

                startActivity(intent);


            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(First.this, Form.class);
                intent.putExtra("color","2");

                startActivity(intent);


            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(First.this, Form.class);
                intent.putExtra("color","3");

                startActivity(intent);



                layout.setBackgroundResource(R.color.button);

            }
        });








    }
}
