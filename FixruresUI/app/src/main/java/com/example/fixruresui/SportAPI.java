package com.example.fixruresui;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface SportAPI {
    @GET("fixture?sport=FOOTBALL(BOYS)")
    Call<List<DetailPost>> getDetailPosts();
}
