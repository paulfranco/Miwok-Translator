package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        // Create a list of phrases
        ArrayList<Phrase> phrases = new ArrayList<Phrase>();

        // Add word objects to the list of phrases
        phrases.add(new Phrase("Where are you going?", "minto wuksus"));
        phrases.add(new Phrase("What is your name?", "tinnә oyaase'nә"));
        phrases.add(new Phrase("My name is...", "oyaaset..."));
        phrases.add(new Phrase("How are you feeling?", "michәksәs?"));
        phrases.add(new Phrase("I’m feeling good.", "kuchi achit"));
        phrases.add(new Phrase("Are you coming?", "әәnәs'aa?"));
        phrases.add(new Phrase("Yes, I’m coming.", "hәә’ әәnәm"));
        phrases.add(new Phrase("I’m coming", "әәnәm"));
        phrases.add(new Phrase("Let’s go.", "yoowutis"));
        phrases.add(new Phrase("Come here.", "әnni'nem"));

        // Create a new PhraseAdapter and we are calling it adapter. We are calling the contructor and passing it a context and the array list of word objects
        PhraseAdapter adapter = new PhraseAdapter(this, phrases);

        // Create a list view
        ListView listView = (ListView) findViewById(R.id.list);

        // Passing the adapter to the list view
        listView.setAdapter(adapter);
    }

}
