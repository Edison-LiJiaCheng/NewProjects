package com.example.dome.contract;

import com.example.dome.bean.Shu;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface MainContract {
    public interface MainView {
        void dataYesView(Shu shu);

        void dataNoView(String data);
    }

    public interface MainPresenter {
        void dataPresenter();
    }

    public interface MainModel {
        void dataModel(ICallBask<Shu>callBask);
    }

    public interface ICallBask<T> {
        void getYes(T t);

        void getNo(String data);
    }

    public interface api {
        public static String url = "http://www.qubaobei.com/";

        @GET("ios/cf/dish_list.php?stage_id=1&limit=20&page=3 ")
        Observable<Shu> getObservable();
    }
}
