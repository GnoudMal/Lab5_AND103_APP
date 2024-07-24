package com.vdsl.asm1_and103;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static  com.vdsl.asm1_and103.APIService.DOMAIN;
public class HttpRequest {
    private APIService requestInterface;

    public HttpRequest() {
        requestInterface = new Retrofit.Builder()
                .baseUrl(DOMAIN)
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(APIService.class);
    }
    public APIService callAPI() {
        return requestInterface;
    }
}
