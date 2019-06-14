package com.example.miguel.mymail.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.miguel.mymail.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {

    private View view;

    private ListView listEmail;

    public ListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_list, container, false);

        listEmail = view.findViewById(R.id.listEmails);

        return view;
    }

}
