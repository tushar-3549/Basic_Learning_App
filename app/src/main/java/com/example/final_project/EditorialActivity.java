package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class EditorialActivity extends AppCompatActivity {

    ListView listView;
    String[] ques;
    String select;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editorial);

        listView=findViewById(R.id.listViewID);
        ques=getResources().getStringArray(R.array.questions);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(this, R.layout.sampleview, R.id.myTextViewID, ques);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0) {
                    Intent intent=new Intent(EditorialActivity.this, IntroductionCpp.class);
                    startActivity(intent);
                }
                else if(position == 1) {
                    Intent intent1=new Intent(EditorialActivity.this, Prime.class);
                    startActivity(intent1);
                }
                else if(position == 2) {
                    Intent intent2=new Intent(EditorialActivity.this, Hello.class);
                    startActivity(intent2);
                }
                else if(position == 3) {
                    Intent intent3=new Intent(EditorialActivity.this, Fibo.class);
                    startActivity(intent3);
                }
                else if(position == 4) {
                    Intent intent4=new Intent(EditorialActivity.this, Sum.class);
                    startActivity(intent4);
                }
                else if(position == 5) {
                    // similar way
                }
                else if(position == 6) {
                    // similar way
                }
                else if(position == 7) {
                    Intent intent7=new Intent(EditorialActivity.this, Multiplication.class);
                    startActivity(intent7);
                }
                else if(position == 8) {
                    Intent intent8=new Intent(EditorialActivity.this, Palindrome.class);
                    startActivity(intent8);
                }
                else if(position == 9) {
                    // similar way
                }
                else if(position == 10) {
                    // similar way
                }
                else if(position == 11){
                    Intent refer=new Intent(EditorialActivity.this, ReferTutorial.class);
                    startActivity(refer);
                }
            }
        });
    }
}