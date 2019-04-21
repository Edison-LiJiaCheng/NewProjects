package com.example.lijiacheng.util;

import com.example.lijiacheng.bean.ReMen_L;
import com.example.lijiacheng.bean.ZhuanLan_L;
import com.example.lijiacheng.bean.ZuiXin_L;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Created by LijiaCheng on 2019/4/17.
 */

public interface API_JK {
    public static String url="http://news-at.zhihu.com/api/4/";

    @GET("news/latest")
    Observable<ZuiXin_L>getZuiXin();

    @GET("sections")
    Observable<ZhuanLan_L>getZhuanLan();

    @GET("news/hot")
    Observable<ReMen_L>getReMen();

}
