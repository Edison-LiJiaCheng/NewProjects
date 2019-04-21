package com.example.lijiacheng.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by LijiaCheng on 2019/4/19.
 */

public class MyV2EXAdapter extends FragmentStatePagerAdapter{
    private ArrayList<String>title_list;
    private ArrayList<Fragment>fargment_list;
    public MyV2EXAdapter(FragmentManager fm,ArrayList<String>title_list,ArrayList<Fragment>fargment_list) {
        super(fm);
        this.title_list=title_list;
        this.fargment_list=fargment_list;
    }

    @Override
    public Fragment getItem(int position) {
        return fargment_list.get(position);
    }

    @Override
    public int getCount() {
        return fargment_list.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return title_list.get(position);
    }
}
