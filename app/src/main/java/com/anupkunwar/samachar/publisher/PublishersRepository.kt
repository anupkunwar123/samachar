package com.anupkunwar.samachar.publisher

import com.anupkunwar.samachar.AppCoroutineDispatcher
import com.anupkunwar.samachar.model.News
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject
import javax.inject.Provider

class PublishersRepository @Inject constructor(
    private val appCoroutineDispatcher: AppCoroutineDispatcher,
    private val publishers: MutableMap<Class<out PublisherRepository>,
            Provider<PublisherRepository>>
) {
    fun getPublishersList(): Flow<List<News>> {
        return flow {
            for ((_, value) in publishers) {
                emit(mutableListOf<News>())
            }
        }.flowOn(appCoroutineDispatcher.io)

    }
}