package com.example.tourguideapp;


import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 *
 *
 *
 */

public class LandMarksFragment extends Fragment {


    public LandMarksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView  = inflater.inflate(R.layout.location_list, container, false);


        String category = getString(R.string.category_land_marks);



        final LocationsData data = new LocationsData();
        final ArrayList<Location> locations = data.getLocations(category);


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        LocationAdapter adapter = new LocationAdapter(getActivity(), locations);
        ListView listview = rootView.findViewById(R.id.list);
        listview.setAdapter(adapter);







        return rootView;
    }

}
