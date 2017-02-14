package com.reversebits.projects.app.training;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText preEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
