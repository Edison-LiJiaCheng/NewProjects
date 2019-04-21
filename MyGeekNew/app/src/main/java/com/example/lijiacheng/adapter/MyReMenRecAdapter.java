package com.example.lijiacheng.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.lijiacheng.bean.ReMen_L;
import com.example.lijiacheng.mygeeknew.R;

import java.util.ArrayList;

/**
 * Created by LijiaCheng on 2019/4/17.
 */

public class MyReMenRecAdapter extends RecyclerView.Adapter<MyReMenRecAdapter.ViewHolder>{
    private ArrayList<ReMen_L.RecentEntity>list;
    private Context context;

    public MyReMenRecAdapter(Context context) {
        this.context = context;
        list=new ArrayList<>();
    }

    public void setList(ArrayList<ReMen_L.RecentEntity> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.layout_ribao_item, null);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ReMen_L.RecentEntity recentEntity = list.get(position);
        Glide.with(context).load(recentEntity.getThumbnail()).into(holder.mImg);
        holder.mTv.setText(recentEntity.getTitle());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView mTv;
        private ImageView mImg;

        public ViewHolder(View itemView) {
            super(itemView);
            mImg = itemView.findViewById(R.id.ImageView);
            mTv = itemView.findViewById(R.id.TextView);
        }
    }
}
