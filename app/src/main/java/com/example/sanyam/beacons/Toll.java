package com.example.sanyam.beacons;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

import pl.droidsonroids.gif.GifTextView;

public class Toll extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toll);

        GifTextView v = (GifTextView) findViewById(R.id.view);
        final GifTextView v1 = (GifTextView) findViewById(R.id.view2);
        final GifTextView v2 = (GifTextView) findViewById(R.id.view3);

        //final TextView tv1 = (TextView) findViewById(R.id.textView);
        final TextView tv2 = (TextView) findViewById(R.id.textView2);
        final TextView tv3 = (TextView) findViewById(R.id.textView3);
        final TextView tv4 = (TextView) findViewById(R.id.textView4);
        final TextView tv5 = (TextView) findViewById(R.id.textView5);
        final TextView tv6 = (TextView) findViewById(R.id.textView6);


        v.setVisibility(View.VISIBLE);

        //ImageView imgv1 = (ImageView) findViewById(R.id.cool);

//        tv1.setVisibility(View.INVISIBLE);
//        new Handler().postDelayed(new Runnable(){
//            public void run() {
//                tv1.setVisibility(View.VISIBLE);
//            }
//        }, 1000);

        //ImageView iv = (ImageView)findViewById(R.id.imageView2);
        //iv.setImageResource(R.drawable.tollpic);







        // bool beaconIdentifier

        //==============================================================
        //==============================================================
        //==============================================================
        /*
        if( beaconIdentifier == false )
        {
            v2.setVisibility(View.VISIBLE);
            new Handler().postDelayed(new Runnable(){
                public void run() {
                    v2.setVisibility(View.INVISIBLE);
                }
            }, 2000);

            tv6.setVisibility(View.VISIBLE);
            new Handler().postDelayed(new Runnable(){
                public void run() {
                    tv6.setVisibility(View.INVISIBLE);
                }
            }, 2000);
        }
        else
        {
            tv2.setVisibility(View.INVISIBLE);
            new Handler().postDelayed(new Runnable(){
                public void run() {
                    tv2.setVisibility(View.VISIBLE);
                }
            }, 2000);

            tv3.setVisibility(View.INVISIBLE);
            new Handler().postDelayed(new Runnable(){
                public void run() {
                    tv3.setVisibility(View.VISIBLE);
                }
            }, 2000);

            tv4.setVisibility(View.INVISIBLE);
            new Handler().postDelayed(new Runnable(){
                public void run() {
                    tv4.setVisibility(View.VISIBLE);
                }
            }, 2000);

            tv5.setVisibility(View.INVISIBLE);
            new Handler().postDelayed(new Runnable(){
                public void run() {
                    tv5.setVisibility(View.VISIBLE);
                }
            }, 2000);

            v1.setVisibility(View.INVISIBLE);
            new Handler().postDelayed(new Runnable(){
                public void run() {
                    v1.setVisibility(View.VISIBLE);
                }
            }, 2000);
        }
        */
        //==============================================================
        //==============================================================
        //==============================================================








//        InputStream stream = null;
//        try {
//            stream = getAssets().open("piggy.gif");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        GifWebView view = new GifWebView(this, "file:///android_asset    /piggy.gif");
//
//        setContentView(view);





        v2.setVisibility(View.VISIBLE);
        new Handler().postDelayed(new Runnable(){
            public void run() {
                v2.setVisibility(View.INVISIBLE);
            }
        }, 2000);

        tv6.setVisibility(View.VISIBLE);
        new Handler().postDelayed(new Runnable(){
            public void run() {
                tv6.setVisibility(View.INVISIBLE);
            }
        }, 2000);

        tv2.setVisibility(View.INVISIBLE);
        new Handler().postDelayed(new Runnable(){
            public void run() {
                tv2.setVisibility(View.VISIBLE);
            }
        }, 2000);

        tv3.setVisibility(View.INVISIBLE);
        new Handler().postDelayed(new Runnable(){
            public void run() {
                tv3.setVisibility(View.VISIBLE);
            }
        }, 2000);

        tv4.setVisibility(View.INVISIBLE);
        new Handler().postDelayed(new Runnable(){
            public void run() {
                tv4.setVisibility(View.VISIBLE);
            }
        }, 2000);

        tv5.setVisibility(View.INVISIBLE);
        new Handler().postDelayed(new Runnable(){
            public void run() {
                tv5.setVisibility(View.VISIBLE);
            }
        }, 2000);

        v1.setVisibility(View.INVISIBLE);
        new Handler().postDelayed(new Runnable(){
            public void run() {
                v1.setVisibility(View.VISIBLE);
            }
        }, 2000);



    }
}
