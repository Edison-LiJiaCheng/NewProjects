package com.example.lijiacheng.widget;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

/**
 * Created by LijiaCheng on 2019/4/19.
 */

public class SimpleItemTouchCallBack extends ItemTouchHelper.Callback {

    TouchCallBack touchCallBack;
    private boolean swipeEnable = true;

    public SimpleItemTouchCallBack(TouchCallBack touchCallBack) {
        this.touchCallBack = touchCallBack;
    }

    @Override
    public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            //允许上下拖拽
        int drag = ItemTouchHelper.UP | ItemTouchHelper.DOWN;
            //允许向左滑动
        int swipe = ItemTouchHelper.LEFT;
        return makeMovementFlags(drag, swipe);
    }

    @Override
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        touchCallBack.onItemMove(viewHolder.getAdapterPosition(),target.getAdapterPosition());
        return true;
    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
        touchCallBack.onItemDelete(viewHolder.getAdapterPosition());
    }

    @Override
    public boolean isLongPressDragEnabled() {
        return super.isLongPressDragEnabled();
    }

    @Override
    public boolean isItemViewSwipeEnabled() {
        return swipeEnable;
    }

    public void setSwipeEnable(boolean swipeEnable) {
        this.swipeEnable = swipeEnable;
    }
}
