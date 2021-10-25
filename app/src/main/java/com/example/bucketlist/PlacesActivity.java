package com.example.bucketlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class PlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);
        Item[] items = {
                new Item("Sydney", "Visit Sydney in Australia", R.drawable.places, 4.2f),
                new Item("Toronto", "Visit Toronto in Canada", R.drawable.toronto, 3.1f),
                new Item("New York", "Visit New York in USA", R.drawable.new_york, 2.3f),
                new Item("Panama", "Visit Panama", R.drawable.panama, 3.3f),
                new Item("California", "Visit California in USA", R.drawable.california, 4.5f),
                new Item("Ufa", "Visit Ufa in Russia", R.drawable.ufa, 5.0f),
                new Item("Mars", "Visit Mars in Solar system", R.drawable.mars, 4.9f),
                new Item("Texas", "Visit Texas in USA", R.drawable.texas, 1.5f)
        };
        RecyclerView recyclerView = findViewById(R.id.recycler_view_places);
        ItemAdapter itemAdapter = new ItemAdapter(items);
        recyclerView.setAdapter(itemAdapter);
    }
}