package com.ethiopia.app.jokes;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by tibsolg on 6/10/2016.
 */
public class MyFragPagerAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment>pages=new ArrayList<>();
    public MyFragPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return pages.get(position);
    }

    @Override
    public int getCount() {
        return pages.size();
    }
    public void addPage(Fragment f)
    {
        pages.add(f);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return pages.get(position).toString();
    }
}
