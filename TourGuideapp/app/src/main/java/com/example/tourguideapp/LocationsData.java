package com.example.tourguideapp;

import java.util.ArrayList;

public class LocationsData {

    private ArrayList<Location> locations = new ArrayList<>();

    public LocationsData(){

        locations.add(new Location(R.drawable.pyramids_of_giza, R.string.giza_necropolis, R.string.giza_necropolis_address));
        locations.add(new Location(R.drawable.pyramids_of_giza,R.string.khan_elKhalili, R.string.khan_elKhalili_address));
        locations.add(new Location(R.drawable.pyramids_of_giza,R.string.pyramid_of_djoser, R.string.pyramid_of_djoser_address));
        locations.add(new Location(R.drawable.pyramids_of_giza,R.string.cairo_citadel, R.string.cairo_citadel_address));
        locations.add(new Location(R.drawable.pyramids_of_giza,R.string.the_hanging_church, R.string.the_hanging_church_address));
        locations.add(new Location(R.drawable.pyramids_of_giza,R.string.mosque_of_muhammad_ali,R.string.mosque_of_muhammad_ali_address));
        locations.add(new Location(R.drawable.pyramids_of_giza,R.string.egyptian_museum,R.string.egyptian_museum_address));
        locations.add(new Location(R.drawable.pyramids_of_giza,R.string.cairo_tower,R.string.cairo_tower_address));





    }

    public  ArrayList<Location> getLocations()
    {

        return  locations;
    }



}
