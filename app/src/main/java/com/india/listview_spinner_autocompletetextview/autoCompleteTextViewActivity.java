package com.india.listview_spinner_autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import java.util.ArrayList;

public class autoCompleteTextViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_complete_text_view);

        AutoCompleteTextView autoComplete = findViewById(R.id.autoTextView);

        ArrayList<String> data = new ArrayList<>();
        data.add("C");
        data.add("C++");
        data.add("Python");
        data.add("C Sharp");
        data.add("Perl");
        data.add("PSQL");
        data.add("Java");

        ArrayAdapter<String> autoCompleteAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data);
        autoComplete.setAdapter(autoCompleteAdapter);
        autoComplete.setThreshold(1);
    }
}