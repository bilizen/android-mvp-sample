package com.billflores.android_mvp_sample.presentation.view;

import com.billflores.android_mvp_sample.domain.entity.Rutas;

import java.util.ArrayList;

/**
 * Created by bill on 7/12/17.
 */

public interface RutasViewInterface {

    void showProgressDialog();
    void hideProgressDialog();
    void showMessage(String message);
    void showList(ArrayList<Rutas> rutasArrayList);

}
