package com.anupkunwar.samachar

import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import com.anupkunwar.samachar.di.ViewModelFactory

inline fun <reified T : ViewModel> Fragment.getActivityViewModel(factory: ViewModelFactory): T {
    return ViewModelProviders.of(activity!!, factory).get(T::class.java)
}