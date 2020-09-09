package com.example.alpha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class Diet3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet3);

        RelativeLayout s_Ract4=findViewById(R.id.s_Ract4);
        ImageView s_bg3=findViewById(R.id.s_bg3);
        ScrollView act4_scroll=findViewById(R.id.act4_scroll);
        LinearLayout s_act4_ll1=findViewById(R.id.s_act4_ll1);
        TextView act4_text1=findViewById(R.id.act4_text1);
        TextView act4_text2=findViewById(R.id.act4_text2);
        TextView act4_text3=findViewById(R.id.act4_text3);
        TextView act4_text4=findViewById(R.id.act4_text4);
        TextView act4_text5=findViewById(R.id.act4_text5);
        TextView act4_text6=findViewById(R.id.act4_text6);
        TextView act4_text7=findViewById(R.id.act4_text7);
        TextView act4_text8=findViewById(R.id.act4_text8);
        TextView s_day1=findViewById(R.id.s_day1);
        TextView s_day2=findViewById(R.id.s_day2);
        TextView s_day3=findViewById(R.id.s_day3);
        TextView s_day4=findViewById(R.id.s_day4);
        TextView s_day5=findViewById(R.id.s_day5);
        TextView s_day6=findViewById(R.id.s_day6);
        TextView s_day7=findViewById(R.id.s_day7);

        Button back=findViewById(R.id.back2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main=new Intent(Diet3Activity.this,DietActivity.class);
                startActivity(main);
            }
        });





    }
}