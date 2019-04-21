package com.example.lijiacheng.fragment;

import com.example.lijiacheng.bean.ReMen_L;
import com.example.lijiacheng.bean.ZhuanLan_L;
import com.example.lijiacheng.bean.ZuiXin_L;

import java.util.ArrayList;

/**
 * Created by LijiaCheng on 2019/4/17.
 */

public interface I_View {
    void view_ZuiXin_Data(ArrayList<ZuiXin_L.StoriesEntity> list);
    void view_ZuiXin_Banner(ArrayList<ZuiXin_L.Top_storiesEntity>list);
    void view_ZhuanLian_Data(ArrayList<ZhuanLan_L.DataEntity>list);
    void view_ReMen_Data(ArrayList<ReMen_L.RecentEntity>list);
}
