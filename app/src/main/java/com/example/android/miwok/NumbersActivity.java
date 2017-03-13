package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<Word> words = new ArrayList<Word>();

       // words.add("one");
        words.add(new Word("one","lutti"));
        words.add(new Word("two","otiiko"));
        words.add(new Word("three","tolookosu"));
        words.add(new Word("four","oyissa"));
        words.add(new Word("five","massokka"));
        words.add(new Word("six","temmokka"));
        words.add(new Word("seven","kenekaku"));
        words.add(new Word("eight","kawinta"));
        words.add(new Word("nine","wo'e"));
        words.add(new Word("ten","na'aacha"));

       /* LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);
        int index = 0;*/
       /* while(index<words.size()) {

            TextView wordView=new TextView(this);
            wordView.setText(words.get(index));
            rootView.addView(wordView);
            index=index+1;
        }*/
       /* for (index = 0; index < words.size(); index++) {
            TextView wordView = new TextView(this);
            wordView.setText(words.get(index));
            rootView.addView(wordView);
        }*/

        WordAdapter itemsAdapter=new WordAdapter(this,words);
        ListView listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        /*GridView gridView=(GridView)findViewById(R.id.list);
        gridView.setAdapter(itemsAdapter);*/
    }
}
