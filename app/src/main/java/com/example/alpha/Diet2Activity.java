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

public class Diet2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet2);
        RelativeLayout s_Ract3=findViewById(R.id.s_Ract3);
        ImageView s_bg4=findViewById(R.id.s_bg4);
        ScrollView s_scroll1=findViewById(R.id.s_scroll1);
        LinearLayout act3_ll_1=findViewById(R.id.act_3_ll_1);
        TextView act_3_text1=findViewById(R.id.act_3_text1);
        TextView act_3_text2=findViewById(R.id.act_3_text2);
        TextView act_3_text3=findViewById(R.id.act_2_text3);
        TextView act_3_text4=findViewById(R.id.act_2_text4);
        TextView act_3_text5=findViewById(R.id.act_2_text5);
        Button back=findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main=new Intent(Diet2Activity.this,DietActivity.class);
                startActivity(main);
            }
        });
    }
}
