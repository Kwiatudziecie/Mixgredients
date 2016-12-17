package com.example.moot.mixgredients;


import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class recipe extends Fragment {


    public recipe() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_recipe, container, false);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Recipies");
        final TextView textView = (TextView) rootView.findViewById(R.id.textView2);
        final ImageView imageView = (ImageView) rootView.findViewById(R.id.imageView);
        final TextView textView2 = (TextView) rootView.findViewById(R.id.textView3);

        // Inflate the layout for this fragment
        return rootView;
    }

}
