package com.example.bottomnavigationview;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class PagerAdapter1 extends FragmentPagerAdapter {

    private int numOfTabs1;

    public PagerAdapter1 (FragmentManager fmm, int numOfTabs1){
        super(fmm,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        this.numOfTabs1 = numOfTabs1;
    }
    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position)
        {
            case 0:
                return new BeansGotFragment();
            case 1:
                return new GiftsSentFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs1;
    }
}
