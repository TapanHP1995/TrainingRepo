package com.reversebits.projects.app.training.life_cycle;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.reversebits.projects.app.training.R;
import com.reversebits.projects.app.training.view_example.ViewActivity;

public class LifeCycle1 extends AppCompatActivity {
    EditText etFirstName, etLastName;
    LinearLayout lineLifeCycle;
    Button btnSubmit;
    static final String FIRST_NAME = "vidhi";
    static final String LAST_NAME = "bhut";
    public static String COLOR_VAL = "colorVal";
//    String value1=etFirstName.getText().toString();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle1);

        etFirstName = (EditText) findViewById(R.id.etFirstName);
        etLastName = (EditText) findViewById(R.id.etLastName);
        btnSubmit= (Button) findViewById(R.id.btnSubmit);


        lineLifeCycle = (LinearLayout) findViewById(R.id.lineLifeCycle);

        Intent intent = getIntent();
        int col = intent.getIntExtra(COLOR_VAL, 0);

        Log.e("color", "" + col);


        if (col == 1) {
            lineLifeCycle.setBackgroundResource(R.color.red);
        } else if (col == 2) {
            lineLifeCycle.setBackgroundResource(R.color.yellow);
        } else {
            lineLifeCycle.setBackgroundResource(R.color.green);
        }

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent1=new Intent(LifeCycle1.this, ViewActivity.class);
//                startActivity(intent1);
                ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(btnSubmit, "alpha", 0.2f);
                objectAnimator.setDuration(5000);
                objectAnimator.start();
            }
        });

    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        final EditText textBox =
                (EditText) findViewById(R.id.etFirstName);
        CharSequence userText = textBox.getText();
        outState.putCharSequence("savedText", userText);

        final EditText textBox1 =
                (EditText) findViewById(R.id.etLastName);
        CharSequence userText1 = textBox1.getText();
        outState.putCharSequence("savedText1", userText1);
    }
    @Override
    protected void onRestoreInstanceState(Bundle savedState) {
        super.onRestoreInstanceState(savedState);
        final EditText textBox =
                (EditText) findViewById(R.id.etFirstName);
        CharSequence userText =
                savedState.getCharSequence("savedText");
        textBox.setText(userText);

        final EditText textBox1 =
                (EditText) findViewById(R.id.etLastName);
        CharSequence userText1 =
                savedState.getCharSequence("savedText1");
        textBox1.setText(userText1);


    }


}
