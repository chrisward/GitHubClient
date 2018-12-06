package com.example.chrisward.githubclient.api;

import com.example.chrisward.githubclient.model.User;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface GithubApi {
    @GET("user")
    Observable<User> getUser(@Header("Authorization") String authHeader);
}
