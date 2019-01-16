package com.example.mgmcartofior.androiddeveloperfundamentals.week5;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.alex.androidfundamentals.R;

public class LifeCycleActivity extends AppCompatActivity {
    private static final String TAG = "LifeCycleActivity";
    private EditText mEditText;
    public static final String MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
        Log.e(TAG, "onCreate");
        initView();

    }

    private void initView() {
        mEditText = findViewById(R.id.editText_message);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResum");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy");
    }

    public void pressBtnOnClick(View view) {
        if (mEditText != null) {
            String message = mEditText.getText().toString();
            if (message != null && !message.isEmpty()) {
                Intent intent = new Intent(LifeCycleActivity.this, LifeCycle2Activity.class);
                intent.putExtra(MESSAGE, message);
                startActivity(intent);
            } else {
                Toast.makeText(this, "TextView-ul este gol", Toast.LENGTH_SHORT).show();
            }
        }
    }

    public void btnShareOnClick(View view) {
        if (mEditText != null) {
            String message = mEditText.getText().toString();
            if (message != null && !message.isEmpty()) {
                ShareCompat.IntentBuilder.from(LifeCycleActivity.this).setType("text/plain")
                        .setChooserTitle(R.string.share_android)
                        .setText(message)
                        .startChooser();
            }
        }
    }

    public void btnOpenWebSite(View view) {
        if (mEditText != null) {
            String message = mEditText.getText().toString();
            if (message != null && !message.isEmpty()) {
                Uri uri = Uri.parse(message);
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        }
    }

    public void btnSumOnClick(View view) {
        int n1 = 67;
        int n2 = 23;
        int sum = n1 + n2;
        String name = null;
        Log.e(TAG, name.length() + "sum= " + sum);
    }
}
