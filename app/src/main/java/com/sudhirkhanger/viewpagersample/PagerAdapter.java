package com.sudhirkhanger.viewpagersample;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class PagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 3;

    private String tabTitles[] = new String[]{"One", "Two", "Three"};

    private Context mContext;

    public PagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = Fragment.instantiate(mContext, FragmentOne.class.getName());
                break;
            case 1:
                fragment = Fragment.instantiate(mContext, FragmentTwo.class.getName());
                break;
            case 2:
                fragment = Fragment.instantiate(mContext, FragmentThree.class.getName());
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Generate title based on item position
        return tabTitles[position];
    }
}
