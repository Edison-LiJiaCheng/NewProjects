package com.example.lijiacheng.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;
import com.example.lijiacheng.bean.ZhuanLan_L;
import com.example.lijiacheng.mygeeknew.R;

import java.util.ArrayList;

/**
 * Created by LijiaCheng on 2019/4/17.
 */

public class MyRecAdapter extends RecyclerView.Adapter<MyRecAdapter.ViewHolder>{
    private ArrayList<ZhuanLan_L.DataEntity>list;
    private Context context;

    public MyRecAdapter(Context context) {
        this.context = context;
        list=new ArrayList<>();
    }

    public void setList(ArrayList<ZhuanLan_L.DataEntity> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyRecAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.layout_zhuanlan_item, null);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecAdapter.ViewHolder holder, int position) {
        ZhuanLan_L.DataEntity dataEntity = list.get(position);
        RoundedCorners roundedCorners = new RoundedCorners(20);
        RequestOptions requestOptions = RequestOptions.bitmapTransform(roundedCorners);
        Glide.with(context).load(dataEntity.getThumbnail()).apply(requestOptions).into(holder.mImg);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView mImg;

        public ViewHolder(View itemView) {
            super(itemView);
            mImg = itemView.findViewById(R.id.ImageView);
        }
    }
}
