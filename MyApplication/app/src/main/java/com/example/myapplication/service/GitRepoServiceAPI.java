package com.example.myapplication.service;

import com.example.myapplication.GitRepo;
import com.example.myapplication.GitUsersResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface GitRepoServiceAPI {
    @GET("search/users")
    public Call<GitUsersResponse> searchUsers(@Query("q") String query);
    @GET("users/{u}/repos")
    public Call<List<GitRepo>> userRepositories(@Path("u") String login);
}
