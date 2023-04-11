package com.india.listview_spinner_autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class textViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);

        ListView lView = findViewById(R.id.listView);

        ArrayList<String> data = new ArrayList<>();

        data.add("India");
        data.add("USA");
        data.add("Austrlia");
        data.add("China");
        data.add("Philipenes");
        data.add("Nepal");
        data.add("South Africa");
        data.add("Zambie");
        data.add("Argentina");
        data.add("Italy");
        data.add("Germany");
        data.add("North America");
        data.add("Turkey");
        data.add("Sri Lanka");
        data.add("North Carolina");
        data.add("Moscow");
        data.add("London");
        data.add("Japan");

        ArrayAdapter<String> listView = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1,data);

        lView.setAdapter(listView);

        lView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 0){
                    Toast.makeText(textViewActivity.this, "First Item got Clicked", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}