package com.davydev.pocketexpense.features.theme.data

import com.davydev.pocketexpense.model.Theme
import kotlinx.coroutines.flow.Flow

interface IThemeEnvironment {
    fun getTheme(): Flow<Theme>
    suspend fun setTheme(theme: Theme)
}
