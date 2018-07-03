package com.android.mlpj.southerninvestments;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("Hotel")
    Call<List<CustomerDetails>> getDetails();
}
