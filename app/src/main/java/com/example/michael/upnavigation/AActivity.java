package com.example.michael.upnavigation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;

public class AActivity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_a);
    }

    public void next (View view){
        Intent intent = new Intent(this, BActivity.class);
        startActivity(intent);
    }
}
