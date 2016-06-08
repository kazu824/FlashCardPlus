package com.example.kazu8.flashcardplus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<card> mCards;
    CardAdapter mCardAdapter;
    ListView mListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView)findViewById(R.id.listView);
        mCards = new ArrayList<card>();

        mCards.add(new card(R.drawable.kendo, "剣道", "・けんどう", 0, "剣道～"));
        mCards.add(new card(R.drawable.cyabu, "ちゃぶ台返し", "・ちゃぶだい",0,"ちゃぶ台返し～"));
        mCards.add(new card(R.drawable.kendo, "剣道", "・けんどう", 0, "剣道～"));
        mCards.add(new card(R.drawable.cyabu, "ちゃぶ台返し", "・ちゃぶだい",0,"ちゃぶ台返し～"));
        mCards.add(new card(R.drawable.kendo, "剣道", "・けんどう", 0, "剣道～"));
        mCards.add(new card(R.drawable.cyabu, "ちゃぶ台返し", "・ちゃぶだい",0,"ちゃぶ台返し～"));
        mCards.add(new card(R.drawable.kendo, "剣道", "・けんどう", 0, "剣道～"));
        mCards.add(new card(R.drawable.cyabu, "ちゃぶ台返し", "・ちゃぶだい",0,"ちゃぶ台返し～"));
        mCards.add(new card(R.drawable.kendo, "剣道", "・けんどう", 0, "剣道～"));
        mCards.add(new card(R.drawable.cyabu, "ちゃぶ台返し", "・ちゃぶだい",0,"ちゃぶ台返し～"));
        mCards.add(new card(R.drawable.kendo, "剣道", "・けんどう", 0, "剣道～"));
        mCards.add(new card(R.drawable.cyabu, "ちゃぶ台返し", "・ちゃぶだい",0,"ちゃぶ台返し～"));

        mCardAdapter = new CardAdapter(this,R.layout.card, mCards);
        mListView.setAdapter(mCardAdapter);



    }
}
