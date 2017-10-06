package com.billflores.android_mvp_sample.activity;

/**
 * Created by bill on 2/10/17.
 */

public interface MainActivity {

    interface View{
        void showresult(String result);
        void showError(String error);
        void showList();
    }

    interface Presenter{
        void showresult(String result);
        void alcuadrado(String data);
        void showError(String error);
        void showList();
    }

    interface Model{
        void alcuadrado(String data);
    }



}
