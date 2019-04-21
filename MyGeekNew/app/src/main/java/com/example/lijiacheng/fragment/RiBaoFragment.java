package com.example.lijiacheng.fragment;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

import com.example.lijiacheng.adapter.MyMoreRecAdapter;
import com.example.lijiacheng.bean.ReMen_L;
import com.example.lijiacheng.bean.ZhuanLan_L;
import com.example.lijiacheng.bean.ZuiXin_L;
import com.example.lijiacheng.mygeeknew.R;
import com.example.lijiacheng.presenter.Presenter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RiBaoFragment extends Fragment implements I_View, View.OnClickListener {


    private View view;
    private RecyclerView mRecyclerView;
    private MyMoreRecAdapter myMoreRecAdapter;
    private Presenter presenter;
    private FloatingActionButton mFloatingActionButton;
    private PopupWindow popupWindow;

    public RiBaoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_ri_bao, null);
        // Inflate the layout for this fragment
        initView(view);
        initPresenter();
        return view;
    }

    private void initPresenter() {
        presenter = new Presenter(this);
        presenter.presenter_ZuiXin_Banner();
        presenter.presenter_ZuiXin_Data();
    }

    private void initView(View view) {
        mRecyclerView = (RecyclerView) view.findViewById(R.id.RecyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        myMoreRecAdapter = new MyMoreRecAdapter(getContext());
        mRecyclerView.setAdapter(myMoreRecAdapter);
        mFloatingActionButton = (FloatingActionButton) view.findViewById(R.id.FloatingActionButton);
        mFloatingActionButton.setOnClickListener(this);
    }

    @Override
    public void view_ZuiXin_Data(ArrayList<ZuiXin_L.StoriesEntity> list) {
        myMoreRecAdapter.setData_List(list);
    }

    @Override
    public void view_ZuiXin_Banner(ArrayList<ZuiXin_L.Top_storiesEntity> list) {
        myMoreRecAdapter.setBanner_List(list);
    }

    @Override
    public void view_ZhuanLian_Data(ArrayList<ZhuanLan_L.DataEntity> list) {

    }

    @Override
    public void view_ReMen_Data(ArrayList<ReMen_L.RecentEntity> list) {

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.FloatingActionButton:
                View view = View.inflate(getContext(), R.layout.layout_riqi_button, null);
                popupWindow = new PopupWindow(view, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                popupWindow.setBackgroundDrawable(null);
                popupWindow.setOutsideTouchable(true);
                popupWindow.setAnimationStyle(R.style.PopAnimation);
                popupWindow.showAtLocation(mFloatingActionButton,Gravity.CENTER,0,0);
                break;
        }
    }
}
