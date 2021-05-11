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
        ArrayList<EarthQuake> earthQuakes = new ArrayList<EarthQuake>();
        earthQuakes.add(new EarthQuake(7.2,"San Francisco",46565464,"http"));
        earthQuakes.add(new EarthQuake(6.1,"London",46565464,"http"));
        earthQuakes.add(new EarthQuake(3.9,"Tokyo",46565464,"http"));
        earthQuakes.add(new EarthQuake(5.4,"Mexico City",46565464,"http"));
        earthQuakes.add(new EarthQuake(2.8,"Moscow",46565464,"http"));
        earthQuakes.add(new EarthQuake(4.9,"Rio de Janeiro",46565464,"http"));
        earthQuakes.add(new EarthQuake(1.6,"Paris",46565464,"http"));


        // Find a reference to the listviwe in the main layout.
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        EarthQuakeAdapter adapter = new EarthQuakeAdapter(this,earthQuakes);

        earthquakeListView.setAdapter(adapter);
    }
}