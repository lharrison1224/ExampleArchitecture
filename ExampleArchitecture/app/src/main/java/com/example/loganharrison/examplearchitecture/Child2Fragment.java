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
public class Child2Fragment extends Fragment {


    public Child2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Specifies the layout to be used by this fragment
        return inflater.inflate(R.layout.fragment_child2, container, false);
    }

    // This gets called after the view is rendered
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState){
        // We can find the button now
        Button goToFragment1Button = getView().findViewById(R.id.go_to_fragment1_button);

        // Set the OnClickListener
        goToFragment1Button.setOnClickListener(new View.OnClickListener() {

            // This will get ran everytime the button is clicked
            @Override
            public void onClick(View view) {
                // We need to switch fragments, so we need a fragment transaction
                FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();

                // Specify where to put the fragment as well as which fragment to use
                fragmentTransaction.replace(R.id.activity_child, new Child1Fragment());

                // Commit
                fragmentTransaction.commit();
            }
        });
    }

}
