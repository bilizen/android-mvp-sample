package com.billflores.android_mvp_sample.domain.interactor;

import com.billflores.android_mvp_sample.data.entity.request.AllDataRequest;
import com.billflores.android_mvp_sample.data.entity.response.AllDataResponse;
import com.billflores.android_mvp_sample.data.mapper.RutasMapper;
import com.billflores.android_mvp_sample.data.rest.ApiClient;
import com.billflores.android_mvp_sample.domain.entity.Rutas;
import com.billflores.android_mvp_sample.presentation.presenter.RutasPresenter;
import com.billflores.android_mvp_sample.presentation.presenter.RutasPresenterInterface;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by bill on 7/12/17.
 */

public class RutasInteractor implements RutasInteractorInterface{

    private final RutasMapper rutasMapper;
    private RutasPresenterInterface rutasPresenterInterface;

    public RutasInteractor(RutasMapper rutasMapper,RutasPresenterInterface rutasPresenterInterface) {
        this.rutasMapper = rutasMapper;
        this.rutasPresenterInterface=rutasPresenterInterface;
    }

    @Override
    public void getListRoutes(String date ,int idOcm ){


        AllDataRequest allDataRequest= new AllDataRequest();
        allDataRequest.setDate(date);
        allDataRequest.setIdOcm(idOcm);

        Call<AllDataResponse> getAllData = ApiClient.processApi().getAllData(allDataRequest);
        getAllData.enqueue(new Callback<AllDataResponse>() {
            @Override
            public void onResponse(Call<AllDataResponse> call, Response<AllDataResponse> response) {
                if(response.isSuccessful()){
                    rutasPresenterInterface.showArrayList(rutasMapper.transformResponse(response.body()));
                }else{
                    rutasPresenterInterface.showMessage("an error occurred... ");
                }
            }

            @Override
            public void onFailure(Call<AllDataResponse> call, Throwable t) {
                rutasPresenterInterface.showMessage("an error occurred... ");
            }
        });



    }


}
