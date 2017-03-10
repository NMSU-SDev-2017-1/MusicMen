package com.example.naray.sightreader;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Tutorial1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial1);
    }

    public void toTutorial2(View view) {
        Intent intent = new Intent(Tutorial1.this, Tutorial2.class);
        startActivity(intent);
    }
}
