package com.davydev.pocketexpense.runtime.initializer

import android.content.Context
import androidx.startup.Initializer
import com.davydev.foundation.coreloggr.Loggr
import com.davydev.foundation.libanalyticsmanager.crash.CrashLogging
import com.davydev.foundation.testdebug.DebugTools

class LoggrInitializer : Initializer<Loggr> {
    override fun create(context: Context): Loggr {
        val loggings = DebugTools.getLoggings().toMutableList()
        loggings.add(CrashLogging())
        Loggr.initialize(loggings)
        return Loggr
    }

    override fun dependencies(): List<Class<out Initializer<*>>> = emptyList()
}
