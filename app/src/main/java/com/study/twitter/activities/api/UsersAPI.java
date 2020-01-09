package com.study.twitter.activities.api;

import com.study.twitter.activities.model.Users;
import com.study.twitter.activities.serverResponses.RegisterResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface UsersAPI {
    @POST("users/register")
    Call<RegisterResponse> registerUser(@Body Users users);
}
