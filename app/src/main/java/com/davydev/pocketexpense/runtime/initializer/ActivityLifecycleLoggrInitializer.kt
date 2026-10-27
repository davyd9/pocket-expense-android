package com.davydev.pocketexpense.runtime.initializer

import android.content.Context
import androidx.startup.Initializer
import com.davydev.foundation.liblifecycleloggr.ActivityLifecycleLoggr
import com.davydev.pocketexpense.runtime.WalleeApp

class ActivityLifecycleLoggrInitializer : Initializer<ActivityLifecycleLoggr> {
    override fun create(context: Context): ActivityLifecycleLoggr {
        return ActivityLifecycleLoggr().also {
            (context.applicationContext as WalleeApp)
                .registerActivityLifecycleCallbacks(it)
        }
    }

    override fun dependencies(): List<Class<out Initializer<*>>> = listOf(LoggrInitializer::class.java)
}
