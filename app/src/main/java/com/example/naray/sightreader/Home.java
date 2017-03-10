package com.example.naray.sightreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Home extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void toDifficulty(View view) {
        Intent intent = new Intent(Home.this, Difficulty.class);
        startActivity(intent);
    }

    public void toTutorial(View view) {
        Intent intent = new Intent(Home.this, Tutorial1.class);
        startActivity(intent);
    }
}
