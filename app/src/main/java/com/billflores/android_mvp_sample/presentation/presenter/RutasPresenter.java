package com.billflores.android_mvp_sample.presentation.presenter;

import com.billflores.android_mvp_sample.data.mapper.RutasMapper;
import com.billflores.android_mvp_sample.domain.entity.Rutas;
import com.billflores.android_mvp_sample.domain.interactor.RutasInteractor;
import com.billflores.android_mvp_sample.domain.interactor.RutasInteractorInterface;
import com.billflores.android_mvp_sample.presentation.view.RutasViewInterface;

import java.util.ArrayList;

/**
 * Created by bill on 7/12/17.
 */

public class RutasPresenter implements RutasPresenterInterface {

    private RutasInteractorInterface rutasInteractorInterface;
    private RutasViewInterface rutasViewInterface;

    public RutasPresenter(RutasViewInterface rutasViewInterface) {
        this.rutasViewInterface = rutasViewInterface;
        this.rutasInteractorInterface= new RutasInteractor(new RutasMapper(),this);
    }

    @Override
    public void getAllData(String date , int idOcm) {
        rutasInteractorInterface.getListRoutes(date,idOcm);
    }

    @Override
    public void showArrayList(ArrayList<Rutas> rutasArrayList){
        rutasViewInterface.showList(rutasArrayList);
    }

    @Override
    public void showProgressDialog() {
        rutasViewInterface.showProgressDialog();
    }

    @Override
    public void hideProgressDialog() {
        rutasViewInterface.hideProgressDialog();
    }

    @Override
    public void showMessage(String message){
        rutasViewInterface.showMessage(message);
    }

}
