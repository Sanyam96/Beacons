package com.example.sanyam.beacons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import pl.droidsonroids.gif.GifTextView;

public class machine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machine);

        final GifTextView v = (GifTextView) findViewById(R.id.view);
        v.setVisibility(View.VISIBLE);
    }
}
