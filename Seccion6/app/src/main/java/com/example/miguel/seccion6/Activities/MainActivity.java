package com.example.miguel.seccion6.Activities;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.miguel.seccion6.Fragments.DataFragment;
import com.example.miguel.seccion6.Fragments.DetailsFragment;
import com.example.miguel.seccion6.R;

public class MainActivity extends FragmentActivity implements DataFragment.DataListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void sendData(String text) {
//        CALL THE RENDERTEXT'S METHOD OF THE DETAILSFRAGMENT, PASSING THE TEXT THAT WE RECEIVED BY THE PARAMETER IN THIS METHOD
        DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.detailsFragment);
        detailsFragment.renderText(text);
    }
}
