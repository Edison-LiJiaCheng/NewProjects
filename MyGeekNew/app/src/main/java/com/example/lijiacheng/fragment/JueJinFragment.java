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
public class JueJinFragment extends Fragment {


    private View view;
    /**
     * Hello blank fragment
     */
    private TextView mTextView;

    public JueJinFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_jue_jin, null);
        initView(view);
        return view;
    }

    private void initView(View view) {
        mTextView = (TextView) view.findViewById(R.id.TextView);
        Bundle arguments = getArguments();
        String data = arguments.getString("data");
        mTextView.setText(data+"");
    }
}
