package com.example.lijiacheng.presenter;

import com.example.lijiacheng.bean.ReMen_L;
import com.example.lijiacheng.bean.ZhuanLan_L;
import com.example.lijiacheng.bean.ZuiXin_L;
import com.example.lijiacheng.fragment.I_View;
import com.example.lijiacheng.model.I_CallBack;
import com.example.lijiacheng.model.Model;

import java.util.ArrayList;

/**
 * Created by LijiaCheng on 2019/4/17.
 */

public class Presenter implements I_Presenter{
    Model model;
    I_View view;

    public Presenter(I_View view) {
        this.model = new Model();
        this.view = view;
    }

    @Override
    public void presenter_ZuiXin_Data() {
        model.model_ZuiXin_Data(new I_CallBack() {
            @Override
            public void view_ZuiXin_Data(ArrayList<ZuiXin_L.StoriesEntity> list) {
                view.view_ZuiXin_Data(list);
            }

            @Override
            public void view_ZuiXin_Banner(ArrayList<ZuiXin_L.Top_storiesEntity> list) {

            }

            @Override
            public void view_ZhuanLian_Data(ArrayList<ZhuanLan_L.DataEntity> list) {

            }

            @Override
            public void view_ReMen_Data(ArrayList<ReMen_L.RecentEntity> list) {

            }
        });
    }

    @Override
    public void presenter_ZuiXin_Banner() {
        model.model_ZuiXin_Banner(new I_CallBack() {
            @Override
            public void view_ZuiXin_Data(ArrayList<ZuiXin_L.StoriesEntity> list) {

            }

            @Override
            public void view_ZuiXin_Banner(ArrayList<ZuiXin_L.Top_storiesEntity> list) {
                view.view_ZuiXin_Banner(list);
            }

            @Override
            public void view_ZhuanLian_Data(ArrayList<ZhuanLan_L.DataEntity> list) {

            }

            @Override
            public void view_ReMen_Data(ArrayList<ReMen_L.RecentEntity> list) {

            }
        });
    }

    @Override
    public void presenter_ZhuanLan_Data() {
        model.model_ZhuanLian_Data(new I_CallBack() {
            @Override
            public void view_ZuiXin_Data(ArrayList<ZuiXin_L.StoriesEntity> list) {

            }

            @Override
            public void view_ZuiXin_Banner(ArrayList<ZuiXin_L.Top_storiesEntity> list) {

            }

            @Override
            public void view_ZhuanLian_Data(ArrayList<ZhuanLan_L.DataEntity> list) {
                view.view_ZhuanLian_Data(list);
            }

            @Override
            public void view_ReMen_Data(ArrayList<ReMen_L.RecentEntity> list) {

            }
        });
    }

    @Override
    public void presenter_ReMen_Data() {
        model.model_ReMen_Data(new I_CallBack() {
            @Override
            public void view_ZuiXin_Data(ArrayList<ZuiXin_L.StoriesEntity> list) {

            }

            @Override
            public void view_ZuiXin_Banner(ArrayList<ZuiXin_L.Top_storiesEntity> list) {

            }

            @Override
            public void view_ZhuanLian_Data(ArrayList<ZhuanLan_L.DataEntity> list) {

            }

            @Override
            public void view_ReMen_Data(ArrayList<ReMen_L.RecentEntity> list) {
                view.view_ReMen_Data(list);
            }
        });
    }
}
