package com.tanjiajun.viewmodeldemo.viewmodel

import androidx.databinding.BaseObservable
import androidx.databinding.Observable
import androidx.lifecycle.ViewModel

/**
 * Created by TanJiaJun on 2019-11-24.
 */
open class ObservableViewModel: ViewModel(),Observable {

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}