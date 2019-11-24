package com.tanjiajun.viewmodeldemo.viewmodel

import androidx.databinding.Observable
import androidx.databinding.PropertyChangeRegistry
import androidx.lifecycle.ViewModel

/**
 * Created by TanJiaJun on 2019-11-24.
 */
open class ObservableViewModel : ViewModel(), Observable {

    private val callbacks = PropertyChangeRegistry()

    override fun addOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) =
        callbacks.add(callback)

    override fun removeOnPropertyChangedCallback(callback: Observable.OnPropertyChangedCallback?) =
        callbacks.remove(callback)

    fun notifyChange() =
        callbacks.notifyCallbacks(this, 0, null)

    fun notifyPropertyChange(fieldId: Int) =
        callbacks.notifyCallbacks(this, fieldId, null)

}