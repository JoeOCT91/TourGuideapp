package com.example.tourguideapp;

import android.content.res.Resources;

/**
 * {@link Location} represents a vocabulary word that the user wants to learn.
 * It contains resource IDs for the default translation, Miwok translation, audio file, and
 * optional image file for that word.
 */
public class Location {

    /**
     * String resource ID for the location Picture
     */
    private int mLocationPictureId;

    /**
     * String resource ID for the location name
     */
    private int mLocationTittleId;

    /**
     * String resource ID for the location address
     */
    private int mLocationAddressId;

    /**
     * String resource ID for the location information
     */
    private int mLocationInfoId;

    /**
     * String resource ID for the location category
     */
    private int mCategory;

    /**
     * Constant value that represents no image was provided for this word
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new location object.
     *
     * @param locationPictureId is the string resource ID for the location picture
     * @param locationTittleId  is the string resource Id name of the loaction
     * @param locationAddressId is the resource ID for the location address
     */
    public Location(int locationPictureId, int locationTittleId, int locationAddressId) {
        mLocationPictureId = locationPictureId;
        mLocationTittleId = locationTittleId;
        mLocationAddressId = locationAddressId;
    }

    /**
     * Create a new location object.
     *
     * @param locationPictureId is the string resource ID for the location picture
     * @param locationTittleId  is the string resource Id name of the location
     * @param locationAddressId is the resource ID for the location address
     * @param locationInfoId    is the resource ID for the location information
     */

    public Location(int locationPictureId, int locationTittleId, int locationAddressId,
                    int locationInfoId, int category) {
        mLocationPictureId = locationPictureId;
        mLocationTittleId = locationTittleId;
        mLocationAddressId = locationAddressId;
        mLocationInfoId = locationInfoId;
        mCategory = category;
    }


    /**
     * Get the string resource ID for the location picture.
     */
    public int getLocationPictureID() {
        return mLocationPictureId;
    }

    /**
     * Get the string resource ID for the name of the location.
     */
    public int getLocationtittle() {
        return mLocationTittleId;
    }

    /**
     * Return the address resource ID of the location.
     */
    public int getLocationAddress() {
        return mLocationAddressId;
    }

    /**
     * Return the address resource ID of the location.
     */
    public int getLocationInfo() {
        return mLocationInfoId;
    }

    /**
     * Return the category resource ID of the location.
     */
    public String getLocationCategory() {

        String category = Resources.getSystem().getString(mCategory);


        return category ;
    }

}

