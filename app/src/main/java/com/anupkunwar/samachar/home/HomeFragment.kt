package com.anupkunwar.samachar.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import com.anupkunwar.samachar.MainActivityViewModel
import com.anupkunwar.samachar.databinding.FragmentHomeBinding
import com.anupkunwar.samachar.di.ViewModelFactory
import com.anupkunwar.samachar.getActivityViewModel
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class HomeFragment : DaggerFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentHomeBinding.inflate(inflater, container, false).apply {

        }
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val viewModel = getActivityViewModel<MainActivityViewModel>(viewModelFactory)
        viewModel.liveData.observe(this, Observer {
            println(it)
        })
        viewModel.getNews()
    }
}