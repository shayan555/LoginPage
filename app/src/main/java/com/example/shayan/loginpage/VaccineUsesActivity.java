package com.example.shayan.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class VaccineUsesActivity extends AppCompatActivity {

    TextView textView,textView2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vaccine_uses);
        textView= (TextView) findViewById(R.id.textview13);
        textView2= (TextView) findViewById(R.id.textView12);
        Bundle b =getIntent().getExtras();
        textView.setText(b.getString("text"));
        textView2.setText(b.getString("vaccine"));

    }
}
