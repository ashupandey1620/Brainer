package com.aspcoding.Brainer.Repository

import com.aspcoding.Brainer.Model.Tweet
import com.aspcoding.Brainer.api.TweetsyAPI
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class TweetRepository @Inject constructor(private val tweetsyAPI: TweetsyAPI){

    private val _categories = MutableStateFlow<List<String>>(emptyList())
    val categories : StateFlow<List<String>>
        get() = _categories

    private val _tweets = MutableStateFlow<List<Tweet>>(emptyList())
    val tweets : StateFlow<List<Tweet>>
        get() = _tweets

    suspend fun getCategories(){
        val response = tweetsyAPI.getCategories()
        if(response.isSuccessful  && response.body()!=null){
            _categories.emit(response.body()!!)
        }
    }

    suspend fun getTweets(category : String){
        val response = tweetsyAPI.getTweets(category)
        if(response.isSuccessful  && response.body()!=null){
            _tweets.emit(response.body()!!)
        }
    }



}