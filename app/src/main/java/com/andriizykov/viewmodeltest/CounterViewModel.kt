package com.andriizykov.viewmodeltest

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    private val _counterData = MutableLiveData<Int>().apply { value = 0 }
    val counterData: LiveData<Int> = _counterData

    fun increment() {
        _counterData.value = (_counterData.value ?: 0) + 1
    }

}