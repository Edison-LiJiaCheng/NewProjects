package com.example.lijiacheng.model;

import android.util.Log;

import com.example.lijiacheng.bean.ReMen_L;
import com.example.lijiacheng.bean.ZhuanLan_L;
import com.example.lijiacheng.bean.ZuiXin_L;
import com.example.lijiacheng.util.API_JK;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by LijiaCheng on 2019/4/17.
 */

public class Model implements I_Model {
    private static final String TAG = "Model==============>";

    @Override
    public void model_ZuiXin_Data(final I_CallBack callBack) {
        Retrofit build = new Retrofit.Builder()
                .baseUrl(API_JK.url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        API_JK api_jk = build.create(API_JK.class);
        Observable<ZuiXin_L> zuiXin = api_jk.getZuiXin();
        zuiXin.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread())
                .subscribe(new Observer<ZuiXin_L>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ZuiXin_L value) {
                        ArrayList<ZuiXin_L.StoriesEntity> stories = (ArrayList<ZuiXin_L.StoriesEntity>) value.getStories();
                        callBack.view_ZuiXin_Data(stories);
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e(TAG, "onError: " + e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void model_ZuiXin_Banner(final I_CallBack callBack) {
        Retrofit build = new Retrofit.Builder()
                .baseUrl(API_JK.url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        API_JK api_jk = build.create(API_JK.class);
        Observable<ZuiXin_L> zuiXin = api_jk.getZuiXin();
        zuiXin.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread())
                .subscribe(new Observer<ZuiXin_L>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ZuiXin_L value) {
                        ArrayList<ZuiXin_L.Top_storiesEntity> top_stories = (ArrayList<ZuiXin_L.Top_storiesEntity>) value.getTop_stories();
                        callBack.view_ZuiXin_Banner(top_stories);
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e(TAG, "onError: " + e.getMessage());
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void model_ZhuanLian_Data(final I_CallBack callBack) {
        Retrofit build = new Retrofit.Builder()
                .baseUrl(API_JK.url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        API_JK api_jk = build.create(API_JK.class);
        Observable<ZhuanLan_L> zhuanLan = api_jk.getZhuanLan();
        zhuanLan.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread())
                .subscribe(new Observer<ZhuanLan_L>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ZhuanLan_L value) {
                        ArrayList<ZhuanLan_L.DataEntity> data = (ArrayList<ZhuanLan_L.DataEntity>) value.getData();
                        callBack.view_ZhuanLian_Data(data);
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e(TAG, "onError: "+e.getMessage() );
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

    @Override
    public void model_ReMen_Data(final I_CallBack callBack) {
        Retrofit build = new Retrofit.Builder()
                .baseUrl(API_JK.url)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        API_JK api_jk = build.create(API_JK.class);
        Observable<ReMen_L> reMen = api_jk.getReMen();
        reMen.observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread())
                .subscribe(new Observer<ReMen_L>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ReMen_L value) {
                        ArrayList<ReMen_L.RecentEntity> recent = (ArrayList<ReMen_L.RecentEntity>) value.getRecent();
                        callBack.view_ReMen_Data(recent);
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.e(TAG, "onError: "+e.getMessage() );
                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }
}
