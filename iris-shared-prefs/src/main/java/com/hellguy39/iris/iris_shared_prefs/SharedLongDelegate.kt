package com.hellguy39.iris.iris_shared_prefs

import android.content.Context
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

private const val SHARED_LONG_DEFAULT_VALUE = 0L

fun Context.sharedLong(
    name: String,
    defaultValue: Long = SHARED_LONG_DEFAULT_VALUE
) = SharedLongDelegate(
    name = name,
    context = this,
    defaultValue = defaultValue
)

class SharedLongDelegate(
    private val name: String,
    private val defaultValue: Long,
    context: Context,
    prefsName: String? = null
) : SharedDelegate(context, prefsName),
    ReadWriteProperty<Any?, Long> {

    override fun getValue(thisRef: Any?, property: KProperty<*>): Long {
        return sharedPreferences.getLong(name, defaultValue)
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Long) {
        sharedPreferences.edit().putLong(name, value).apply()
    }
}