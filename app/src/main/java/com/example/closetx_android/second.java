package com.example.closetx_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        ListView mListView = (ListView) findViewById(R.id.listview);

        //create a Tee object
        Tee Levi = new Tee("Levi","XXL","Black");
        Tee Gucci = new Tee("Gucci","XXL","Black");
        Tee OldCrew = new Tee("Old Navy","XXL","Black");
        Tee test1 = new Tee("Test1","XXL","Black");
        Tee test2 = new Tee("Test2","XXL","Black");
        Tee test3 = new Tee("Test3","XXL","Black");
        Tee test4 = new Tee("Test4","XXL","Black");
        Tee test5 = new Tee("Test5","XXL","Black");
        Tee test6 = new Tee("Test6","XXL","Black");
        Tee test7 = new Tee("Test7","XXL","Black");
        Tee test8 = new Tee("Test8","XXL","Black");
        Tee test9 = new Tee("Test9","XXL","Black");

        ArrayList<Tee> teeList = new ArrayList<>();
        teeList.add(Levi );
        teeList.add(Gucci);
        teeList.add(OldCrew);
        teeList.add(test1);
        teeList.add(test2);
        teeList.add(test3);
        teeList.add(test4);
        teeList.add(test5);
        teeList.add(test6);
        teeList.add(test7);
        teeList.add(test8);
        teeList.add(test9);

        TeeListAdapter adapter = new TeeListAdapter(this, R.layout.adapter_view_layout, teeList);
        mListView.setAdapter(adapter);
    }
}