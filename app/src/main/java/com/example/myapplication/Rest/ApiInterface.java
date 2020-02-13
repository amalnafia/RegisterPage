package com.example.myapplication.Rest;

import com.example.myapplication.Models.Register.RegisterRequest;
import com.example.myapplication.Models.Register.RegisterResponse;

import io.reactivex.Flowable;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiInterface {
    @POST("Auth/JobSeekerRegister")
    Flowable<RegisterResponse> getJobEmployerRegister(@Body RegisterRequest registerRequest);
}
