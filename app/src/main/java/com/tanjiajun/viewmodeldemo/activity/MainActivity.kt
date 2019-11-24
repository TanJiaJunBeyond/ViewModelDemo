package com.tanjiajun.viewmodeldemo.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.tanjiajun.viewmodeldemo.R
import com.tanjiajun.viewmodeldemo.databinding.ActivityMainBinding
import com.tanjiajun.viewmodeldemo.viewmodel.MainViewModel

/**
 * Created by TanJiaJun on 2019-11-23.
 */
class MainActivity : AppCompatActivity(), MainViewModel.Handlers {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main).also {
            it.viewModel = ViewModelProviders.of(this)[MainViewModel::class.java].apply {
                name = "谭嘉俊"
                age = 25
                gender = "男"
            }
            it.handlers = this
        }
    }

    override fun onNavigateToNameActivityClick(view: View) {
        startActivity(Intent(this, NameActivity::class.java))
    }

}