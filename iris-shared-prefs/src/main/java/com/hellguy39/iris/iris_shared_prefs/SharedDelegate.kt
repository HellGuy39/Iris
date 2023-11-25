package com.hellguy39.iris.iris_shared_prefs

import android.content.Context
import android.content.SharedPreferences

private const val DEFAULT_PREFS_NAME = "prefs_delegate"

abstract class SharedDelegate(
    context: Context,
    private val prefsName: String?,
    private val prefsMode: Int = Context.MODE_PRIVATE
) {

    protected val sharedPreferences: SharedPreferences by lazy {
        context.getSharedPreferences(requirePrefsName(), prefsMode)
    }

    private fun requirePrefsName(): String = prefsName ?: DEFAULT_PREFS_NAME

}