package com.anupkunwar.samachar

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.anupkunwar.samachar.model.News
import com.anupkunwar.samachar.publisher.PublishersRepository
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(private val publishersRepository: PublishersRepository) :
    ViewModel() {

    val liveData = MutableLiveData<List<News>>()

    fun getNews() {
        viewModelScope.launch {
            publishersRepository.getPublishersList().collect {
                liveData.postValue(it)
            }
        }
    }
}