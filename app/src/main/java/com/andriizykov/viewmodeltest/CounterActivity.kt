package com.andriizykov.viewmodeltest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_counter.*

class CounterActivity : AppCompatActivity() {
    override fun onCreate(p0: Bundle?) {
        super.onCreate(p0)
        setContentView(R.layout.activity_counter)
        ViewModelProvider(this, ViewModelProvider.AndroidViewModelFactory(application))
            .get(CounterViewModel::class.java).let { viewModel ->
                viewModel.counterData.observe(this, Observer<Int> { counter_text_view.text = "$it" })
                counter_text_view.setOnClickListener { viewModel.increment() }
            }
    }
}