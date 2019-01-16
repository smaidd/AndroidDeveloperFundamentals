package com.example.mgmcartofior.androiddeveloperfundamentals.week6;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.alex.androidfundamentals.R;

public class CheckNumberBundle extends AppCompatActivity {
    private EditText mNumber;
    public final static String NUMBER = "number";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_number_bundle);
        initView();
    }

    private void initView() {
        mNumber = findViewById(R.id.editText_number);
    }

    private void initFragment(CheckingNumberFragment checkingNumberFragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container_check, checkingNumberFragment);
        fragmentTransaction.commit();
    }

    public void btnCheckNumber(View view) {
        if (mNumber != null) {
            String nr = mNumber.getText().toString();
            if (!nr.isEmpty()) {
                int number = Integer.parseInt(nr);
//                Bundle bundle = new Bundle();
//                bundle.putInt(NUMBER, number);
                CheckingNumberFragment checkingNumberFragment = new CheckingNumberFragment();
                //checkingNumberFragment.setArguments(bundle);
                checkingNumberFragment.setNumber(number);
                initFragment(checkingNumberFragment);
            }
        }
    }
}
