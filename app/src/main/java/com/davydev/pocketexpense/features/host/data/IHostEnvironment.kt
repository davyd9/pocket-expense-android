package com.davydev.pocketexpense.features.host.data

import com.davydev.pocketexpense.model.Theme
import kotlinx.coroutines.flow.Flow

interface IHostEnvironment {
    fun getTheme(): Flow<Theme>
}
