package com.su.planningpoker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.su.planningpoker.adapters.MainCardsAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView cardsRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardsRecyclerView = findViewById(R.id.cardsRecyclerView);

        // fake size
        ArrayList<Integer> list = new ArrayList<>();
        list.add(R.drawable.ic_one);
        list.add(R.drawable.ic_two);
        list.add(R.drawable.ic_three);
        list.add(R.drawable.ic_four);
        MainCardsAdapter mainCardsAdapter = new MainCardsAdapter(MainActivity.this, list);
        cardsRecyclerView.setAdapter(mainCardsAdapter);
        cardsRecyclerView.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
    }
}
