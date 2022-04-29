package com.example.networkapp

import retrofit2.Call
import retrofit2.http.GET

interface UserInfoService {
    @GET("jsonEx/testFile.jsp")
    fun getPeople(): Call<UserInfoList>
}