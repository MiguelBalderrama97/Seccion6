package com.example.miguel.mymail.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.miguel.mymail.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class DetailsFragment extends Fragment {

    private TextView txtSubject, txtSender, txtMsg;

    private View view;

    public DetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_details, container, false);

        txtMsg = view.findViewById(R.id.txtMsg);
        txtSender = view.findViewById(R.id.txtSender);
        txtSubject = view.findViewById(R.id.txtSubject);

        return view;
    }

}
