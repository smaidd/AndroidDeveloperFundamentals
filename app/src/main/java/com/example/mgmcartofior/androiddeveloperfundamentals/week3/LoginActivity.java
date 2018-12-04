package com.example.mgmcartofior.androiddeveloperfundamentals.week3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import com.example.alex.androidfundamentals.R;



public class LoginActivity extends AppCompatActivity {
    private EditText mEditTextEmail;
    private EditText mEditTextPhone;
    private CheckBox mCheckBoxAccept;
    private TextView mTextViewResult;
    private Autenthificate mAutenth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //initialzare elemente de userinterface
        initView();
        mAutenth = new Autenthificate();
    }

    private void initView() {
        mEditTextEmail = findViewById(R.id.emailEdit);
        mEditTextPhone = findViewById(R.id.phoneEdit);
        mCheckBoxAccept = findViewById(R.id.checkbox_termeni);
        mTextViewResult = findViewById(R.id.textview_res);
    }

    public void btnOnClick(View view) {
        if (isValidEmail() && isChecked() && isValidPhone()) {
            mTextViewResult.setText(mAutenth.toString());
        }
    }

    private boolean isValidEmail() {
        String email = mEditTextEmail.getText().toString();
        if (email.isEmpty() || email == null || email.matches("([.A-Z a-z @ ])\\w+")) {
            mEditTextEmail.setError("Please fill the input");
            return false;
        } else
            mAutenth.setmEmail(email);
        return true;
    }


    private boolean isValidPhone() {
        String phone = mEditTextPhone.getText().toString();
        if (phone.isEmpty() || phone == null || phone.length() <10) {
            mEditTextPhone.setError("Please add a phone number");
            return false;
        } else {
            mAutenth.setmPhone(phone);
            return true;
        }
    }

    private boolean isChecked() {
        if (mCheckBoxAccept.isChecked()) {
            mAutenth.setmAccept(true);
            return true;
        } else {
            return false;
        }
    }
}
