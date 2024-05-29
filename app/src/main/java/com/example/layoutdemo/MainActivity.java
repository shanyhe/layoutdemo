package com.example.layoutdemo;

import android.app.Activity;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void change2LinearLayout(View v) {
        Log.i("LayoutDemo", "goto linear layout activity");
        startActivity(new Intent(this, LinearActivity.class));
    }

    public void change2RelativeLayout(View v) {
        Log.i("LayoutDemo", "goto relative layout activity");
        startActivity(new Intent(this, RelativeLayout.class));
    }

    public void change2TableLayout(View v) {
        Log.i("LayoutDemo", "goto table layout activity");
        startActivity(new Intent(this, TableLayout.class));
    }

    public void change2FrameLayout(View v) {
        Log.i("LayoutDemo", "goto frame layout activity");
        startActivity(new Intent(this, FrameLayout.class));
    }

    public void change2AbsoluteLayout(View v) {
        Log.i("LayoutDemo", "goto absolute layout activity");
        startActivity(new Intent(this, AbsoluteLayout.class));
    }

    public void change2GridLayout(View v) {
        Log.i("LayoutDemo", "goto grid layout activity");
        startActivity(new Intent(this, GridLayout.class));
    }
}
