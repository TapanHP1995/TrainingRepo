package com.reversebits.projects.app.training.context_demo;


import android.app.LauncherActivity;
import android.content.Intent;
import android.content.pm.LauncherActivityInfo;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.reversebits.projects.app.training.MainActivity;
import com.reversebits.projects.app.training.R;


/*
 * Created by TapanHP on 2/12/2017.
*/

public class ContextExmpl extends AppCompatActivity implements View.OnClickListener {

    private Button btFake;
    private RecyclerView rvMain;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_context);

        btFake = (Button) findViewById(R.id.bt_main_fake);

        btFake.setText(getResources().getString(R.string.fake_button));

        rvMain = (RecyclerView) findViewById(R.id.rv_main);
        rvMain.setLayoutManager(new LinearLayoutManager(this)); //Here ok to pass this as it's inside activity itself

        btFake.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //here anonymous inner [http://www.javatpoint.com/anonymous-inner-class] class can't take this as context
                /*
                * every view has context to where it is attached, that's why they have provided View object as
                * parameter of onClick method
                *
                * or you can always get context by activity name : ContextExmpl.this
                *
                * Rule : If you wanna do something that is not affecting whole application or not related to whole application
                * use Activity context
                *
                * Another thing, if you really want to avoid this then implement Method on whole activity, use that
                *
                */

                rvMain.setAdapter(new MainAdapter(ContextExmpl.this));

                startActivity(new Intent(v.getContext(), MainActivity.class)); //ContextExmpl.this || v.getContext()
                /* as activities needs reference to previous activities */

                startActivity(new Intent(ContextExmpl.this, MainActivity.class).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)); //getApplicationContext()

                /*here it's ok to pass either activity or application context,
                 Toast is not attached to window or activity lifecycle */

                Toast.makeText(ContextExmpl.this, "here Button Pressed.....", Toast.LENGTH_LONG).show();
            }
        });
    }


    //another way to get things done by passing this and imlements listner here
    @Override
    public void onClick(View v) {
        startActivity(new Intent(this, MainActivity.class));
    }
}

