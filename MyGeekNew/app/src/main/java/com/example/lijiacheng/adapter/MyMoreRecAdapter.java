package com.example.lijiacheng.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.lijiacheng.bean.ZuiXin_L;
import com.example.lijiacheng.mygeeknew.R;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;

/**
 * Created by LijiaCheng on 2019/4/17.
 */

public class MyMoreRecAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;
    private ArrayList<ZuiXin_L.Top_storiesEntity> banner_List;
    private ArrayList<ZuiXin_L.StoriesEntity> data_List;
    private static final int TYPE_BANNER = 0;
    private static final int TYPE_TIME = 1;
    private static final int TYPE_NEWS = 2;
    private String mDate = "今日热闻";
    public MyMoreRecAdapter(Context context) {
        this.context = context;
        banner_List = new ArrayList<>();
        data_List = new ArrayList<>();
    }

    public void setBanner_List(ArrayList<ZuiXin_L.Top_storiesEntity> banner_List) {
        this.banner_List = banner_List;
        notifyDataSetChanged();
    }

    public void setData_List(ArrayList<ZuiXin_L.StoriesEntity> data_List) {
        this.data_List = data_List;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == TYPE_BANNER) {
            View view = View.inflate(context, R.layout.layout_ribao_banner, null);
            return new ViewHolder_Banner(view);
        } else if (viewType == TYPE_TIME) {
            View view = View.inflate(context, R.layout.layout_ribao_riqi, null);
            return new ViewHolder_Time(view);
        } else {
            View view = View.inflate(context, R.layout.layout_ribao_item, null);
            return new ViewHolder_News(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder holder, int position) {
        int itemViewType = getItemViewType(position);
        if (itemViewType==TYPE_BANNER){
            ViewHolder_Banner holder1 = (ViewHolder_Banner) holder;
            holder1.mBanner.setImages(banner_List)
                    .setImageLoader(new ImageLoader() {
                        @Override
                        public void displayImage(Context context, Object path, ImageView imageView) {
                            ZuiXin_L.Top_storiesEntity path1 = (ZuiXin_L.Top_storiesEntity) path;
                            Glide.with(context).load(path1.getImage()).into(imageView);
                        }
                    }).start();
        }else if(itemViewType==TYPE_TIME){
            ViewHolder_Time holder1 = (ViewHolder_Time) holder;
            holder1.mTv_Time.setText(mDate);
        }else{
            ViewHolder_News holder1 = (ViewHolder_News) holder;
            int newPostion = position-1;
            if (banner_List.size()>0){
                newPostion -= 1;
            }
            ZuiXin_L.StoriesEntity storiesBean = data_List.get(newPostion);
            holder1.mTv_data.setText(storiesBean.getTitle());
            Glide.with(context).load(storiesBean.getImages().get(0)).into(holder1.mImg);
        }
    }

    @Override
    public int getItemCount() {
        if (banner_List.size() > 0) {
            return 1 + 1 + data_List.size();
        } else {
            return 1 + data_List.size();
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (banner_List.size() > 0) {
            if (position == 0) {
                return TYPE_BANNER;
            } else if (position == 1) {
                return TYPE_TIME;
            } else {
                return TYPE_NEWS;
            }
        } else {
            if (position == 0) {
                return TYPE_TIME;
            } else {
                return TYPE_NEWS;
            }
        }
    }

    public class ViewHolder_Banner extends RecyclerView.ViewHolder {

        private Banner mBanner;

        public ViewHolder_Banner(View itemView) {
            super(itemView);
            mBanner = itemView.findViewById(R.id.Banner);
        }
    }

    public class ViewHolder_Time extends RecyclerView.ViewHolder {

        private TextView mTv_Time;

        public ViewHolder_Time(View itemView) {
            super(itemView);
            mTv_Time = itemView.findViewById(R.id.TextView);
        }
    }

    public class ViewHolder_News extends RecyclerView.ViewHolder {

        private TextView mTv_data;
        private ImageView mImg;

        public ViewHolder_News(View itemView) {
            super(itemView);
            mImg = itemView.findViewById(R.id.ImageView);
            mTv_data = itemView.findViewById(R.id.TextView);
        }
    }
}
