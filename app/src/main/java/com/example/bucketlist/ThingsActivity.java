package com.example.bucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ThingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things);


        Item[] items = {
                new Item("Learn how to fight", "thai boxing, or any time of boxing", R.drawable.thai, 4.5f),
                new Item("Parachute jump", "Jump with a parachute with instructor", R.drawable.parachute, 3.2f),
                new Item("Cliff diving", "Jump off a cliff in wing suit", R.drawable.cliff_diving, 3.1f)
        };
        RecyclerView recyclerView = findViewById(R.id.recycler_view_things);
        ItemAdapter itemAdapter = new ItemAdapter(items);
        recyclerView.setAdapter(itemAdapter);
    }
}