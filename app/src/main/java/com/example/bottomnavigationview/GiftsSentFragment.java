package com.example.bottomnavigationview;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.tabs.TabLayout;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link GiftsSentFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class GiftsSentFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public GiftsSentFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment GiftsSentFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static GiftsSentFragment newInstance(String param1, String param2) {
        GiftsSentFragment fragment = new GiftsSentFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v2 = inflater.inflate(R.layout.fragment_gifts_sent, container, false);
        TabLayout tabLayout = v2.findViewById(R.id.fgs);
        v2.findViewById(R.id.fgs1);
        v2.findViewById(R.id.fgs2);
        v2.findViewById(R.id.fgs3);
        final ViewPager viewPager = v2.findViewById(R.id.vp2);

        PagerAdapter3 pagerAdapter3 = new PagerAdapter3(getChildFragmentManager(), tabLayout.getTabCount());

        viewPager.setAdapter(pagerAdapter3);

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
        // Inflate the layout for this fragment
        return v2;
    }
}