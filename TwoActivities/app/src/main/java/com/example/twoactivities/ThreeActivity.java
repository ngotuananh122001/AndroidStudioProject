package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);

        Intent intent = getIntent();
        int choice = intent.getIntExtra(MainActivity.CHOICE_PARAGRAPH, 0);
        switch (choice) {
            case 0:
                findViewById(R.id.textView1).setVisibility(View.VISIBLE);
                findViewById(R.id.textView2).setVisibility(View.VISIBLE);
                findViewById(R.id.textView3).setVisibility(View.VISIBLE);
                break;
            case 1:
                findViewById(R.id.textView1).setVisibility(View.VISIBLE);
                break;
            case 2:
                findViewById(R.id.textView2).setVisibility(View.VISIBLE);
                break;
            case 3:
                findViewById(R.id.textView3).setVisibility(View.VISIBLE);
                break;
        }
    }
}