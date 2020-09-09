package com.example.alpha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

    }

    public void LoadMeditation(View v){

        Intent intent = new Intent(this, MusicActivity.class);
        startActivity(intent);
    }
    public void LoadStudy(View v){

        Intent intent = new Intent(this, Music2Activity.class);
        startActivity(intent);
    }

    public void LoadRelax(View v){

        Intent intent = new Intent(this, Music3Activity.class);
        startActivity(intent);
    }


}
