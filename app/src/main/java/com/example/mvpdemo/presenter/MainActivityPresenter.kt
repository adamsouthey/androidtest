package com.example.mvpdemo.presenter

import android.view.View
import com.example.mvpdemo.contracts.MainActivityContract
import com.example.mvpdemo.models.MainActivityModel

class MainActivityPresenter (mView: MainActivityContract.View) : MainActivityContract.Presenter {
    var mView : MainActivityContract.View? = null
    var mModel : MainActivityContract.Model? = null

    init {
        mModel = MainActivityModel()
        mView.initView()
    }

    fun initPresenter() {
        mModel = MainActivityModel()
        mView?.initView()
    }

    override fun onClick(view: View) {
        var data = mModel?.getData()
        mView?.setViewData(data!!)
    }
}