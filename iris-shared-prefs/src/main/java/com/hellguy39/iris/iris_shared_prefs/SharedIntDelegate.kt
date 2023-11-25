package com.hellguy39.iris.iris_shared_prefs

import android.content.Context
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

private const val SHARED_INT_DEFAULT_VALUE = 0

fun Context.sharedInt(
    name: String,
    defaultValue: Int = SHARED_INT_DEFAULT_VALUE
) = SharedIntDelegate(
    name = name,
    context = this,
    defaultValue = defaultValue
)

class SharedIntDelegate(
    private val name: String,
    private val defaultValue: Int,
    context: Context,
    prefsName: String? = null
) : SharedDelegate(context, prefsName),
    ReadWriteProperty<Any?, Int> {

    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return sharedPreferences.getInt(name, defaultValue)
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        sharedPreferences.edit().putInt(name, value).apply()
    }
}