package com.davydev.pocketexpense.features.localized.ui

sealed class LocalizedAction {
    data class SelectLanguage(val selected: LanguageItem) : LocalizedAction()
}
