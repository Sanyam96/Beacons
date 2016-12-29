package com.example.sanyam.beacons;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class mainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ImageButton ib1 = (ImageButton)findViewById(R.id.imageButton);
        ImageButton ib2 = (ImageButton)findViewById(R.id.imageButton2);
        ImageButton ib3 = (ImageButton)findViewById(R.id.imageButton3);

        ib1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mainActivity.this, Toll.class);
                startActivity(i);
                //Toast.makeText(TravelBite.this, "test", Toast.LENGTH_SHORT).show();
            }
        });

        ib2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mainActivity.this, CabService.class);
                startActivity(i);
                //Toast.makeText(TravelBite.this, "test", Toast.LENGTH_SHORT).show();
            }
        });

        ib3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(TravelBite.this, "test", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
