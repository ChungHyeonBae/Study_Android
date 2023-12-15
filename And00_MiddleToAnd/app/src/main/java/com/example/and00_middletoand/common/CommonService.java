package com.example.and00_middletoand.common;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Url;

public interface CommonService {

    //    public interface GitHubService {
//        @GET("users/{user}/repos")
//        Call<List<Repo>> listRepos(@Path("user") String user);
    @FormUrlEncoded
    @POST
    Call<String> getData(@Url String url, @FieldMap HashMap<String, Object> params) {
        
    }
}
