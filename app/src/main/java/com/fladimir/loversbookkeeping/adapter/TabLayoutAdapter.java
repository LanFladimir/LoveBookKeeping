package com.fladimir.loversbookkeeping.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by NingJiang on 2017/6/1.
 * Class Note:
 */

public class TabLayoutAdapter extends FragmentPagerAdapter {
    private String[] tabs;
    private Fragment[] fragments;

    public TabLayoutAdapter(FragmentManager fm, String[] tabs, Fragment[] fragments) {
        super(fm);
        this.tabs = tabs;
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int i) {
        return fragments[i];
    }

    @Override
    public int getCount() {
        return tabs.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position % tabs.length];
    }
}
