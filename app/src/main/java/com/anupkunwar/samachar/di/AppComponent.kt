package com.anupkunwar.samachar.di

import com.anupkunwar.samachar.MyApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Component(
    modules = [
        ActivityBindingModule::class,
        AndroidSupportInjectionModule::class,
        NetModule::class,
        AppModule::class,
        ViewModelModule::class
    ]
)
@Singleton
interface AppComponent : AndroidInjector<MyApp> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun bindApp(app: MyApp): Builder

        fun build(): AppComponent
    }
}
