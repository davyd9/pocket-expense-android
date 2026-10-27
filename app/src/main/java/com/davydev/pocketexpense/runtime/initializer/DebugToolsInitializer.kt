package com.davydev.pocketexpense.runtime.initializer

import android.content.Context
import androidx.startup.Initializer
import com.davydev.foundation.testdebug.DebugTools

class DebugToolsInitializer : Initializer<DebugTools> {
    override fun create(context: Context): DebugTools {
        DebugTools.init()
        return DebugTools
    }

    override fun dependencies(): List<Class<out Initializer<*>>> = emptyList()
}
