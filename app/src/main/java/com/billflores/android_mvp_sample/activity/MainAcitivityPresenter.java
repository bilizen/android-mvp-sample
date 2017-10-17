package com.billflores.android_mvp_sample.activity;

/**
 * Created by bill on 2/10/17.
 */

public class MainAcitivityPresenter implements MainActivity.Presenter {
    private MainActivity.View mainActivityView;
    private MainActivity.Model mainActivityModel;

    public MainAcitivityPresenter(MainActivity.View mainActivityView) {
        this.mainActivityView = mainActivityView;
        mainActivityModel= new MainActivityModel(this);
    }

    @Override
    public void showresult(String result) {
        if(mainActivityView!=null){
            mainActivityView.showresult(result);
        }
    }

    @Override
    public void alcuadrado(String data) {
        if(mainActivityView!=null){
            mainActivityModel.alcuadrado(data);
        }
    }

    @Override
    public void showError(String error) {
        if(mainActivityView!=null){
            mainActivityView.showError(error);
        }
    }

}
