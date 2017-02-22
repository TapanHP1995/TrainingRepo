package com.reversebits.projects.app.training.life_cycle;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.reversebits.projects.app.training.R;

public class ButtonActivity extends AppCompatActivity {
    Button btnRed, btnYellow, btnGreen;
    ImageView ivBackground;
    TextView tvHello;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        btnRed = (Button) findViewById(R.id.btnRed);
        btnYellow = (Button) findViewById(R.id.btnYellow);
        btnGreen = (Button) findViewById(R.id.btnGreen);
        ivBackground= (ImageView) findViewById(R.id.ivBackground);
        tvHello= (TextView) findViewById(R.id.tvHello);


        ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(tvHello, "rotation", 360f,0f);
        objectAnimator.setDuration(3000);
        ObjectAnimator scaleDownX = ObjectAnimator.ofFloat(tvHello, "scaleX", 2.5f);
        ObjectAnimator scaleDownY = ObjectAnimator.ofFloat(tvHello, "scaleY", 2.5f);
        scaleDownY.setDuration(3000);
        AnimatorSet scaleDown = new AnimatorSet();
        scaleDown.setInterpolator(new AnticipateInterpolator());
        scaleDown.play(objectAnimator).with(scaleDownY).with(scaleDownX);
        scaleDown.start();
        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ObjectAnimator objectAnimator = ObjectAnimator.ofFloat(btnRed, "rotation", 360f,0f);
                objectAnimator.setDuration(3000);
                objectAnimator.start();
//                Intent i1 = new Intent(ButtonActivity.this, LifeCycle1.class);
//                i1.putExtra(LifeCycle1.COLOR_VAL, 1);
//                startActivity(i1);
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
