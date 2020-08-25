package com.example.bottomnavigationview;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter3 extends FragmentPagerAdapter {

    private int NumOfTabs3;

    public PagerAdapter3(FragmentManager fmr, int NumOfTabs3)
    {
        super(fmr,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.NumOfTabs3 = NumOfTabs3;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0:
                return new GThisHourFragment();
            case 1:
                return new Last24HoursFragment();
            case 2:
                return new Last7DaysFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return NumOfTabs3;
    }
}
