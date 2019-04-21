package com.example.lijiacheng.fragment;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.lijiacheng.adapter.MyV2EXAdapter;
import com.example.lijiacheng.mygeeknew.R;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class V2EXFragment extends Fragment {


    private View view;
    private ImageView mImageView;
    private TabLayout mTabLayout;
    private String attr;
    private ArrayList<String> strings;
    private String text;
    private String href;
    private ArrayList<Fragment> fragments;
    private ViewPager mViewPager;

    public V2EXFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_v2_ex, null);
        initView(inflate);
        initData();
        return inflate;
    }

    private static final String TAG = "V2EXFragment";

    private void initData() {
        strings = new ArrayList<>();
        new Thread() {
            @Override
            public void run() {
                try {
                    Document doc = Jsoup.connect("https://www.baidu.com/").get();
                    Elements element = doc.select("div#lg");
                    for (Element element1 : element) {
                        attr = element1.select("img").attr("src");
                        Log.e(TAG, "run: =================>" + attr);
                    }
                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(getContext(), attr, Toast.LENGTH_SHORT).show();
                            Glide.with(getActivity()).load("https:" + attr).into(mImageView);
                        }
                    });
                    Elements select = doc.select("div#u1");
                    Elements elements = select.select("a");
                    for (Element element1 : elements) {
                         href = element1.attr("href");
                        text = element1.text();
                        Log.e(TAG, "run: =================>" +href + "=========" + text);
                        strings.add(text);
                    }
                    getActivity().runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            fragments = new ArrayList<>();
                            for (int i = 0; i < strings.size(); i++) {
                                V2Fragment v2Fragment = new V2Fragment();
                                fragments.add(v2Fragment);
                                Bundle bundle = new Bundle();
                                bundle.putString("aaaa",strings.get(i)+"");
                                v2Fragment.setArguments(bundle);
                            }
                            mViewPager.setAdapter(new MyV2EXAdapter(getChildFragmentManager(),strings,fragments));
                            mTabLayout.setupWithViewPager(mViewPager);
                        }
                    });
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

    private void initView(View inflate) {
        mImageView = (ImageView) inflate.findViewById(R.id.ImageView);
        mTabLayout = (TabLayout) inflate.findViewById(R.id.TabLayout);
        mViewPager = (ViewPager) inflate.findViewById(R.id.ViewPager);
    }
}
