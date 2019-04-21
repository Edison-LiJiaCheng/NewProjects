package com.example.lijiacheng.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.lijiacheng.mygeeknew.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class V2Fragment extends Fragment {


    private View view;
    /**
     * Hello blank fragment
     */
    private TextView mTextView;

    public V2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View inflate = inflater.inflate(R.layout.fragment_v2, null);
        initView(inflate);
        return inflate;
    }

    private void initView(View inflate) {
        mTextView = (TextView) inflate.findViewById(R.id.TextView);
        Bundle arguments = getArguments();
        String aaaa = arguments.getString("aaaa");
        mTextView.setText(aaaa+"");
    }
}
