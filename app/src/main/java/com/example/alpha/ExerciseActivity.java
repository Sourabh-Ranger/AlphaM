package com.example.alpha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ExerciseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
    }

    public void LoadBmi(View v){

        Intent intent = new Intent(this, BmiActivity.class);
        startActivity(intent);
    }
    public void LoadPlan(View v){

        Intent intent = new Intent(this, BmiActivity.class);
        startActivity(intent);
    }

}