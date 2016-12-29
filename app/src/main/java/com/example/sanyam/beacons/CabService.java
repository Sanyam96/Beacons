package com.example.sanyam.beacons;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import pl.droidsonroids.gif.GifTextView;

public class CabService extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cab_service);


        final GifTextView v = (GifTextView) findViewById(R.id.view);
        final GifTextView v1 = (GifTextView) findViewById(R.id.view2);
        final GifTextView v2 = (GifTextView) findViewById(R.id.view3);

        //final TextView tv1 = (TextView) findViewById(R.id.textView);
        final TextView tv2 = (TextView) findViewById(R.id.textView2);
        final TextView tv3 = (TextView) findViewById(R.id.textView3);
        final TextView tv4 = (TextView) findViewById(R.id.textView4);
        final TextView tv5 = (TextView) findViewById(R.id.textView5);
        final TextView tv6 = (TextView) findViewById(R.id.textView6);
        final TextView tv7 = (TextView) findViewById(R.id.textView7);




        tv6.setVisibility(View.VISIBLE);
        new Handler().postDelayed(new Runnable(){
            public void run() {
                tv6.setVisibility(View.INVISIBLE);
            }
        }, 2000);

        tv7.setVisibility(View.VISIBLE);
        new Handler().postDelayed(new Runnable(){
            public void run() {
                tv7.setVisibility(View.INVISIBLE);
            }
        }, 2000);

        v.setVisibility(View.INVISIBLE);
        new Handler().postDelayed(new Runnable(){
            public void run() {
                v.setVisibility(View.VISIBLE);
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




        // bool beaconIdentifier

        //==============================================================
        //==============================================================
        //==============================================================
        /*
        if( beaconIdentifier == false )
        {
            tv6.setVisibility(View.VISIBLE);
            new Handler().postDelayed(new Runnable(){
                public void run() {
                    tv6.setVisibility(View.INVISIBLE);
                }
            }, 2000);

            tv7.setVisibility(View.VISIBLE);
            new Handler().postDelayed(new Runnable(){
                public void run() {
                    tv7.setVisibility(View.INVISIBLE);
                }
            }, 2000);
        }
        else
        {

            v.setVisibility(View.INVISIBLE);
            new Handler().postDelayed(new Runnable(){
                public void run() {
                    v.setVisibility(View.VISIBLE);
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


        }
        */
        //==============================================================
        //==============================================================
        //==============================================================



    }
}
