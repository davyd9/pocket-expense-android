package com.davydev.pocketexpense.features.localized.ui

import com.davydev.pocketexpense.model.Language

sealed interface LocalizedEffect {
    data class ApplyLanguage(val language: Language) : LocalizedEffect
}
