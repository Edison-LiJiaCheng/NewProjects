package com.example.dome;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.dome.adapter.MyRecAdapter;
import com.example.dome.bean.Shu;
import com.example.dome.contract.MainContract;
import com.example.dome.presenter.MainPresenter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainContract.MainView {
    private static final String TAG = "MainActivity";
    private RecyclerView mRecyclerView;
    private MyRecAdapter myRecAdapter;
    private MainPresenter mainPresenter;

    /**
     * Hello World!
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.RecyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        myRecAdapter = new MyRecAdapter(this);
        mRecyclerView.setAdapter(myRecAdapter);
        mainPresenter = new MainPresenter(this);
        mainPresenter.dataPresenter();
    }

    @Override
    public void dataYesView(Shu shu) {
        ArrayList<Shu.DataBean> data = (ArrayList<Shu.DataBean>) shu.getData();
        myRecAdapter.setList(data);
    }

    @Override
    public void dataNoView(String data) {
        Log.e(TAG, "dataNoView: "+data );
    }
}
