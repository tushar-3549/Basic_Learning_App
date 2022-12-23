package com.example.final_project;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ReferTutorial extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView listView;
    Fragment fragment;
    String[] name={"Website Reference", "Youtube Videos", "Blogs", "Geeksforgeeks", "Titorial Point"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refer_tutorial);

        listView=findViewById(R.id.listViewID);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,name);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(position==0){
            fragment=new WebsFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentID,fragment).commit();
        }
        else if(position==1){
            fragment=new YouTubFragment();
            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentID,fragment).commit();
        }
    }
}