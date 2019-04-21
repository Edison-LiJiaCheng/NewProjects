package com.example.lijiacheng.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.example.lijiacheng.bean.XiTu_L;
import com.example.lijiacheng.mygeeknew.R;
import com.example.lijiacheng.widget.TouchCallBack;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by LijiaCheng on 2019/4/18.
 */

public class MyShowAdapter extends RecyclerView.Adapter<MyShowAdapter.ViewHolder> implements TouchCallBack{
    private ArrayList<XiTu_L>list;
    private Context context;

    public MyShowAdapter(Context context) {
        this.context = context;
        list=new ArrayList<>();
    }

    public void setList(ArrayList<XiTu_L> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = View.inflate(context, R.layout.layout_xitu_item, null);
        ViewHolder viewHolder = new ViewHolder(inflate);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final XiTu_L xiTuL = list.get(position);
        holder.mTv.setText(xiTuL.title);
        holder.mS.setChecked(xiTuL.isChecked);
        holder.mS.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                xiTuL.isChecked = isChecked;
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public void onItemMove(int fromPosition, int toPosition) {
        Collections.swap(list,fromPosition,toPosition);
        notifyItemMoved(fromPosition,toPosition);
    }

    @Override
    public void onItemDelete(int position) {
        list.remove(position);
        notifyItemRemoved(position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private SwitchCompat mS;
        private TextView mTv;

        public ViewHolder(View itemView) {
            super(itemView);
            mTv = itemView.findViewById(R.id.TextView);
            mS = itemView.findViewById(R.id.SwitchCompat);
        }
    }
}
