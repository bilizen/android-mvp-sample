package com.billflores.android_mvp_sample;

/**
 * Created by bill on 2/10/17.
 */

public class MainActivityModel implements MainActivity.Model{
    private MainActivity.Presenter mainAcitivityPresenter;
    private Double aDouble;

    public MainActivityModel(MainActivity.Presenter mainAcitivityPresenter) {
    this.mainAcitivityPresenter=mainAcitivityPresenter;
    }

    @Override
    public void alcuadrado(String data) {
        if(data.equals("")){
        mainAcitivityPresenter.
        }else{
            aDouble=Double.valueOf(data)*Double.valueOf(data);
            mainAcitivityPresenter.showresult(String.valueOf(aDouble));
        }

    }


}
