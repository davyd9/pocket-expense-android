package com.davydev.pocketexpense.features.host.data

import com.davydev.pocketexpense.foundation.datasource.preference.PreferenceManager
import com.davydev.pocketexpense.model.Theme
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow

class HostEnvironment @Inject constructor(
    private val preferenceManager: PreferenceManager
) : IHostEnvironment {

    override fun getTheme(): Flow<Theme> {
        return preferenceManager.getTheme()
    }

}
