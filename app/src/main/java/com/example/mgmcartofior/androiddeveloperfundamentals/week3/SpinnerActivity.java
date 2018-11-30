package com.example.mgmcartofior.androiddeveloperfundamentals.week3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.alex.androidfundamentals.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpinnerActivity extends AppCompatActivity {

    private String[] fructis = {"mere", "pere", "rosii", "struguri", "banane"};
    private List<String> frutz = Arrays.asList("mere", "pere", "rosii", "boliat");
    private Spinner mSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        initView();
    }

    private void initView() {
        mSpinner = findViewById(R.id.spinner_fruits);

        mSpinner.setAdapter(getAdapter());
    }

    private List<String> getFruits() {
        List<String> fruits = new ArrayList<>();
        for (String fruitz : fructis) {
            fruits.add(fruitz);
        }
        return fruits;
    }

    private ArrayAdapter<String> getAdapter() {
        return new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, frutz);
    }
}
