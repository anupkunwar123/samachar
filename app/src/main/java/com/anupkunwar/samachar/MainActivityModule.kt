package com.anupkunwar.samachar

import androidx.lifecycle.ViewModel
import com.anupkunwar.samachar.di.ViewModelKey
import com.anupkunwar.samachar.home.HomeFragment
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class MainActivityModule {

    @ViewModelKey(MainActivityViewModel::class)
    @Binds
    @IntoMap
    abstract fun provideMainActivityViewModel(mainActivityViewModel: MainActivityViewModel): ViewModel

    @ContributesAndroidInjector
    abstract fun provideHomeFragment(): HomeFragment


}