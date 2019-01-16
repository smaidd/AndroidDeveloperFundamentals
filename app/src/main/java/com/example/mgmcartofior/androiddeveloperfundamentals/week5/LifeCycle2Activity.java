package com.example.mgmcartofior.androiddeveloperfundamentals.week5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.example.alex.androidfundamentals.R;

import org.w3c.dom.Text;

public class LifeCycle2Activity extends AppCompatActivity {
    private static final String TAG = "LifeCycle2Activity";
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle2);
        Log.e(TAG, "onCreate: " );
        initView();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart: ");

        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            String message = bundle.getString(LifeCycleActivity.MESSAGE);
            if(message != null && !message.isEmpty()){
                mTextView.setText(message);
            }
        }
    }
    private void initView(){
        mTextView = findViewById(R.id.textView_getMessage);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy: ");
    }
}
