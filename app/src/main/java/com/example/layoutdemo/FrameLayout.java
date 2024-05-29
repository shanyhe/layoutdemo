package com.example.layoutdemo;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.util.Log;
import android.view.View;
import android.view.View.OnTouchListener;
import com.example.layoutdemo.TouchChangeView;
import android.view.MotionEvent;


public class FrameLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_frame_layout);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
        android.widget.FrameLayout frame = (android.widget.FrameLayout)findViewById(R.id.framelayout);
        if (frame != null) {
            Log.i("LayoutDemo", "frame is not null");
            TouchChangeView TouchChange = new TouchChangeView(this);
            frame.addView(TouchChange);
            TouchChange.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    TouchChangeView cv = (TouchChangeView)v;
                    cv.mX = event.getX();
                    cv.mY = event.getY();
                    Log.i("LayoutDemo", "nTouch" + cv.mX + " " + cv.mY);
                    cv.invalidate();
                    return true;
                }
            });

            TouchChange.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.i("LayoutDemo", "onClick");
                }
            });
        } else {
            Log.i("LayoutDemo", "frame is null");
        }
    }
}