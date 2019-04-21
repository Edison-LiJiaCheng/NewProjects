package com.example.lijiacheng.fragment;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lijiacheng.adapter.MyFragmentAdapter;
import com.example.lijiacheng.mygeeknew.R;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ZhuFuFragment extends Fragment {

    private View view;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private String[]title={"日报","专栏","热门"};
    private ArrayList<Fragment> fragments;
    private MyFragmentAdapter myFragmentAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_zhu_fu, null);
        initView(view);
        initData();
        return view;
    }

    private void initData() {
        fragments = new ArrayList<>();
        fragments.add(new RiBaoFragment());
        fragments.add(new ZhuLanFragment());
        fragments.add(new ReMenFragment());
        myFragmentAdapter = new MyFragmentAdapter(getChildFragmentManager(), fragments, title);
        mViewPager.setAdapter(myFragmentAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }

    private void initView(View view) {
        mTabLayout = (TabLayout) view.findViewById(R.id.TabLayout);
        mViewPager = (ViewPager) view.findViewById(R.id.ViewPager);
    }
}
