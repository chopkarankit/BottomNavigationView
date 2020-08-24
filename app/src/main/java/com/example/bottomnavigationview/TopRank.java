package com.example.bottomnavigationview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class TopRank extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_rank);

        TabLayout tabLayout = findViewById(R.id.tpr4);
        findViewById(R.id.beansGot);
        findViewById(R.id.giftsSent);
        final ViewPager viewPager = findViewById(R.id.viewpager1);

        PagerAdapter1 pagerAdapter1 = new PagerAdapter1(getSupportFragmentManager(), tabLayout.getTabCount());

        viewPager.setAdapter(pagerAdapter1);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}