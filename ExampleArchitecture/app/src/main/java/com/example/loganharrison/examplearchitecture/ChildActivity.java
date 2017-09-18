package com.example.loganharrison.examplearchitecture;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ChildActivity extends AppCompatActivity {

    // This callback is called everytime ChildActivity is created
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Calls onCreate() from AppCompatActivity
        super.onCreate(savedInstanceState);

        // Sets the empty layout that we will put fragments into
        setContentView(R.layout.activity_child);

        // We need to set the default fragment that will be shown
        // Start a FragmentTransaction
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        // We don't have a fragment, so we call add()
        fragmentTransaction.add(R.id.activity_child, new Child1Fragment());

        // Commit the transaction
        fragmentTransaction.commit();
    }
}
