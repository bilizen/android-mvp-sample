package com.billflores.android_mvp_sample.presentation.presenter;

import com.billflores.android_mvp_sample.domain.entity.Rutas;

import java.util.ArrayList;

/**
 * Created by bill on 7/12/17.
 */

public interface RutasPresenterInterface {
    void getAllData(String date , int idOcm);
    void showMessage(String message);
    void showArrayList(ArrayList<Rutas> rutasArrayList);
    void showProgressDialog();
    void hideProgressDialog();
}
