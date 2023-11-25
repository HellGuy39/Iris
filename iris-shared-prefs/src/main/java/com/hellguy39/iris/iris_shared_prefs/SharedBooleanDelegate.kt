package com.hellguy39.iris.iris_shared_prefs

import android.content.Context
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

private const val SHARED_BOOLEAN_DEFAULT_VALUE = false

fun Context.sharedBoolean(
    name: String,
    defaultValue: Boolean = SHARED_BOOLEAN_DEFAULT_VALUE
) = SharedBooleanDelegate(
    name = name,
    context = this,
    defaultValue = defaultValue
)

class SharedBooleanDelegate(
    private val name: String,
    private val defaultValue: Boolean,
    context: Context,
    prefsName: String? = null
) : SharedDelegate(context, prefsName),
    ReadWriteProperty<Any?, Boolean> {

    override fun getValue(thisRef: Any?, property: KProperty<*>): Boolean {
        return sharedPreferences.getBoolean(name, defaultValue)
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Boolean) {
        sharedPreferences.edit().putBoolean(name, value).apply()
    }
}
