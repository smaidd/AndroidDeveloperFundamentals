package com.example.mgmcartofior.androiddeveloperfundamentals.week6;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.alex.androidfundamentals.R;

public class CommListenerActivity extends AppCompatActivity implements SumListener {
private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comm_listener);
        initView();
        initFragment();

    }
    private void initView(){
        mTextView = findViewById(R.id.text_view_result);
    }

    @Override
    public void addTwoNumbers(int n1, int n2) {
        int result = n1 + n2;
        mTextView.setText(result + "");
    }
    private void initFragment(){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout_result,new MakeSumFragment());
        fragmentTransaction.commit();
    }
}
