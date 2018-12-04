package com.example.mgmcartofior.androiddeveloperfundamentals.week3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.alex.androidfundamentals.R;

import java.util.Arrays;
import java.util.List;

public class Challange3Week3 extends AppCompatActivity {
    private Spinner mSpiner;
    private List<String> mAnimals = Arrays.asList("horse", "monkey", "sheep", "cow", "lion");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challange3_week3);
        initView();
    }

    private void initView() {
        mSpiner = findViewById(R.id.spinner_challange3);
        mSpiner.setAdapter(getAdaper());
        mSpiner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String message = "Selected: " + mSpiner.getSelectedItem().toString();
                Toast.makeText(parent.getContext(),message,Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private ArrayAdapter<String> getAdaper() {
        return new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, mAnimals);
    }
}
