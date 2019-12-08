package com.tanjiajun.viewmodeldemo.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.tanjiajun.viewmodeldemo.FRAGMENT_TAG_FIRST_NAME
import com.tanjiajun.viewmodeldemo.R
import com.tanjiajun.viewmodeldemo.fragment.FirstNameFragment

/**
 * Created by TanJiaJun on 2019-11-24.
 */
class NameActivity : AppCompatActivity() {

    private lateinit var manager: FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)
        manager = supportFragmentManager

        if (savedInstanceState == null) {
            addFragment(FirstNameFragment(), FRAGMENT_TAG_FIRST_NAME)
        }
    }

    fun addFragment(fragment: Fragment, tag: String) =
        with(manager.beginTransaction()) {
            add(R.id.fl_content, fragment, tag)
            addToBackStack(tag)
            commitAllowingStateLoss()
        }

    override fun onBackPressed() {
        manager
            .takeIf { it.backStackEntryCount > 1 }
            ?.popBackStackImmediate()
            ?: finish()
    }

}