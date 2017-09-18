package com.example.loganharrison.examplearchitecture;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class Main2Fragment extends Fragment {


    public Main2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Returns the layout file to be used by the object that calls this class
        return inflater.inflate(R.layout.fragment_main2, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle SavedInstanceState){
        // The view has been created, so we can get the button to go back to fragment 1
        Button goToFragment1Button = getView().findViewById(R.id.go_to_fragment1_button);

        // Set the OnClickListener
        goToFragment1Button.setOnClickListener(new View.OnClickListener() {

            // This is the function that will be run
            @Override
            public void onClick(View view) {
                // Dealing with fragments, have to have a FragmentTransaction
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();

                // We already have a fragment, so use .replace()
                fragmentTransaction.replace(R.id.activity_main, new Main1Fragment());

                // Commit the transaction
                fragmentTransaction.commit();
            }
        });
    }

}
