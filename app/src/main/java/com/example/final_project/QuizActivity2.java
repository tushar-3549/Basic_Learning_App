package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class QuizActivity2 extends AppCompatActivity {

    int previousmarks=0;
    int recentmarks=0;

    RadioGroup myq2RadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz2);

        Intent myGetIntent= getIntent();
        previousmarks= myGetIntent.getIntExtra("Marks_of_Q1",0);
        myq2RadioGroup=findViewById(R.id.q2radioGroupID);
    }

    public void preFunction(View view) {
        Intent myIntent=new Intent(this,QuizActivity.class);
        startActivity(myIntent);
    }

    public void submitFunction(View view) {
        if(myq2RadioGroup.getCheckedRadioButtonId()==R.id.q2radioBtn4ID){
            recentmarks=5;
        }
        Intent myIntent=new Intent(this,QuizActivity3.class);
        myIntent.putExtra("Total_marks",previousmarks+recentmarks);
        startActivity(myIntent);
    }
}