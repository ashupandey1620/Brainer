package com.aspcoding.Brainer.ViewModels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aspcoding.Brainer.Model.Tweet
import com.aspcoding.Brainer.Repository.TweetRepository
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class DetailsViwModel @Inject constructor(private val repository: TweetRepository) : ViewModel(){

    val tweets: StateFlow<List<Tweet>>
        get() = repository.tweets

    init {
        viewModelScope.launch {
            repository.getTweets("android")
        }
    }


}