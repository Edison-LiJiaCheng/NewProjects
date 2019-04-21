package com.example.lijiacheng.fragment;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.lijiacheng.adapter.MyXuTuAdapter;
import com.example.lijiacheng.bean.ReMen_L;
import com.example.lijiacheng.bean.XiTu_L;
import com.example.lijiacheng.bean.ZhuanLan_L;
import com.example.lijiacheng.bean.ZuiXin_L;
import com.example.lijiacheng.mygeeknew.R;
import com.example.lijiacheng.mygeeknew.ShowActivity;
import com.example.lijiacheng.presenter.Presenter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class XiTuFragment extends Fragment {
    private View view;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private MyXuTuAdapter myXuTuAdapter;
    private ImageView mImageView;
    private ArrayList<XiTu_L> mTitles;
    private ArrayList<Fragment> fragments;

    public XiTuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_xi_tu, null);
        initView(view);
        initListener();

        return view;
    }

    private void initData() {
        myXuTuAdapter = new MyXuTuAdapter(getChildFragmentManager(),fragments,mTitles);
        mViewPager.setAdapter(myXuTuAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }

    private void initView(View view) {
        mTabLayout = (TabLayout) view.findViewById(R.id.TabLayout);
        mImageView = (ImageView) view.findViewById(R.id.ImageView);
        mViewPager = (ViewPager) view.findViewById(R.id.ViewPager);
        initTitles();



    }

    private void initListener() {
        mImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ShowActivity.class);
                intent.putExtra("aaa",mTitles);
                startActivityForResult(intent,100);
            }
        });
    }

    private void setFragments() {
        fragments = new ArrayList<>();

        for (int i = 0; i < mTitles.size(); i++) {
            if (mTitles.get(i).isChecked){
                JueJinFragment jueJinFragment = new JueJinFragment();
                fragments.add(jueJinFragment);
                Bundle bundle = new Bundle();
                bundle.putString("data",mTitles.get(i).title+"");
                jueJinFragment.setArguments(bundle);
            }
        }

        initData();
    }

    private void initTitles() {
        mTitles = new ArrayList<>();
        mTitles.add(new XiTu_L("Android", true));
        mTitles.add(new XiTu_L("iOS", true));
        mTitles.add(new XiTu_L("设计", true));
        mTitles.add(new XiTu_L("工具资源", true));
        mTitles.add(new XiTu_L("产品", true));
        mTitles.add(new XiTu_L("阅读", true));
        mTitles.add(new XiTu_L("前端", true));
        mTitles.add(new XiTu_L("后端", true));
        setFragments();
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (data != null){
            if (requestCode == 100 && resultCode == 152){
                mTitles = (ArrayList<XiTu_L>) data.getSerializableExtra("data");
                setFragments();
            }
        }
    }
}
