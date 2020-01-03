package com.anupkunwar.samachar.di

import com.anupkunwar.samachar.PublisherRepository
import com.anupkunwar.samachar.home.BBCRepository
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
    abstract fun provideBBCPublisher(bbc: BBCRepository): PublisherRepository

}

@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER
)
@Retention(AnnotationRetention.RUNTIME)
@MapKey
internal annotation class RepositoryKey(val value: KClass<out PublisherRepository>)
