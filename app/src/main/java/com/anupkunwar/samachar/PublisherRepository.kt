package com.anupkunwar.samachar

import com.anupkunwar.samachar.model.Publisher

interface PublisherRepository {
    fun getPublisher(): Publisher
}