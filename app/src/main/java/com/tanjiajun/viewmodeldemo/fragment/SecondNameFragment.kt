package com.tanjiajun.viewmodeldemo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.tanjiajun.viewmodeldemo.R
import com.tanjiajun.viewmodeldemo.databinding.FragmentSecondNameBinding
import com.tanjiajun.viewmodeldemo.viewmodel.NameViewModel

/**
 * Created by TanJiaJun on 2019-11-24.
 */
class SecondNameFragment : Fragment(), SecondNameHandlers {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        DataBindingUtil.inflate<FragmentSecondNameBinding>(
            inflater,
            R.layout.fragment_second_name,
            container,
            false
        )
            .also {
                it.handlers = this
            }
            .root

    override fun onChangeNameToAppleClick(view: View) {
        activity?.let { ViewModelProviders.of(it)[NameViewModel::class.java].name = "苹果" }
    }

}

interface SecondNameHandlers {

    fun onChangeNameToAppleClick(view: View)

}