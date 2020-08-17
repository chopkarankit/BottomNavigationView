package com.example.bottomnavigationview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity
{

    BottomNavigationView bottomNavigation;



    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigation = findViewById(R.id.bottom_navigation);
        bottomNavigation.setOnNavigationItemSelectedListener(navigationItemSelectedListener);
        openFragment(HomeFragment.newInstance("", ""));
    }

    public void openFragment(Fragment fragment)
    {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    BottomNavigationView.OnNavigationItemSelectedListener navigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener()
    {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item)
        {
            switch (item.getItemId())
            {
                case R.id.navigation_home:
                    openFragment(HomeFragment.newInstance("", ""));
                    return true;
                case R.id.navigation_search:
                    openFragment(SearchFragment.newInstance("", ""));
                    return true;
                case R.id.navigation_livevideo:
                    openFragment(LivevideoFragment.newInstance("", ""));
                    return true;
                case R.id.navigation_video:
                    openFragment(VideoFragment.newInstance("", ""));
                    return true;
                case R.id.navigation_account:
                    openFragment(AccountFragment.newInstance("", ""));
                    return true;
            }
            return false;
        }
    };
}