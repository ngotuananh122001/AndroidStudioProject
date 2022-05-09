package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int[] num = {0, 0};
    public int i, res, type;
    public String show="";
    public TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        i=0; res = 0;
        type = 0;
    }

    public void btnZero(View view) {
        num[i] *= 10;
        show += "0";
        textView.setText(show);
    }


    public void btnOne(View view) {
        if(num[i]>=0){
            num[i] = num[i]*10+1;
        } else {
            num[i] = num[i]*10-1;
        }
        show += "1";
        textView.setText(show);
    }

    public void btnTwo(View view) {
        if(num[i]>=0){
            num[i] = num[i]*10+2;
        } else {
            num[i] = num[i]*10-2;
        }
        show += "2";
        textView.setText(show);
    }

    public void btnThree(View view) {
        if(num[i]>=0){
            num[i] = num[i]*10+3;
        } else {
            num[i] = num[i]*10-3;
        }
        show += "3";
        textView.setText(show);
    }

    public void btnFour(View view) {
        if(num[i]>=0){
            num[i] = num[i]*10+4;
        } else {
            num[i] = num[i]*10-4;
        }
        show += "4";
        textView.setText(show);
    }

    public void btnFive(View view) {
        if(num[i]>=0){
            num[i] = num[i]*10+5;
        } else {
            num[i] = num[i]*10-5;
        }
        show += "5";
        textView.setText(show);
    }

    public void btnSix(View view) {
        if(num[i]>=0){
            num[i] = num[i]*10+6;
        } else {
            num[i] = num[i]*10-6;
        }
        show += "6";
        textView.setText(show);
    }

    public void btnSeven(View view) {
        if(num[i]>=0){
            num[i] = num[i]*10+7;
        } else {
            num[i] = num[i]*10-7;
        }
        show += "7";
        textView.setText(show);
    }

    public void btnEight(View view) {
        if(num[i]>=0){
            num[i] = num[i]*10+8;
        } else {
            num[i] = num[i]*10-8;
        }
        show += "8";
        textView.setText(show);
    }

    public void btnNine(View view) {
        if(num[i]>=0){
            num[i] = num[i]*10+9;
        } else {
            num[i] = num[i]*10-9;
        }
        show += "9";
        textView.setText(show);
    }

    public void btnAdd(View view){
        if (num[1] != 0){
            res = num[0] + num[1];
            num[0] = res;
            num[1] = 0;
            show = String.valueOf(num[0]);
        } else {
            i = 1;
            type = 1;
        }
        show += "+";
        textView.setText(show);
    }

    public void btnMinus(View view){
        if (num[1] != 0){
            res = num[0] - num[1];
            num[0] = res;
            num[1] = 0;
            show = String.valueOf(num[0]);
        } else {
            i = 1;
            type = 2;
        }
        show += "-";
        textView.setText(show);
    }

    public void btnMulti(View view){
        if (num[1] != 0){
            res = num[0] * num[1];
            num[0] = res;
            num[1] = 0;
            show = String.valueOf(num[0]);
        } else {
            i = 1;
            type = 3;
        }
        show += "x";
        textView.setText(show);
    }

    public void btnDiv(View view){
        if (num[1] != 0){
            res = num[0] / num[1];
            num[0] = res;
            num[1] = 0;
            show = String.valueOf(num[0]);
        } else {
            i = 1;
            type = 4;
        }
        show += ":";
        textView.setText(show);
    }


    public void btnEqual(View view) {
        switch (type){
            case 1:
                res = num[0] + num[1];
                num[0] = res;
                num[1] = 0;
                show = String.valueOf(num[0]);
                textView.setText(show);
                break;
            case 2:
                res = num[0] - num[1];
                num[0] = res;
                num[1] = 0;
                show = String.valueOf(num[0]);
                textView.setText(show);
                break;
            case 3:
                res = num[0] * num[1];
                num[0] = res;
                num[1] = 0;
                show = String.valueOf(num[0]);
                textView.setText(show);
                break;

            case 4:
                res = num[0] / num[1];
                num[0] = res;
                num[1] = 0;
                show = String.valueOf(num[0]);
                textView.setText(show);
                break;
        }
    }
    public void backSpace(View view){
        if(num[1] == 0){
            num[0] = num[0]/10;
            show = String.valueOf(num[0]);
        }
        else{
            num[1] /= 10;
            show = textView.getText().toString();
            show = show.substring(0,show.length()-1);
        }
        textView.setText(show);
    }

    public void reset(View view){
        num[1] = 0;
        num[0] = 0;
        show = "";
        textView.setText("");
    }

    public void reserveRes(View view){
        num[0]=-num[0];
        show = String.valueOf(num[0]);
        textView.setText(show);
    }
}