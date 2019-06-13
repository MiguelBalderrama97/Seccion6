package com.example.miguel.seccion6.Fragments;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.miguel.seccion6.R;

public class DataFragment extends Fragment {

    private View view;

    private EditText etxtText;
    private Button btnSend;

    private DataListener callBack;

    private String textToSend;

    public DataFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        try {
            callBack = (DataListener) context;
        } catch (Exception e) {
            throw new ClassCastException(context.toString() + " should implements DataListener");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_data, container, false);

//        UI ELEMENTS
        etxtText = view.findViewById(R.id.etxtData);
        btnSend = view.findViewById(R.id.btnData);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                RECOVER THE TEXT THAT I WANT TO SEND
                textToSend = etxtText.getText().toString();

                sendText(textToSend);
            }
        });

        return view;
    }

    private void sendText(String text) {
        callBack.sendData(text);
    }

    //    WITH THIS INTERFACE I AM GOING TO CAN COMMUNICATE THE FRAGMENT AND THE ACTIVITY
    public interface DataListener {
        void sendData(String text);
    }

}
