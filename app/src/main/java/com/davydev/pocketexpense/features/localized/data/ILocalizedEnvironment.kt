package com.davydev.pocketexpense.features.localized.data

import com.davydev.pocketexpense.model.Language
import kotlinx.coroutines.flow.Flow

interface ILocalizedEnvironment {
    fun getLanguage(): Flow<Language>
    suspend fun setLanguage(language: Language)
}

