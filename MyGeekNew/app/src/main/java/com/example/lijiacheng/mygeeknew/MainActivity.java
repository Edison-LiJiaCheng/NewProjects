package com.example.lijiacheng.mygeeknew;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.lijiacheng.fragment.GanHuoFragment;
import com.example.lijiacheng.fragment.GuanYuFragment;
import com.example.lijiacheng.fragment.SheZhiFragment;
import com.example.lijiacheng.fragment.ShouCangFragment;
import com.example.lijiacheng.fragment.V2EXFragment;
import com.example.lijiacheng.fragment.WeiXinFragment;
import com.example.lijiacheng.fragment.XiTuFragment;
import com.example.lijiacheng.fragment.ZhuFuFragment;
import com.miguelcatalan.materialsearchview.MaterialSearchView;

import java.util.ArrayList;

//李嘉诚
public class MainActivity extends AppCompatActivity {

    /**
     * 知乎日报
     */
    private TextView mTextView;
    private Toolbar mToolbar;
    private NavigationView mNavigationView;
    private DrawerLayout mDrawerLayout;
    private FragmentManager manager;
    private ArrayList<Fragment> fragments;
    private int lastFragmentPosition = 0;
    private MaterialSearchView mMaterialSearchView;
    private MenuItem soSuo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //获得组件
        initView();
        //数据
        initData();
        //ToolBar侧滑连动
        initLianDong();

    }

    private void initLianDong() {
        mToolbar.setTitle("");
        setSupportActionBar(mToolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, 0, 0);
        mDrawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() != R.id.item_ZhiXun && item.getItemId() != R.id.item_XuanXiang) {
                    mDrawerLayout.closeDrawer(Gravity.LEFT);
                    item.setChecked(true);
                    mTextView.setText(item.getTitle());
                    switch (item.getItemId()) {
                        case R.id.item_ZhiHuRiBao:
                            switchFragment(0);
                            break;
                        case R.id.item_WeiXinJingXuan:
                            switchFragment(1);
                            break;
                        case R.id.item_GanHuoJiZhongYing:
                            switchFragment(2);
                            break;
                        case R.id.item_XiTuJueJin:
                            switchFragment(3);
                            break;
                        case R.id.item_V2EX:
                            switchFragment(4);
                            break;
                        case R.id.item_ShouChang:
                            switchFragment(5);
                            break;
                        case R.id.item_SheZhi:
                            switchFragment(6);
                            break;
                        case R.id.item_GuanYu:
                            switchFragment(7);
                            break;
                    }
                } else {
                    item.setChecked(false);
                }
                return false;
            }
        });
        mMaterialSearchView.setOnQueryTextListener(new MaterialSearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        mMaterialSearchView.setOnSearchViewListener(new MaterialSearchView.SearchViewListener() {
            @Override
            public void onSearchViewShown() {
                Toast.makeText(MainActivity.this, "展开", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onSearchViewClosed() {
                Toast.makeText(MainActivity.this, "关闭", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void switchFragment(int type) {
        //开启事务
        FragmentTransaction transaction = manager.beginTransaction();
        //获取下标的list
        Fragment fragment = fragments.get(type);
        //是否等于null
        if (!fragment.isAdded()) {
            //添加到布局中
            transaction.add(R.id.FrameLayout, fragment);
        }
        //隐藏上一个
        transaction.hide(fragments.get(lastFragmentPosition));
        //显示当时的fragment
        transaction.show(fragment);
        //发送事务
        transaction.commit();
        //下标赋值给int值
        lastFragmentPosition = type;

        //显示隐藏搜索框
        if (type == 1 || type == 2) {
            soSuo.setVisible(true);
        } else {
            soSuo.setVisible(false);
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.sousuo_menu, menu);
        soSuo = menu.findItem(R.id.item_sosuo);
        soSuo.setVisible(false);
        mMaterialSearchView.setMenuItem(soSuo);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (mMaterialSearchView.isSearchOpen()) {
            mMaterialSearchView.closeSearch();
        } else {
            super.onBackPressed();
        }
    }

    private void initData() {
        manager = getSupportFragmentManager();
        fragments = new ArrayList<>();
        fragments.add(new ZhuFuFragment());
        fragments.add(new WeiXinFragment());
        fragments.add(new GanHuoFragment());
        fragments.add(new XiTuFragment());
        fragments.add(new V2EXFragment());
        fragments.add(new ShouCangFragment());
        fragments.add(new SheZhiFragment());
        fragments.add(new GuanYuFragment());
        //默认显示第一个
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.FrameLayout, fragments.get(0));
        transaction.commit();
    }

    private void initView() {
        mTextView = (TextView) findViewById(R.id.TextView);
        mToolbar = (Toolbar) findViewById(R.id.Toolbar);
        mNavigationView = (NavigationView) findViewById(R.id.NavigationView);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.DrawerLayout);
        mMaterialSearchView = (MaterialSearchView) findViewById(R.id.MaterialSearchView);
    }
}
