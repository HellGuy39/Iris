package com.hellguy39.iris.iris_shared_prefs

import android.content.Context
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

private const val SHARED_STRING_DEFAULT_VALUE = ""

fun Context.sharedString(
    name: String,
    defaultValue: String = SHARED_STRING_DEFAULT_VALUE
) = SharedStringDelegate(
    name = name,
    context = this,
    defaultValue = defaultValue
)

class SharedStringDelegate(
    private val name: String,
    private val defaultValue: String,
    context: Context,
    prefsName: String? = null
) : SharedDelegate(context, prefsName),
    ReadWriteProperty<Any?, String> {

    override fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return sharedPreferences.getString(name, defaultValue) ?: defaultValue
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        sharedPreferences.edit().putString(name, value).apply()
    }
}