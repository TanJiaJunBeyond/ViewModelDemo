package com.tanjiajun.viewmodeldemo.viewmodel

import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR

/**
 * Created by TanJiaJun on 2019-11-24.
 */
class NameViewModel : ObservableViewModel() {

    @get:Bindable
    var name = ""
        set(value) {
            field = value
            notifyPropertyChange(BR.name)
        }

}