package com.example.alpha;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;

import java.io.IOException;
import java.util.ArrayList;


public class MusicActivity extends AppCompatActivity {


// this is fourth version off music player and best one which made
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);


        String url2="https://firebasestorage.googleapis.com/v0/b/alpha-music-94973.appspot.com/o/Songs%2FCalm%20Music%20for%20Peace%20and%20Relaxation%2C%20Inner%20Peace%20Music%20%E9%9F%B3%E6%A5%BD%20to%20Calm%20the%20Mind2020%2C.mp3?alt=media&token=a035fc05-6612-4bc0-b9d3-bb83213f24b4";
        String url1="https://firebasestorage.googleapis.com/v0/b/alpha-music-94973.appspot.com/o/Songs%2FMeditation.mp3?alt=media&token=28d849c6-5577-4f79-ae6e-9507b4ea3396";
        JcPlayerView jcPlayerView=findViewById(R.id.jcplayer);


        ArrayList<JcAudio> jcAudios = new ArrayList<>();
        jcAudios.add(JcAudio.createFromURL("Meditation 1",url1));
        jcAudios.add(JcAudio.createFromURL("Meditation 2",url2));

        jcPlayerView.initPlaylist(jcAudios, null);

        jcPlayerView.createNotification(); // default icon
    }




}

