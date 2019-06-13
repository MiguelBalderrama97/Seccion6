package com.example.miguel.seccion6.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.miguel.seccion6.R;

public class DetailsFragment extends Fragment {

    private View view;

    private TextView txtDetails;

    public DetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_details, container, false);

        txtDetails = view.findViewById(R.id.txtDetails);

        return view;
    }

    public void renderText(String text){
        txtDetails.setText(text);
    }

}
