package com.example.tourguideapp;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


public class TabsFragmentAdapter extends FragmentStatePagerAdapter {

    /**
     * Context of the app
     */
    private Context mContext;

    public TabsFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;

    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new LandMarksFragment();
            case 1:
                return new MuseumsFragment();
            case 2:
                return new RestaurantsFragment();
            case 3:
                return new HotelsFragment();
            default:
                return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return mContext.getString(R.string.category_land_marks) ;
            case 1:
                 return mContext.getString(R.string.category_museums) ;
            case 2:
                return mContext.getString(R.string.category_restaurants) ;
            case 3:
                return mContext.getString(R.string.category_hotels) ;
            default:
                return null;
        }    }
}
