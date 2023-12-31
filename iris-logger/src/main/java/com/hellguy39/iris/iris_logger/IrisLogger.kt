package com.hellguy39.iris.iris_logger

interface IrisLogger {

    fun i(msg: String)

    fun e(msg: String)

    fun v(msg: String)

    fun d(msg: String)

    fun w(msg: String)

    fun i(block: () -> String)

    fun e(block: () -> String)

    fun v(block: () -> String)

    fun d(block: () -> String)

    fun w(block: () -> String)

}