package com.example.and02_intolayoutconst;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button button = new Button(this);
        button.setText("자바코드로 디자인");

        ConstraintLayout layout = new ConstraintLayout(this);
        layout.addView(button);

        setContentView(layout);


//        setContentView(R.layout.activity_main);


    }
}