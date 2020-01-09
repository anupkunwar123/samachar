package com.anupkunwar.samachar.di

import com.anupkunwar.samachar.publisher.PublisherRepository
import com.anupkunwar.samachar.publisher.impl.BBCRepository
import com.anupkunwar.samachar.publisher.impl.OnlineKhabarRepository
import com.anupkunwar.samachar.publisher.impl.SetoPatiRepository
import dagger.Binds
import dagger.MapKey
import dagger.Module
import dagger.multibindings.IntoMap
import kotlin.reflect.KClass

@Module
abstract class RepositoryModule {
    @Binds
    @IntoMap
    @RepositoryKey(BBCRepository::class)
    abstract fun bbcRepository(bbc: BBCRepository): PublisherRepository

    @Binds
    @IntoMap
    @RepositoryKey(SetoPatiRepository::class)
    abstract fun setoPatiRepository(setoPati: SetoPatiRepository): PublisherRepository

    @Binds
    @IntoMap
    @RepositoryKey(OnlineKhabarRepository::class)
    abstract fun onlinekhabarRepository(onlinekhabar: OnlineKhabarRepository): PublisherRepository

}

@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER
)
@Retention(AnnotationRetention.RUNTIME)
@MapKey
internal annotation class RepositoryKey(val value: KClass<out PublisherRepository>)
