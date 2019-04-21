package com.example.lijiacheng.mygeeknew;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;
import android.widget.TextView;

import com.example.lijiacheng.adapter.MyShowAdapter;
import com.example.lijiacheng.bean.XiTu_L;
import com.example.lijiacheng.widget.SimpleItemTouchCallBack;

import java.util.ArrayList;

public class ShowActivity extends AppCompatActivity {

    /**
     * <---
     */
    private Toolbar mToolbar;
    private RecyclerView mRecyclerView;
    private ArrayList<XiTu_L> aaa;
    private MyShowAdapter myShowAdapter;
    /**
     * 首页特别展示
     */
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        initView();
    }

    private void initView() {
        mTextView = (TextView) findViewById(R.id.TextView);
        mToolbar = (Toolbar) findViewById(R.id.Toolbar);
        mRecyclerView = (RecyclerView) findViewById(R.id.RecyclerView);
        mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAct();
            }
        });
        mToolbar.setTitle("");
        setSupportActionBar(mToolbar);
        aaa = (ArrayList<XiTu_L>) getIntent().getSerializableExtra("aaa");
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        myShowAdapter = new MyShowAdapter(this);
        mRecyclerView.setAdapter(myShowAdapter);
        myShowAdapter.setList(aaa);

        SimpleItemTouchCallBack itemTouchCallBack = new SimpleItemTouchCallBack(myShowAdapter);
        itemTouchCallBack.setSwipeEnable(false);
        ItemTouchHelper helper = new ItemTouchHelper(itemTouchCallBack);
        helper.attachToRecyclerView(mRecyclerView);
    }

    private void finishAct() {
        Intent intent = new Intent();
        intent.putExtra("data", aaa);
        setResult(152, intent);
        finish();
    }
}
