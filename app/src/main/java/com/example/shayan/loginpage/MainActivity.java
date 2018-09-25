package com.example.shayan.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView textView;
    Animation animation;
    CardView cardView2,cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardView2= (CardView) findViewById(R.id.cardV2);
        cardView= (CardView) findViewById(R.id.cardV);
        textView= (TextView) findViewById(R.id.textView6);

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent=new Intent(MainActivity.this,SignupActivity.class);
                startActivity(intent);
                overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.slide_out_right);///android predefined animation


            }
        });

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,MainPageActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.top,android.R.anim.slide_out_right);

            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,ForgetPassword.class);
                startActivity(intent);



            }
        });






    }
}
