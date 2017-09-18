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
public class Child1Fragment extends Fragment {


    public Child1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Specifies the layout to be returned when this fragment is instantiated
        return inflater.inflate(R.layout.fragment_child1, container, false);
    }

    // This callback is called when the view is created
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        // Since the view has been created, we can get the button
        Button goToFragment2Button = getView().findViewById(R.id.go_to_fragment2_button);

        // Set the OnClickListener
        goToFragment2Button.setOnClickListener(new View.OnClickListener() {

            // This will be called everytime the button is clicked
            @Override
            public void onClick(View view) {
                // We want to change fragments, so we need a fragment transaction
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();

                // Specify where the fragment is going to be put and which fragment to use
                // .replace() becase we already have a fragment
                fragmentTransaction.replace(R.id.activity_child, new Child2Fragment());

                // Commit
                fragmentTransaction.commit();
            }
        });
    }
}
