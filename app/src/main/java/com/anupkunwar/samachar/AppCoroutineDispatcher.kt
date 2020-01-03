package com.anupkunwar.samachar

import kotlinx.coroutines.CoroutineDispatcher

class AppCoroutineDispatcher constructor(
    val io: CoroutineDispatcher,
    val computation: CoroutineDispatcher,
    val main: CoroutineDispatcher
)