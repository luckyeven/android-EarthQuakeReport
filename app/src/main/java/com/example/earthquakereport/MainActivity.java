package com.example.earthquakereport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // An arraylist containing placeholder data.
        ArrayList<EarthQuake> earthQuakes = QueryUtils.extractEarthquakes();

        // Find a reference to the listviwe in the main layout.
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        EarthQuakeAdapter adapter = new EarthQuakeAdapter(this,earthQuakes);

        earthquakeListView.setAdapter(adapter);
    }
}