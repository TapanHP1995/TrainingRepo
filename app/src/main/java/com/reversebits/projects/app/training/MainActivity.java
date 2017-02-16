package com.reversebits.projects.app.training;


import java.util.ArrayList;
import java.util.List;
import android.app.LauncherActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        final EditText edi = (EditText) findViewById(R.id.edi);
        final EditText first = (EditText) findViewById(R.id.first);
        final EditText last = (EditText) findViewById(R.id.last);

        LinearLayout Main = (LinearLayout) findViewById(R.id.activity_main);

        Intent intent = getIntent();
        int col = intent.getIntExtra("color",0);

        Log.e("color", "onCreate: "+ col );

        if(col==1){
            Main.setBackgroundResource(R.color.red);
        }else if(col==2){
            Main.setBackgroundResource(R.color.yellow);
        }else{
            Main.setBackgroundResource(R.color.green);
        }

        edi.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean hasFocus) {
                if (hasFocus) {
                    edi.setGravity(Gravity.LEFT);
                    if(edi.getText().length()==0) {
                        edi.setHint("");
                    }
                } else {
                    edi.setHint("@gmail.com");

                    if (edi.getText().length() > 0) {
                        edi.setGravity(Gravity.LEFT);
                        edi.setHint("");
                    } else {
                        edi.setGravity(Gravity.RIGHT);
                    }
                }
            }
        });


        spinner.setOnItemSelectedListener(this);

        List<String> categories = new ArrayList<String>();
        categories.add("Male");
        categories.add("Female");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(dataAdapter);

    }
    protected void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
    }
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
    }

    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String item = parent.getItemAtPosition(position).toString();
    }

    public void onNothingSelected(AdapterView<?> arg0) {

    }
}
