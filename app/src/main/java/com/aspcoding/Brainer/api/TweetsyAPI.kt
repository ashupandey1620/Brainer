package com.aspcoding.Brainer.api

import com.aspcoding.Brainer.Model.Tweet
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface TweetsyAPI {

    //for Dynamic Headers
    @GET("/v3/b/656db0ff0574da7622d00067?meta=false")
    suspend fun getTweets(@Header("X-JSON-Path") category:String): Response<List<Tweet>>

    //For Static Headers
    @GET("/v3/b/656db0ff0574da7622d00067?meta=false")
    @Headers("X-JSON-Path: tweets..category")
    suspend fun getCategories() : Response<List<String>>
}