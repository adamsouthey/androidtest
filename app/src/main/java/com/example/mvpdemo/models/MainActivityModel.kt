package com.example.mvpdemo.models

import com.example.mvpdemo.contracts.MainActivityContract

class MainActivityModel : MainActivityContract.Model {

    private var counter = 0

    override fun getData(): String {
         var msg = "Hello World \n"
            if (counter == 0) {
                counter++
            } else {
                msg += counter++
            }
        return msg
    }
}