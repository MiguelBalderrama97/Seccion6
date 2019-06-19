package com.example.miguel.mymail.Activities;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.miguel.mymail.Fragments.DetailsFragment;
import com.example.miguel.mymail.R;

public class SecondActivity extends FragmentActivity {

    private Bundle bInfo;

    private String sSubject, sMsg, sSender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        bInfo = getIntent().getExtras();

        sSubject = bInfo.getString("subject");
        sMsg = bInfo.getString("message");
        sSender = bInfo.getString("sender");

        DetailsFragment detailsFragment = (DetailsFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentDetails);
        detailsFragment.renderText(sSubject,sSender,sMsg);

    }
}
