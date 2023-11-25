package com.hellguy39.iris.iris_shared_prefs

import android.content.Context
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

private const val SHARED_FLOAT_DEFAULT_VALUE = 0f

fun Context.sharedFloat(
    name: String,
    defaultValue: Float = SHARED_FLOAT_DEFAULT_VALUE
) = SharedFloatDelegate(
    name = name,
    context = this,
    defaultValue = defaultValue
)

class SharedFloatDelegate(
    private val name: String,
    private val defaultValue: Float,
    context: Context,
    prefsName: String? = null
) : SharedDelegate(context, prefsName),
    ReadWriteProperty<Any?, Float> {

    override fun getValue(thisRef: Any?, property: KProperty<*>): Float {
        return sharedPreferences.getFloat(name, defaultValue)
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Float) {
        sharedPreferences.edit().putFloat(name, value).apply()
    }
}