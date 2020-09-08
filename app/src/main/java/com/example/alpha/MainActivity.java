package com.example.alpha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        TextView fit= findViewById(R.id.fitapp);



    }
    public void LoadMusic(View v){

        Intent intent = new Intent(this, MusicActivity.class);
        startActivity(intent);
    }
    public void LoadNews(View v){

        Intent intent = new Intent(this, NewsActivity.class);
        startActivity(intent);
    }


}
