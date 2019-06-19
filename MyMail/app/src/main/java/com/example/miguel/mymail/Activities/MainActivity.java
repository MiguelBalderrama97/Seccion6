package com.example.miguel.mymail.Activities;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.miguel.mymail.Fragments.ListFragment;
import com.example.miguel.mymail.R;

public class MainActivity extends FragmentActivity implements ListFragment.DataListener {

    private Intent inDetails;
    private Bundle bInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void sendData(String subject, String sender, String message) {
        inDetails = new Intent(this, SecondActivity.class);
        bInfo = new Bundle();
        bInfo.putString("subject", subject);
        bInfo.putString("sender", sender);
        bInfo.putString("message", message);
        inDetails.putExtras(bInfo);
        startActivity(inDetails);
    }
}
