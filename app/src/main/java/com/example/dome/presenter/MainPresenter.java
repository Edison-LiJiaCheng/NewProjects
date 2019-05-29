package com.example.dome.presenter;

import com.example.dome.bean.Shu;
import com.example.dome.contract.MainContract;
import com.example.dome.model.MainModel;

public class MainPresenter implements MainContract.MainPresenter {

    private MainContract.MainView view;
    private MainContract.MainModel model;

    public MainPresenter(MainContract.MainView view) {
        this.view = view;
        model=new MainModel();
    }

    @Override
    public void dataPresenter() {
        model.dataModel(new MainContract.ICallBask<Shu>() {
            @Override
            public void getYes(Shu shu) {
                view.dataYesView(shu);
            }

            @Override
            public void getNo(String data) {
                view.dataNoView(data);
            }
        });
    }
}
