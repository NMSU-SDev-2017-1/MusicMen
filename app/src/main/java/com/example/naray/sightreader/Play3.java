package com.example.naray.sightreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Play3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play3);
    }

    public void toHome(View view) {
        Intent intent = new Intent(Play3.this, Home.class);
        startActivity(intent);
    }
}
