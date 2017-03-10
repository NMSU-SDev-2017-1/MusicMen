package com.example.naray.sightreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Play2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play2);
    }

    public void toPlay3(View view) {
        Intent intent = new Intent(Play2.this, Play3.class);
        startActivity(intent);
    }
}
