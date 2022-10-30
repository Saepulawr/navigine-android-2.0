package com.navigine.navigine.demo

import android.content.Context
import android.content.Intent
import com.navigine.navigine.demo.ui.activities.LoginActivity

object NavigineGate {

    @JvmStatic
    fun getLoginIntent(context: Context): Intent {
        return Intent(context, LoginActivity::class.java)
    }
}