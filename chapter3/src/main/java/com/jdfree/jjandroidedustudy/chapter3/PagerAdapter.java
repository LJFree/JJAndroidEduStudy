package com.jdfree.jjandroidedustudy.chapter3;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class PagerAdapter extends FragmentPagerAdapter {

    ArrayList<Fragment> mData;

    public PagerAdapter(FragmentManager fm) {
        super(fm);

        mData = new ArrayList<>();
        mData.add(new BlankFragment());
        mData.add(new BlankFragment2());
    }

    @Override
    public Fragment getItem(int position) {
        return mData.get(position);
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return position + "번쨰";
    }
}
