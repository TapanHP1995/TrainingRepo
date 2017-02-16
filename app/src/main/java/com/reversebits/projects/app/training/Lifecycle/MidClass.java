package com.reversebits.projects.app.training.Lifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.reversebits.projects.app.training.MainActivity;
import com.reversebits.projects.app.training.R;

/**
 * Created by user on 16-02-2017.
 */

public class MidClass extends Activity {


    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);

        final Button btn1 = (Button)findViewById(R.id.btn1);
        final Button btn2 = (Button)findViewById(R.id.btn2);
        final Button btn3 = (Button)findViewById(R.id.btn3);

        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent i = new Intent(MidClass.this, MainActivity.class);
                i.putExtra("color",1);
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent i = new Intent(MidClass.this, MainActivity.class);
                i.putExtra("color",2);
                startActivity(i);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent i = new Intent(MidClass.this, MainActivity.class);
                i.putExtra("color",3);
                startActivity(i);
            }
        });
    }
}

