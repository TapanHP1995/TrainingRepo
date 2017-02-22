package com.reversebits.projects.app.training;

import android.app.Activity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

public class MainActivity extends Activity {

    ImageView imgPic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_tf);
        imgPic=(ImageView)findViewById(R.id.imgPic);


        RotateAnimation anim = new RotateAnimation(0f, 350f, 15f, 15f);
        // Step 2:  Set the Animation properties
        anim.setInterpolator(new LinearInterpolator());
        anim.setRepeatCount(Animation.INFINITE);
        anim.setDuration(700);

        // Step 3: Start animating the image
        imgPic.startAnimation(anim);

        // Later. if you want to  stop the animation
        // image.setAnimation(null);




//        Thread timeThread=new Thread(){
//            public void run(){
//
//                try {
//                    sleep(2000);
//                }
//                catch (InterruptedException e){
//                    e.printStackTrace();
//                }finally {
//                    Intent intent=new Intent(MainActivity.this,First.class);
//                    startActivity(intent);
//                }
//            }
//        };
//
//        timeThread.start();
//    }
//    @Override
//    protected void onPause(){
//        super.onPause();
//        finish();
//    }

//        final ImageView imageView=(ImageView)findViewById(R.id.imgPic);
//
//
//        Glide.with(this).load(R.drawable.download)
//                .bitmapTransform(new CropCircleTransformation(this))
//                .into((ImageView) findViewById(R.id.imgPic));









    }

}