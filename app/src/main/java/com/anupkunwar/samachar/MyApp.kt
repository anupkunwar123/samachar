package com.anupkunwar.samachar

import androidx.appcompat.app.AppCompatDelegate
import coil.Coil
import coil.ImageLoader
import com.anupkunwar.samachar.di.AppComponent
import com.anupkunwar.samachar.di.DaggerAppComponent
import com.crashlytics.android.Crashlytics
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import timber.log.Timber

class MyApp : DaggerApplication() {


    lateinit var appComponent: AppComponent

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        appComponent = DaggerAppComponent.builder().bindApp(this).build()
        return appComponent
    }

    override fun onCreate() {
        super.onCreate()

        //set logging
        if (BuildConfig.DEBUG) {
            Timber.plant(Timber.DebugTree())
        } else {
            Timber.plant(ReleaseTree)
        }

        Coil.setDefaultImageLoader {
            ImageLoader(this)

        }
    }

    object ReleaseTree : Timber.Tree() {
        override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
            if (t == null) {
                Crashlytics.logException(t)
            } else {
                Crashlytics.log(priority, tag, message)
            }
        }
    }

}