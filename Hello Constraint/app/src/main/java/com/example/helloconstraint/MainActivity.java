package com.example.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;

        if (mCount % 2 == 0) {
            view.setBackgroundColor(Color.parseColor("#FFBB86FC"));
        } else {
            view.setBackgroundColor(Color.parseColor("#CC704B"));
        }

        mShowCount.setText(Integer.toString(mCount));

        Button resetBtn = (Button) findViewById(R.id.reset_btn);
        resetBtn.setBackgroundColor(Color.GREEN);

    }

    public void resetToZero(View view) {
        mCount = 0;
        mShowCount.setText(Integer.toString(mCount));
        view.setBackgroundColor(Color.parseColor("#9A9797"));
    }
}