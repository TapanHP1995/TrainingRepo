package com.reversebits.projects.app.training;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import jp.wasabeef.glide.transformations.CropCircleTransformation;

public class MainActivity extends Activity {

    ImageView imgPic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_tf);




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

        final ImageView imageView=(ImageView)findViewById(R.id.imgPic);


        Glide.with(this).load(R.drawable.download)
                .bitmapTransform(new CropCircleTransformation(this))
                .into((ImageView) findViewById(R.id.imgPic));




    }

}