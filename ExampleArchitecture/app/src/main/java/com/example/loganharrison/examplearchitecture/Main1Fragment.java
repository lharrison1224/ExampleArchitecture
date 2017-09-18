package com.example.loganharrison.examplearchitecture;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Main1Fragment extends Fragment {

    public Main1Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Returns the layout file to be used by the object that calls this class
        return inflater.inflate(R.layout.fragment_main1, container, false);
    }

    // This callback is called after the view is successfully created and rendered on the screen
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        // Since we have buttons on this fragment, we need to tell the app what to do when the button is clicked
        // First, we have to find the button
        Button goToFragment2Button = getView().findViewById(R.id.go_to_fragment2_button);

        // Now, goToFragment2Button is a reference to that button on the layout
        // Time to set an OnClickListener for the button
        goToFragment2Button.setOnClickListener(new View.OnClickListener() {

            // This is the function that will be run everytime the button is clicked
            @Override
            public void onClick(View view) {
                // Because we want this button to go to the second fragment, we have to do a fragment transaction
                // Get the FragmentTransaction, NOTE: We have to call getActivity() because
                // the methdd getSupportFragmentManager() must be called on an activity class
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();

                // Now we specify which fragment and where it will go, we use .replace() because
                // there is already a fragment that must be removed first
                fragmentTransaction.replace(R.id.activity_main, new Main2Fragment());

                // Commit the transaction
                fragmentTransaction.commit();
            }
        });

        // We also need to do something similar for the button that starts a new activity
        // Find this button
        Button startChildActivityButton = getView().findViewById(R.id.start_activity_button);

        // set OnClickListener for this button
        startChildActivityButton.setOnClickListener(new View.OnClickListener() {

            // This is ran everytime the button is clicked
            @Override
            public void onClick(View view) {
                // This button starts a new activity
                // The first step is to declare an Intent
                // getActivity() is called to get the activity, and ChildActivity.class specifies
                // that we want to start ChildActivity
                Intent intent = new Intent(getActivity(), ChildActivity.class);

                // Now we will actually start the activity
                startActivity(intent);
            }
        });
    }

}
