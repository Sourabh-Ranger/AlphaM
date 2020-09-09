package com.example.alpha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;

import java.util.ArrayList;

public class Music2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music2);


        String url1="https://firebasestorage.googleapis.com/v0/b/alpha-music-94973.appspot.com/o/Songs%2FCalm%20Music%20for%20Peace%20and%20Relaxation%2C%20Inner%20Peace%20Music%20%E9%9F%B3%E6%A5%BD%20to%20Calm%20the%20Mind2020%2C.mp3?alt=media&token=a035fc05-6612-4bc0-b9d3-bb83213f24b4";
        String url2="https://firebasestorage.googleapis.com/v0/b/alpha-music-94973.appspot.com/o/Songs%2FYanny%20v%20Laurel%20video%20which%20name%20do%20you%20hear%20audio.mp3?alt=media&token=300e765e-7cf2-4ecf-bd83-3bf7c3f49668";
        JcPlayerView jcPlayerView=findViewById(R.id.jcplayer);


        ArrayList<JcAudio> jcAudios = new ArrayList<>();
        jcAudios.add(JcAudio.createFromURL("mind 1",url1));
        jcAudios.add(JcAudio.createFromURL("mind 2",url2));

        jcPlayerView.initPlaylist(jcAudios, null);

        jcPlayerView.createNotification(); // default icon
    }




}