package com.example.mvpdemo.contracts

interface MainActivityContract {
    interface View {
        fun initView()
        fun setViewData(data: String)
    }

    interface Model {
        fun getData() : String
    }

    interface Presenter {
        fun onClick(view : android.view.View)
    }
}