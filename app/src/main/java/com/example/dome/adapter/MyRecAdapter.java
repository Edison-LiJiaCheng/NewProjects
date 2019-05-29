package com.example.dome.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.dome.R;
import com.example.dome.bean.Shu;

import java.util.ArrayList;

public class MyRecAdapter extends RecyclerView.Adapter<MyRecAdapter.ViewHolder> {

    private ArrayList<Shu.DataBean>list;
    private Context context;

    public MyRecAdapter(Context context) {
        this.context = context;
        list=new ArrayList<>();
    }

    public void setList(ArrayList<Shu.DataBean> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = View.inflate(context, R.layout.layout_rec_item, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Shu.DataBean shu = list.get(i);
        Glide.with(context).load(shu.getPic()).into(viewHolder.mImg);
        viewHolder.mTv.setText(shu.getTitle());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView mImg;
        private TextView mTv;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mImg = itemView.findViewById(R.id.ImageView);
            mTv = itemView.findViewById(R.id.TextView);
        }
    }
}
