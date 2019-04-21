package com.example.lijiacheng.widget;

/**
 * Created by LijiaCheng on 2019/4/19.
 */

public interface TouchCallBack {
    //条目移动
    void onItemMove(int fromPosition, int toPosition);

    //滑动
    void onItemDelete(int position);
}
