package com.example.mgmcartofior.androiddeveloperfundamentals.week3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alex.androidfundamentals.R;

import java.util.Arrays;
import java.util.List;

public class PracticeWeek3Activity extends AppCompatActivity {

    private EditText mEditTextEmail;
    private EditText mEditTextPhone;
    private String mPhone;
    private TextView mEditTextResult;
    private CheckBox mCheckBoxChecked;
    private List<String> mTypeOfPhone = Arrays.asList("mobile", "fax");
    private Autenthificate autenthificate;
    private Spinner mSpinner;
    private Toast mToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice_week3);
        initView();
        autenthificate = new Autenthificate();
    }

    private void initView() {
        mSpinner = findViewById(R.id.spinner_phone);
        mEditTextEmail = findViewById(R.id.edittext_email);
        mEditTextPhone = findViewById(R.id.edittext_phone);
        mCheckBoxChecked = findViewById(R.id.checkbox_tandc);
        mEditTextResult = findViewById(R.id.textView_result);
        mSpinner.setAdapter(getAdapter());
    }

    private ArrayAdapter<String> getAdapter() {
        return new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, mTypeOfPhone);
    }

    private boolean isValidEmail() {
        String email = mEditTextEmail.getText().toString();
        if (email.isEmpty() || email == null) {
            mEditTextEmail.setError("Invalid phone");
            return false;
        } else {
            autenthificate.setmEmail(email);
            return true;
        }
    }

    private boolean isValidPhone() {
        mPhone = mEditTextPhone.getText().toString();
        if (mPhone.isEmpty() || mPhone == null) {
            mEditTextPhone.setError("Invalid phone");
            return false;
        } else {
            autenthificate.setmPhone(mPhone);
            return true;
        }
    }

    private boolean isChecked() {
        if (mCheckBoxChecked.isChecked()) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isValidNumber() {
        if (mPhone.startsWith("07") && mSpinner.getSelectedItemPosition() == 0) {
            return true;
        }
        if (mPhone.startsWith("03") && mSpinner.getSelectedItemPosition() == 1) {
            return true;
        }
        return false;

    }


    public void submitbtnOnClick(View view) {
        if (isChecked() && isValidEmail() && isValidPhone() && isValidNumber()) {
            mEditTextResult.setText(autenthificate.toString());
            Toast.makeText(this,"Submited",Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,"Invalid phone type",Toast.LENGTH_LONG).show();
        }
    }
}
