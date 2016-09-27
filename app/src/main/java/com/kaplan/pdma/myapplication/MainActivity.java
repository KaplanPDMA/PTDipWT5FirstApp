package com.kaplan.pdma.myapplication;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //to have the UI handle
        Button button = (Button) findViewById(R.id.button);

        //attach an onclick listener
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Toast.makeText(MainActivity.this, "Hello Kaplan", Toast.LENGTH_SHORT).show();
           }
       });

        //create the music handle
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.skyfall);

        //to have the Switch handle
        Switch sw = (Switch) findViewById(R.id.switch1);

        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(b) {
                    mp.start();
//                    Toast.makeText(MainActivity.this, "on", Toast.LENGTH_SHORT).show();
                } else {
                    mp.pause();
//                    Toast.makeText(MainActivity.this, "off", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}
