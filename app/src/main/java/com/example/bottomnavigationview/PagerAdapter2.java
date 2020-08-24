package com.example.bottomnavigationview;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter2 extends FragmentPagerAdapter {

    private int NumOfTabs2;


    public PagerAdapter2 (FragmentManager fmmm, int NumOfTabs2)
    {
        super(fmmm);
        this.NumOfTabs2 = NumOfTabs2;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0:
                return new ThisHourFragment();
            case 1:
                return new TodayFragment();
            case 2:
                return new ThisWeekFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NumOfTabs2;
    }
}
