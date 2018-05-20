package com.lojas.americanas.infrastructure.backend;

import com.lojas.americanas.infrastructure.Constants;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;

public class ApiClient {
    private static Retrofit retrofit = null;
    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(Constants.Headers.URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
