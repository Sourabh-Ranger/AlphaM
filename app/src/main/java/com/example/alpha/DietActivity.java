package com.example.alpha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class DietActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);
        ImageView s_bg2=findViewById(R.id.s_bg2);
        Button b1=findViewById(R.id.s_b_1);
        Button b2=findViewById(R.id.s_b_2);
        Button b3=findViewById(R.id.s_b_3);

        RelativeLayout s_Ract1=findViewById(R.id.s_Ract1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nut_lev=new Intent(DietActivity.this,Diet1Activity.class);
                startActivity(nut_lev);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rda=new Intent(DietActivity.this,Diet2Activity.class);
                startActivity(rda);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Diet=new Intent(DietActivity.this,Diet3Activity.class);
                startActivity(Diet);
            }
        });


    }
}