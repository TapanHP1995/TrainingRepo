package com.reversebits.projects.app.training;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText preEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText etGmail=(EditText)findViewById(R.id.edGmail);

        etGmail.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (hasFocus) {
                    etGmail.setGravity(Gravity.LEFT);
                    if(etGmail.getText().length()==0)
                    {
                        etGmail.setHint("");
                    }
                } else {
                    etGmail.setHint("@gmail.com");

                    if (etGmail.getText().length() > 0) {
                        etGmail.setGravity(Gravity.LEFT);

                        etGmail.setHint("");


                    } else
                        etGmail.setGravity(Gravity.RIGHT);
                }
            }

        });

        Spinner spinner = (Spinner) findViewById(R.id.spinner_flag);

        // Spinner click listener


        // Spinner Drop down elements
        List<Integer> categories = new ArrayList<>();
        categories.add(R.drawable.india);
        categories.add(R.drawable.india);
        categories.add(R.drawable.india);
        categories.add(R.drawable.india);
        categories.add(R.drawable.india);

//        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);
//
//        // Drop down layout style - list view with radio button
//        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
//
//        // attaching data adapter to spinner
//        spinner.setAdapter(dataAdapter);
        preEditText=(EditText)findViewById(R.id.preEditText);
        preEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                String prefix = "+91 ";

                String currentString = editable.toString();

                if (!currentString.startsWith(prefix)) {
                    preEditText.setText(prefix);
                    preEditText.setSelection(prefix.length());
                }
            }
        });
    }
}
