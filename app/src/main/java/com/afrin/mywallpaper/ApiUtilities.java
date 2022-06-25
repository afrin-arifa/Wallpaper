package com.afrin.mywallpaper;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiUtilities {

        private static Retrofit retrofit = null;

        public static final String API = "563492ad6f917000010000015f1f386c48b14d68a330cb1bcc0ec814";


        public static ApiInterface getApiInterface(){
                if (retrofit==null){
                        retrofit =new Retrofit.Builder().baseUrl(ApiInterface.BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();

                }
                return retrofit.create(ApiInterface.class);
        }



}
