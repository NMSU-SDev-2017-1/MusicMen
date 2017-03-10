package com.example.naray.sightreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Play1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play1);
    }

    public void toPlay2(View view) {
        Intent intent = new Intent(Play1.this, Play2.class);
        startActivity(intent);
    }
}
