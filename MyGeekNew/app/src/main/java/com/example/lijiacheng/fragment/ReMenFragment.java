package com.example.lijiacheng.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lijiacheng.adapter.MyReMenRecAdapter;
import com.example.lijiacheng.bean.ReMen_L;
import com.example.lijiacheng.bean.ZhuanLan_L;
import com.example.lijiacheng.bean.ZuiXin_L;
import com.example.lijiacheng.mygeeknew.R;
import com.example.lijiacheng.presenter.Presenter;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReMenFragment extends Fragment implements I_View{


    private View view;
    private RecyclerView mRecyclerView;
    private MyReMenRecAdapter myReMenRecAdapter;
    private Presenter presenter;

    public ReMenFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_re_men, null);
        initView(view);
        initPresenter();
        return view;
    }

    private void initPresenter() {
        presenter = new Presenter(this);
        presenter.presenter_ReMen_Data();
    }

    private void initView(View view) {
        mRecyclerView = (RecyclerView) view.findViewById(R.id.RecyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        myReMenRecAdapter = new MyReMenRecAdapter(getContext());
        mRecyclerView.setAdapter(myReMenRecAdapter);
    }

    @Override
    public void view_ZuiXin_Data(ArrayList<ZuiXin_L.StoriesEntity> list) {

    }

    @Override
    public void view_ZuiXin_Banner(ArrayList<ZuiXin_L.Top_storiesEntity> list) {

    }

    @Override
    public void view_ZhuanLian_Data(ArrayList<ZhuanLan_L.DataEntity> list) {

    }

    @Override
    public void view_ReMen_Data(ArrayList<ReMen_L.RecentEntity> list) {
        myReMenRecAdapter.setList(list);
    }
}
