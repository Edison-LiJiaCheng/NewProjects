package com.example.lijiacheng.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.lijiacheng.bean.ReMen_L;
import com.example.lijiacheng.bean.XiTu_L;

import java.util.ArrayList;

/**
 * Created by LijiaCheng on 2019/4/18.
 */

public class MyXuTuAdapter extends FragmentStatePagerAdapter{
    private ArrayList<XiTu_L>xiTu_list;
    private ArrayList<String> mNewTitles = new ArrayList<>();
    private ArrayList<Fragment>fragment_list;
    public MyXuTuAdapter(FragmentManager fm,ArrayList<Fragment>fragment_list,ArrayList<XiTu_L>xiTu_list) {
        super(fm);
        this.fragment_list=fragment_list;
        this.xiTu_list=xiTu_list;
        for (int i = 0; i < xiTu_list.size(); i++) {
            XiTu_L bean = xiTu_list.get(i);
            if (bean.isChecked){
                mNewTitles.add(bean.title);
            }
        };
    }

    @Override
    public Fragment getItem(int position) {
        return fragment_list.get(position);
    }

    @Override
    public int getCount() {
        return fragment_list.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mNewTitles.get(position);
    }
}
