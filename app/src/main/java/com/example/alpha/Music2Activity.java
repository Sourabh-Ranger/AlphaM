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


        String url1="https://firebasestorage.googleapis.com/v0/b/alpha-music-94973.appspot.com/o/Songs%2FStudy1.mp3?alt=media&token=890c2e33-9741-4c58-b37a-362bfd4cf61f";
        String url2="https://firebasestorage.googleapis.com/v0/b/alpha-music-94973.appspot.com/o/Songs%2FStudy2.mp3?alt=media&token=af6f018c-ed29-4006-a053-0e2931403d09";
        JcPlayerView jcPlayerView=findViewById(R.id.jcplayer);


        ArrayList<JcAudio> jcAudios = new ArrayList<>();
        jcAudios.add(JcAudio.createFromURL("Study 1",url1));
        jcAudios.add(JcAudio.createFromURL("Study 2",url2));

        jcPlayerView.initPlaylist(jcAudios, null);

        jcPlayerView.createNotification(); // default icon
    }




}