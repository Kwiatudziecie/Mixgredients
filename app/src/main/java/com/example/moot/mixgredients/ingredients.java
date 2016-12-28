package com.example.moot.mixgredients;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;


/**
 * A simple {@link Fragment} subclass.
 */
public class ingredients extends Fragment {

    public ingredients() {
        // Required empty public constructor
    }

    //RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_ingredients, container, false);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setTitle("Mixgredients");
        //recyclerView= (RecyclerView) rootView.findViewById(R.id.recyclerView);
        String[] values = new String[] { "Cheese",
                "Maccaroni",
                "Ketchup"};

        TextView xmll;
        xmll= (TextView) rootView.findViewById(R.id.smalltext);
        String s = "abc";
        RetrieveFeedTask task = new RetrieveFeedTask();
        task.execute();

        try {
            s=task.get();
//            JSONObject obj = new JSONObject(s);
//            JSONArray array = obj.getJSONArray("hits");
//            s="";
//            for (int i=0; i<array.length(); i++){
//
//                s+=array.getJSONObject(i).getJSONObject("recipe").getString("label") + ", ";
//
//            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
//        } catch (JSONException e) {
//            e.printStackTrace();
        }




        xmll.setText(s);




      //  ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity().getBaseContext(), android.R.layout.simple_list_item_1, values);
      //  listView.setAdapter(adapter);
        FloatingActionButton fab = (FloatingActionButton) rootView.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        // Inflate the layout for this fragment
        return rootView;
    }

}
