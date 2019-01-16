package com.example.mgmcartofior.androiddeveloperfundamentals.week6;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.alex.androidfundamentals.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MakeSumFragment extends Fragment {
    private EditText mNumber1;
    private EditText mNumber2;
    private Button mButton;

    public MakeSumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_make_sum, container, false);
        mNumber1 = view.findViewById(R.id.number_one);
        mNumber2 = view.findViewById(R.id.number_two);
        mButton = view.findViewById(R.id.btn_send);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendData();
            }
        });
        return view;
    }

    private void sendData() {
        int n1 = 0, n2 = 0;
        if (mNumber2 != null && mNumber2 != null) {
            String number1String = mNumber1.getText().toString();
            String nuber2String = mNumber2.getText().toString();
            if (!number1String.isEmpty() && !nuber2String.isEmpty()) {
                n1 = Integer.parseInt(number1String);
                n2 = Integer.parseInt(nuber2String);
            }
        }
        SumListener sumListener = (SumListener) getActivity();
        sumListener.addTwoNumbers(n1, n2);
    }

}
