package com.example.mvpdemo.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.mvpdemo.R
import com.example.mvpdemo.contracts.MainActivityContract
import com.example.mvpdemo.presenter.MainActivityPresenter

class MainActivity (var mTextView: TextView, var mButton : Button, var mPresenter : MainActivityContract.Presenter) : AppCompatActivity(), MainActivityContract.View {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mPresenter = MainActivityPresenter(this)
    }

    override fun initView() {
        mTextView = findViewById(R.id.textView)
        mButton = findViewById(R.id.btn)

        mButton.setOnClickListener {
            mPresenter.onClick(it)
        }
    }

    override fun setViewData(data: String) {
        mTextView.text = data
    }
}