package com.example.shayan.loginpage;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class SignupActivity extends AppCompatActivity {


    EditText editText;
    int d,m,y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        Calendar ca=Calendar.getInstance();
        d = ca.get(Calendar.DAY_OF_MONTH);
        m = ca.get(Calendar.MONTH);
        y = ca.get(Calendar.YEAR);



        editText= (EditText) findViewById(R.id.editText);
        editText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                new DatePickerDialog(SignupActivity.this,date,y,m,d).show();

            }
        });
    }
    DatePickerDialog.OnDateSetListener date=new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker datePicker, int year, int month, int dayofMonth) {

            y=year;
            m=month;
            d=dayofMonth;
            editText.setText(dayofMonth+"/"+(month+1)+"/"+year);

        }
    };
}

