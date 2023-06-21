package com.abdosharaf.calculator

import android.view.View

fun View.onClick(clickListener: (() -> Unit)) {
    this.setOnClickListener { clickListener.invoke() }
}