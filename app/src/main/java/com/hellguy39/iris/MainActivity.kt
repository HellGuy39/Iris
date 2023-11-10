package com.hellguy39.iris

import android.app.Activity
import android.os.Bundle
import com.hellguy39.iris.iris_logger.taggedLogger

class MainActivity: Activity() {

    private val logger by taggedLogger("Iris")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        logger.i { "Hello, Iris!" }
    }

}