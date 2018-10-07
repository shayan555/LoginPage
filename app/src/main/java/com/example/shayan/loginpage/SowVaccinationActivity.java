package com.example.shayan.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class SowVaccinationActivity extends AppCompatActivity {

    ListView listView;

    String vaccine[];
    String text[];

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sow_vaccination);

        listView= (ListView) findViewById(R.id.listV);



        vaccine=getResources().getStringArray(R.array.vaccine);
        ArrayAdapter<String> ad =new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,vaccine);

        listView.setAdapter(ad);

               listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {

                Intent intent=new Intent(SowVaccinationActivity.this,VaccineUsesActivity.class);
                text=getResources().getStringArray(R.array.Uses);
                intent.putExtra("text",text[i]);
                intent.putExtra("vaccine",vaccine[i]);
                startActivity(intent);

            }
        });


    }
}
