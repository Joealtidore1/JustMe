package com.impact.justme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.impact.divisor.Divisor;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final double divisor = Divisor.getDivisor(5.8, 3.4);
    }
}