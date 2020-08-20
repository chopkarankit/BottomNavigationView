package com.example.bottomnavigationview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileClick extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_click);

        TextView tv = findViewById(R.id.fansgroup);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileClick.this, FansGroup.class);
                startActivity(intent);
            }
        });

        TextView af = findViewById(R.id.helpf);
        af.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileClick.this, HelpFeedback.class);
                startActivity(intent);
            }
        });

        TextView lc = findViewById(R.id.qrcodee);
        lc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ProfileClick.this, QRcodeActivity.class);
                startActivity(intent);
            }
        });




    }
}