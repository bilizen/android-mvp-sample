package com.billflores.android_mvp_sample.data.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Bill on 7/12/2017.
 */

public class ApiClient {
    private static  ServicesApiInterface retrofit2Api;

    public static ServicesApiInterface processApi(){
        if(retrofit2Api==null){
            Retrofit retrofit=new Retrofit.Builder().baseUrl("http://192.168.0.100:80/wSYuraMobile/api/Mobile/").
                    addConverterFactory(GsonConverterFactory.create()).build();
            retrofit2Api=retrofit.create(ServicesApiInterface.class);
        }
        return retrofit2Api;
    }
}
