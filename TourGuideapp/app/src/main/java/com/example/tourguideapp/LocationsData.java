package com.example.tourguideapp;

import android.content.res.Resources;
import android.util.Log;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.ArrayList;


public class LocationsData {

    private ArrayList<Location> locations = new ArrayList<>();

    public LocationsData() {

        locations.add(new Location(R.drawable.giza_necropolis, R.string.giza_necropolis,
                R.string.giza_necropolis_address, R.string.giza_necropolis_information, R.string.category_land_marks));
        locations.add(new Location(R.drawable.khan, R.string.khan_elKhalili,
                R.string.khan_elKhalili_address, R.string.khan_elKhalili_information, R.string.category_land_marks));
        locations.add(new Location(R.drawable.pyramid_of_djoser, R.string.pyramid_of_djoser,
                R.string.pyramid_of_djoser_address, R.string.pyramid_of_djoser_information, R.string.category_land_marks));
        locations.add(new Location(R.drawable.cairo_citadel, R.string.cairo_citadel,
                R.string.cairo_citadel_address, R.string.cairo_citadel_information, R.string.category_land_marks));
        locations.add(new Location(R.drawable.hanging, R.string.the_hanging_church,
                R.string.the_hanging_church_address, R.string.the_hanging_church_information, R.string.category_land_marks));
        locations.add(new Location(R.drawable.mohammad_ali_mosque, R.string.mosque_of_muhammad_ali,
                R.string.mosque_of_muhammad_ali_address, R.string.mosque_of_muhammad_ali_information, R.string.category_land_marks));
        locations.add(new Location(R.drawable.egyptian_museum, R.string.egyptian_museum,
                R.string.egyptian_museum_address, R.string.egyptian_museum_information, R.string.category_land_marks));
        locations.add(new Location(R.drawable.cairo_tower, R.string.cairo_tower, R.string.cairo_tower_address,
                R.string.cairo_tower_information, R.string.category_land_marks));

        locations.add(new Location(R.drawable.islamic_art, R.string.museum_of_islamic_art, R.string.museum_of_islamic_art_address,
                R.string.museum_of_islamic_art_info, R.string.category_museums));




    }

    

    public ArrayList<Location> getLocations(String category) {

        ArrayList<Location> locationByCategory = new ArrayList<>();

        for (int n = 0; n <= locations.size(); n++) {

            if (category == locations.get(n).getLocationCategory()) {

                locationByCategory.add(n, locations.get(n));

            }
        }

        return locationByCategory;
    }


}
