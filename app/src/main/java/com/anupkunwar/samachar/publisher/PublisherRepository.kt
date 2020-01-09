package com.anupkunwar.samachar.publisher

import com.anupkunwar.samachar.model.Publisher

interface PublisherRepository {
    fun getPublisher(): Publisher
}