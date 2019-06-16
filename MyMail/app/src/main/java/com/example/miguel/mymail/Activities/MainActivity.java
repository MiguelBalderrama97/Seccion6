package com.example.miguel.mymail.Activities;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.miguel.mymail.Fragments.ListFragment;
import com.example.miguel.mymail.R;

public class MainActivity extends FragmentActivity implements ListFragment.DataListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void sendData(int position) {
        Toast.makeText(this, position+"", Toast.LENGTH_SHORT).show();
    }
}
