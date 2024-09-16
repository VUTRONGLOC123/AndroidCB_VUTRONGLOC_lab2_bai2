package com.example.bai1;

import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class M000ActSplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m001_act_splash);
        FrameLayout nen = findViewById(R.id.nen);
        ImageView icon= findViewById(R.id.icon);
        TextView nameicon = findViewById(R.id.nameicon);
        int[] colors = {
                R.color.white,
                R.color.black,
                R.color.teal_700,
                R.color.teal_200,
                R.color.purple_700,
                R.color.purple_500,
                R.color.purple_200
        };
        int[] icons = {
                R.drawable.a1,
                R.drawable.a2,
                R.drawable.a3,
                R.drawable.a4,
                R.drawable.a5
        };
        String[] names = {
                "Penguin 1",
                "Penguin 2",
                "Penguin 3",
                "Penguin 4",
                "Penguin 5"
        };
        Random random = new Random();
        int index = random.nextInt(icons.length);
        int randomColor = colors[random.nextInt(colors.length)];
        int randomIcon = icons[index];
        String randomName = names[index];
        nen.setBackgroundColor(randomColor);
        icon.setImageResource(randomIcon);
        nameicon.setText(randomName);

    }
}