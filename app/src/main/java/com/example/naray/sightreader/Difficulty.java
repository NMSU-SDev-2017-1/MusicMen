package com.example.naray.sightreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Difficulty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty);
    }

    public void toHome(View view) {
        Intent intent = new Intent(Difficulty.this, Home.class);
        startActivity(intent);
    }

    public void toPlay1(View view) {
        Intent intent = new Intent(Difficulty.this, Play1.class);
        startActivity(intent);
    }

}
