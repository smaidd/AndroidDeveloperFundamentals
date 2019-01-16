package com.example.mgmcartofior.androiddeveloperfundamentals.week6;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.alex.androidfundamentals.R;

import org.w3c.dom.Text;

/**
 * A simple {@link Fragment} subclass.
 */
public class CheckingNumberFragment extends Fragment {
    private TextView checkNumber;
    private int Number;

    public void setNumber(int number) {
        Number = number;
    }

    public CheckingNumberFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanarceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_checking_number, container, false);
        checkNumber = view.findViewById(R.id.textview_checkNumber);
        Bundle bundle = getArguments();
        int number = bundle.getInt(CheckNumberBundle.NUMBER);
        checkNumber(number);
            return view;

    }

    private void checkNumber(int number) {
        if (number % 2 == 0) {
            checkNumber.setText("Numar este par");
        } else {
            checkNumber.setText("Numarul este impar");
        }
    }

}
