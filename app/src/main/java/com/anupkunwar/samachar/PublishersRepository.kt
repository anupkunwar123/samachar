package com.anupkunwar.samachar

import com.anupkunwar.samachar.model.Publisher
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
    fun getPublishersList(): Flow<Publisher> {
        return flow {
            for ((_, value) in publishers) {
                emit(value.get().getPublisher())
            }
        }.flowOn(appCoroutineDispatcher.io)
    }
}