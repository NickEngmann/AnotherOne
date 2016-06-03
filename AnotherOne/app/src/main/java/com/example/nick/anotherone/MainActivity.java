package com.example.nick.anotherone;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    /*TextView textViewInfo;
    GifView gifView1,gifView3,gifView4,gifView5;
    GifView2 gifView2;*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
    public void playrecording(String audiofile) throws IllegalArgumentException, SecurityException, IllegalStateException, IOException {
        MediaPlayer mP = new MediaPlayer();
        mP.setDataSource(getFilesDir() + "/" + audiofile);
        mP.prepare();
        mP.start();
    }
}
