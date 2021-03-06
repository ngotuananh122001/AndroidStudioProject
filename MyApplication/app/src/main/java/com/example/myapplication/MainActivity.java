package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public EditText mssv, name, cccd, phone, email, address1, address2;
    public TextView textViewBirthday;
    public CalendarView birthday;
    public RadioGroup major, programLanguage;
    public CheckBox commit;
    public RadioButton it1, it2, java, c, python;
    public Button btnOk;
    public Toast toast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mssv = (EditText) findViewById(R.id.mssv);
        name = (EditText) findViewById(R.id.name);
        cccd = (EditText) findViewById(R.id.cccd);
        phone = (EditText) findViewById(R.id.phone);
        email = (EditText) findViewById(R.id.email);
        textViewBirthday = (TextView) findViewById(R.id.textViewBirthday);
        birthday = (CalendarView) findViewById(R.id.birthday);
        address1 = (EditText) findViewById(R.id.address1);
        address2 = (EditText) findViewById(R.id.address2);
        major = (RadioGroup) findViewById(R.id.major);
        programLanguage = (RadioGroup) findViewById(R.id.programLanguage);
        commit = (CheckBox) findViewById(R.id.commit);
        it1 = (RadioButton) findViewById(R.id.it1);
        it2 = (RadioButton) findViewById(R.id.it2);
        java = (RadioButton) findViewById(R.id.java);
        c = (RadioButton) findViewById(R.id.c);
        python = (RadioButton) findViewById(R.id.python);
        btnOk = (Button) findViewById(R.id.btnOk);

        textViewBirthday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                birthday.setVisibility(birthday.VISIBLE);
            }
        });

        birthday.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int dayOfMonth) {
                textViewBirthday.setText(dayOfMonth+"/"+month+"/"+year);
                birthday.setVisibility(birthday.GONE);
            }
        });

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!commit.isChecked()){
                    toast = Toast.makeText(MainActivity.this,"B???n ph???i ?????ng ?? v???i ??i???u kho???n m???i c?? th??? ????ng submit", Toast.LENGTH_LONG);
                    toast.show();
                } else {
                    if (mssv.getText().toString().length() == 0){
                        mssv.setHint("MSSV l?? b???t bu???c");
                        mssv.setHintTextColor(Color.RED);
                    }
                    if (name.getText().toString().length() == 0){
                        name.setHint("T??n l?? b???t bu???c");
                        name.setHintTextColor(Color.RED);

                    }
                    if (cccd.getText().toString().length() == 0){
                        cccd.setHint("CCCD l?? b???t bu???c");
                        cccd.setHintTextColor(Color.RED);
                    }
                    if (phone.getText().toString().length() == 0){
                        phone.setHint("S??T l?? b???t bu???c");
                        phone.setHintTextColor(Color.RED);
                    }
                    if (email.getText().toString().length() == 0){
                        email.setHint("Email l?? b???t bu???c");
                        email.setHintTextColor(Color.RED);
                    }
                    if(textViewBirthday.toString().length() == 0){
                        toast = Toast.makeText(MainActivity.this,"Ng??y sinh l?? b???t bu???c", Toast.LENGTH_LONG);
                        toast.show();
                    }
                    if (!it1.isChecked() && !it2.isChecked()){
                        toast = Toast.makeText(MainActivity.this,"B???n ch??a ch???n chuy??n ng??nh", Toast.LENGTH_LONG);
                        toast.show();
                    }
                    if(!java.isChecked() && !c.isChecked() && !python.isChecked()){
                        toast = Toast.makeText(MainActivity.this,"B???n ch??a ch???n ng??n ng??? l???p tr??nh", Toast.LENGTH_LONG);
                        toast.show();
                    }

                    if (mssv.getText().toString().length() != 0 && name.getText().toString().length() != 0
                    && cccd.getText().toString().length() != 0 && phone.getText().toString().length() != 0
                    && email.getText().toString().length() != 0){
                        toast = Toast.makeText(MainActivity.this,"Submit th??nh c??ng", Toast.LENGTH_LONG);
                        toast.show();
                    }
                }
            }
        });
    }

}