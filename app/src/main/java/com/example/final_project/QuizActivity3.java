package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity3 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    int totalmarks=0;
    TextView outputView, showRes;
    Spinner spinner;
    String[] feedback = {"Good","Better","Best"};
    String select;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);

        Intent myGetIntent= getIntent();
        totalmarks= myGetIntent.getIntExtra("Total_marks",0);
        outputView=findViewById(R.id.outputTextviewID);
        spinner=findViewById(R.id.spinnerID);
        showRes=findViewById(R.id.showText);
        outputView.setText("You get "+totalmarks+" out of 10");

        ArrayAdapter myAA = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item,feedback);
        myAA.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(myAA);
        spinner.setOnItemSelectedListener(this);
    }

    public void tryAgainFunction(View view) {
        Intent myIntent=new Intent(this,MainActivity2.class);
        startActivity(myIntent);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        select=parent.getItemAtPosition(position).toString();
        //Toast.makeText(parent.getContext(),select, Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Thanks for your Feedback.Your quiz is : "+select, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}