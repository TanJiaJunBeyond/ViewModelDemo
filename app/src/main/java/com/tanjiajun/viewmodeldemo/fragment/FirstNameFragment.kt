package com.tanjiajun.viewmodeldemo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.tanjiajun.viewmodeldemo.FRAGMENT_TAG_SECOND_NAME
import com.tanjiajun.viewmodeldemo.R
import com.tanjiajun.viewmodeldemo.activity.NameActivity
import com.tanjiajun.viewmodeldemo.databinding.FragmentFirstNameBinding
import com.tanjiajun.viewmodeldemo.viewmodel.NameViewModel

/**
 * Created by TanJiaJun on 2019-11-24.
 */
class FirstNameFragment : Fragment(), FirstNameHandlers {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        DataBindingUtil.inflate<FragmentFirstNameBinding>(
            inflater,
            R.layout.fragment_first_name,
            container,
            false
        )
            .also { binding ->
                binding.viewModel = activity?.let {
                    ViewModelProviders.of(it)[NameViewModel::class.java].apply {
                        name = "谭嘉俊"
                    }
                }
                binding.handlers = this
            }
            .root

    override fun onNavigateToSecondFragmentClick(view: View) {
        (activity as NameActivity).addFragment(SecondNameFragment(), FRAGMENT_TAG_SECOND_NAME)
    }

}

interface FirstNameHandlers {

    fun onNavigateToSecondFragmentClick(view: View)

}