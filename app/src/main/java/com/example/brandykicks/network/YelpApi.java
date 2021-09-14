package com.example.brandykicks.network;

import com.example.brandykicks.Model.YelpBusinessesSearchResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface YelpApi {
    @GET("businesses/search")
    Call<YelpBusinessesSearchResponse> getProducts(
            @Query("location") String location,
            @Query("term") String term
    );
}
