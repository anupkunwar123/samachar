package com.anupkunwar.samachar.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.doOnNextLayout
import com.anupkunwar.samachar.databinding.FragmentSelectPublisherBinding
import com.anupkunwar.samachar.model.PUBLISHER_LIST
import com.anupkunwar.samachar.ui.adapter.SelectPublisherAdapter
import com.anupkunwar.samachar.util.SpringAddItemAnimator
import dagger.android.support.DaggerFragment
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class SelectPublisherFragment : DaggerFragment() {


    @Inject
    lateinit var selectPublisherAdapter: SelectPublisherAdapter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentSelectPublisherBinding.inflate(inflater, container,false).apply {
            recyclerView.setHasFixedSize(true)
            recyclerView.apply {
                setHasFixedSize(true)
                itemAnimator = SpringAddItemAnimator()
                adapter = selectPublisherAdapter.apply {
                    doOnNextLayout {
                        submitList(PUBLISHER_LIST)
                        doOnNextLayout {
                            startPostponedEnterTransition()
                        }
                    }
                }
            }

        }
        postponeEnterTransition(2000L, TimeUnit.MILLISECONDS)
        return binding.root
    }


}
