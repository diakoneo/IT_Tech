package com.androidapk.diakonetapps.psycho_notes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        populateList();

        ArrayAdapter<String> adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent readIntent = new Intent(getApplicationContext(), ReadActivity.class);
                readIntent.putExtra("position", position);

                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                startActivity(readIntent);
            }
        });

    }

    private void populateList(){
        list = new ArrayList<>();
        list.add("Introduction");
        list.add("About the Author");
        list.add("Table of Content");
        list.add("Preface");
        list.add("The changing teaching profession and you");
        list.add("The learning process");
        list.add("Student development");
        list.add("Student diversity");
    }
}
