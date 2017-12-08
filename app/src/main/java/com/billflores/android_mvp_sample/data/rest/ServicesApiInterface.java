package com.billflores.android_mvp_sample.data.rest;

import com.billflores.android_mvp_sample.data.entity.request.AllDataRequest;
import com.billflores.android_mvp_sample.data.entity.response.AllDataResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Bill on 7/12/2017.
 */

public interface ServicesApiInterface {

    @POST("PostAllDataByDateAndOcm")
    Call<AllDataResponse> getAllData(@Body AllDataRequest allDataRequest);

}
