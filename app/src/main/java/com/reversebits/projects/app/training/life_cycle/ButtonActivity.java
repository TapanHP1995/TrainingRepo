package com.reversebits.projects.app.training.life_cycle;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.reversebits.projects.app.training.R;

public class ButtonActivity extends AppCompatActivity {
    Button btnRed, btnYellow, btnGreen;
    LinearLayout activity_button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        btnRed = (Button) findViewById(R.id.btnRed);
        btnYellow = (Button) findViewById(R.id.btnYellow);
        btnGreen = (Button) findViewById(R.id.btnGreen);

        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(ButtonActivity.this, LifeCycle1.class);
                i1.putExtra(LifeCycle1.COLOR_VAL, 1);
                startActivity(i1);
            }
        });

        btnYellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(ButtonActivity.this, LifeCycle1.class);
                i2.putExtra(LifeCycle1.COLOR_VAL, 2);
                startActivity(i2);
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 = new Intent(ButtonActivity.this, LifeCycle1.class);
                i3.putExtra(LifeCycle1.COLOR_VAL, 3);
                startActivity(i3);
            }
        });

    }


}
