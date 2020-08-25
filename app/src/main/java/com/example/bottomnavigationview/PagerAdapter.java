package com.example.bottomnavigationview;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter extends FragmentPagerAdapter {

    private int numOfTabs;


    public PagerAdapter(FragmentManager fm, int numOfTabs)
    {
        super(fm,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.numOfTabs = numOfTabs;

    }

    @NonNull
    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0 :
                return new Home1Fragment();
            case 1 :
                return new Post1Fragment();
            case 2 :
                return new Video1Fragment();
            case 3 :
                return new Photos1Fragment();
            case 4 :
                return new Event1Fragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
