package com.anupkunwar.samachar.di

import com.anupkunwar.samachar.MainActivity
import com.anupkunwar.samachar.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector


@Module
interface ActivityBindingModule {
    @ContributesAndroidInjector(modules = [MainActivityModule::class, RepositoryModule::class])
    fun provideMainActivity(): MainActivity
}