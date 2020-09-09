package com.example.alpha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.jean.jcplayer.model.JcAudio;
import com.example.jean.jcplayer.view.JcPlayerView;

import java.util.ArrayList;

public class Music3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music3);

        String url1="https://firebasestorage.googleapis.com/v0/b/alpha-music-94973.appspot.com/o/Songs%2FRelax1.mp3?alt=media&token=6dbc6d14-5e42-47c2-b933-cf4c037bf98d";
        String url2="https://firebasestorage.googleapis.com/v0/b/alpha-music-94973.appspot.com/o/Songs%2FRelax2.mp3?alt=media&token=d5732302-2df1-4f33-8db4-dfb5d6c9e905";
        JcPlayerView jcPlayerView=findViewById(R.id.jcplayer);


        ArrayList<JcAudio> jcAudios = new ArrayList<>();
        jcAudios.add(JcAudio.createFromURL("Relax 1",url1));
        jcAudios.add(JcAudio.createFromURL("Relax 2",url2));

        jcPlayerView.initPlaylist(jcAudios, null);

        jcPlayerView.createNotification(); // default icon
    }




}