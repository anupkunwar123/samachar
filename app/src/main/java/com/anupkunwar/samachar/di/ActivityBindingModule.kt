package com.anupkunwar.samachar.di

import com.anupkunwar.samachar.MainActivity
import com.anupkunwar.samachar.MainActivityModule
import com.anupkunwar.samachar.ui.SelectPublisherFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
interface ActivityBindingModule {
    @ContributesAndroidInjector(modules = [MainActivityModule::class, RepositoryModule::class])
    fun provideMainActivity(): MainActivity

    @ContributesAndroidInjector
    fun provideSelectPublisherActivity(): SelectPublisherFragment
}