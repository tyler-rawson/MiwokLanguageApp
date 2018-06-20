package com.example.android.miwok;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {
    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        RecyclerView recyclerView = findViewById(R.id.list);
        final ArrayList<Word> family = new ArrayList<Word>();
        family.add(new Word("father", "әpә", R.drawable.family_father,R.raw.family_father));
        family.add(new Word("mother", "әṭa", R.drawable.family_mother,R.raw.family_mother));
        family.add(new Word("son", "angsi", R.drawable.family_son,R.raw.family_son));
        family.add(new Word("daughter", "tune", R.drawable.family_daughter,R.raw.family_daughter));
        family.add(new Word("older brother", "taachi", R.drawable.family_older_brother,R.raw.family_older_brother));
        family.add(new Word("younger brother", "chalitti", R.drawable.family_younger_brother,R.raw.family_younger_brother));
        family.add(new Word("older sister", "teṭe", R.drawable.family_older_sister,R.raw.family_older_sister));
        family.add(new Word("younger sister", "kolliti", R.drawable.family_younger_sister,R.raw.family_younger_sister));
        family.add(new Word("grandmother", "ama", R.drawable.family_grandmother,R.raw.family_grandmother));
        family.add(new Word("grandfather", "paapa", R.drawable.family_grandfather,R.raw.family_grandfather));
        WordAdapter adapter = new WordAdapter(this, family, R.color.category_family);
        recyclerView.setLayoutManager(new LinearLayoutManager(this)); // set the layout manager
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(adapter);
    }
}
