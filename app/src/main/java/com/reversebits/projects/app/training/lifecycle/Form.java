package com.reversebits.projects.app.training.lifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.reversebits.projects.app.training.R;

public class Form extends AppCompatActivity {
    private static final String TAG = "";
    LinearLayout activity_form;


    int myInt;
    String myString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

       EditText edittext1=(EditText)findViewById(R.id.edittext1);
        EditText edittext2=(EditText)findViewById(R.id.edittext2);


        Intent intent = getIntent();
        String color = intent.getStringExtra("color");
        if (color.equals("1")) {

            LinearLayout layout = (LinearLayout) findViewById(R.id.activity_form);
            layout.setBackgroundResource(R.color.button);


        } else {
            LinearLayout layout = (LinearLayout) findViewById(R.id.activity_form);
            layout.setBackgroundResource(R.color.colorAccent);


        }

//        if (savedInstanceState == null) {
//
//            Intent intent1 = getIntent();
//            myInt = intent1.getIntExtra("MyIntIntentKey", DEFAULT_INT);
//            myString = intent1.getStringExtra("MyStringIntentKey", DEFAULT_STRING);
//
//        } else { // savedInstanceState has saved values
//
//            myInt = savedInstanceState.getInt("MyIntKey");
//            myString = savedInstanceState.getString("MyStringKey");
//        }
//
//    }
//
//
//
//    @Override
//    public void onSaveInstanceState(Bundle savedInstanceState) {
//
//        savedInstanceState.putInt("MyIntKey", myInt);
//        savedInstanceState.putString("MyStringKey", myString);
//
//        super.onSaveInstanceState(savedInstanceState);
//    }

    }



    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        Log.i(TAG, "onSaveInstanceState");

        final EditText textBox =
                (EditText) findViewById(R.id.edittext1);
        CharSequence userText = textBox.getText();
        outState.putCharSequence("savedText", userText);



    }

    @Override
    protected void onRestoreInstanceState(Bundle savedState) {
        super.onRestoreInstanceState(savedState);

        final EditText textBox =
                (EditText) findViewById(R.id.edittext1);

        CharSequence userText =
                savedState.getCharSequence("savedText");

        textBox.setText(userText);
    }
}

