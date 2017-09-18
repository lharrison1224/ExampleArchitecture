package com.example.loganharrison.examplearchitecture;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    // this callback function happens everytime MainActivity starts
    // https://www.google.com/search?q=activity+lifecycle&source=lnms&tbm=isch&sa=X&ved=0ahUKEwi18Lysl6_WAhXB0J8KHUhLD9gQ_AUICigB&biw=1680&bih=867#imgrc=O8bNSw7AkWVoKM:
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // calls onCreate in AppCompatActivity class, sets up all the necessary things
        // behind the scenes that are needed to start our activity
        super.onCreate(savedInstanceState);

        // sets the base layout to be activity_main -- our empty layout that fragments
        // will be inserted into
        setContentView(R.layout.activity_main);

        // now we need to tell the phone which fragment we would like to display in our activity
        // first, we get the FragmentTransaction object, which will do all of our fragment management
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        // Now, we tell it where we want to add the fragment, and which fragment we want to add
        // We call .add() because there is currently no fragment so we are adding a new one
        fragmentTransaction.add(R.id.activity_main, new Main1Fragment());

        // To actually perform the action we must call .commit()
        fragmentTransaction.commit();

        // Now, when we start MainActivity by launching the app, Main1Fragment will automatically be shown
    }
}
