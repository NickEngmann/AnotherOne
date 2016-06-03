package com.example.nick.anotherone;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    /*TextView textViewInfo;
    GifView gifView1,gifView3,gifView4,gifView5;
    GifView2 gifView2;*/
    MediaPlayer sound1;
    MediaPlayer sound2;
    MediaPlayer sound3;
    MediaPlayer sound4;
    MediaPlayer sound5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sound1 = MediaPlayer.create(this, R.raw.yousmart);
        sound2 = MediaPlayer.create(this, R.raw.youverysmart);
        sound3 = MediaPlayer.create(this, R.raw.youagenuis);
        sound4 = MediaPlayer.create(this, R.raw.anotherone);
        sound5 = MediaPlayer.create(this, R.raw.wethebest);
        /*gifView1 = (GifView) findViewById(R.id.gif_view1);
        gifView2 = (GifView2) findViewById(R.id.gif_view2);
        gifView = (GifView) findViewById(R.id.gif_view6);*/
        /*textViewInfo = (TextView) findViewById(R.id.textinfo);

        String stringInfo = "";
        stringInfo += "Duration: " + gifView.getMovieDuration() + "\n";
        stringInfo += "W x H: " + gifView.getMovieWidth() + " x " + gifView.getMovieHeight() + "\n";

        textViewInfo.setText(stringInfo);
        */
    }

    public void playGif1(View view) {
        sound1.start();
    }

    public void playGif2(View view) {
        sound2.start();
    }

    public void playGif3(View view) {
        sound3.start();
    }

    public void playGif4(View view) {
        sound4.start();
    }

    public void playGif5(View view) {
        sound5.start();
    }
}
