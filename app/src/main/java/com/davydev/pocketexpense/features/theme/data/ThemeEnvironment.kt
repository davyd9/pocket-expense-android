package com.davydev.pocketexpense.features.theme.data

import com.davydev.pocketexpense.foundation.datasource.preference.PreferenceManager
import com.davydev.pocketexpense.model.Theme
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow

class ThemeEnvironment @Inject constructor(
    private val preferenceManager: PreferenceManager
) : IThemeEnvironment {

    override fun getTheme(): Flow<Theme> {
        return preferenceManager.getTheme()
    }

    override suspend fun setTheme(theme: Theme) {
        preferenceManager.setTheme(theme)
    }

}
