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

public class Diet1Activity extends AppCompatActivity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_diet1);
            RelativeLayout s_Ract2=findViewById(R.id.s_Ract2);
            ImageView s_bg3=findViewById(R.id.s_bg4);
            ScrollView s_scroll=findViewById(R.id.s_scroll);
            LinearLayout act2_ll_1=findViewById(R.id.act_2_ll_1);
            TextView act_2_text1=findViewById(R.id.act_3_text1);
            TextView act_2_text2=findViewById(R.id.act_3_text2);
            TextView act_2_text3=findViewById(R.id.act_2_text3);
            TextView act_2_text4=findViewById(R.id.act_2_text4);
            TextView act_2_text5=findViewById(R.id.act_2_text5);
            TextView act_2_text6=findViewById(R.id.act_2_text6);
            TextView act_2_text7=findViewById(R.id.act_2_text7);
            TextView act_2_text8=findViewById(R.id.act_2_text8);
            TextView act_2_text9=findViewById(R.id.act_2_text9);
            TextView act_2_text10=findViewById(R.id.act_2_text10);
            TextView act_2_text11=findViewById(R.id.act_2_text11);
            TextView act_2_text12=findViewById(R.id.act_2_text12);
            TextView act_2_text13=findViewById(R.id.act_2_text13);
            Button back=findViewById(R.id.back);
            back.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent main=new Intent(Diet1Activity.this,DietActivity.class);
                    startActivity(main);
                }
            });

        }
    }