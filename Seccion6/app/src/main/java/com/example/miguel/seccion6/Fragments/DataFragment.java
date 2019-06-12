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

    public DataFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

//        try {
//            callBack = (DataListener) context;
//        } catch () {
//
//        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_data, container, false);

        etxtText = view.findViewById(R.id.etxtData);
        btnSend = view.findViewById(R.id.btnData);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return view;
    }

    private void sendText(String text) {

    }

    public interface DataListener {
        void sendData();
    }

}
