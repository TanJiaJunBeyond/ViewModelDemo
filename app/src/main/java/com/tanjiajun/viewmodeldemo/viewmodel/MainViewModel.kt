package com.tanjiajun.viewmodeldemo.viewmodel

import android.view.View
import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR

/**
 * Created by TanJiaJun on 2019-11-23.
 */
class MainViewModel : ObservableViewModel() {

    @get:Bindable
    var name = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.name)
        }

    @get:Bindable
    var age = 0
        set(value) {
            field = value
            notifyPropertyChanged(BR.age)
        }

    @get:Bindable
    var gender = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.gender)
        }

    interface Handlers {

        fun onNavigateToNameActivityClick(view: View)

    }

}