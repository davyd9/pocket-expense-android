package com.davydev.pocketexpense.foundation.extension

import com.davydev.pocketexpense.foundation.datasource.preference.model.LanguagePreference
import com.davydev.pocketexpense.model.Language

fun LanguagePreference.toLanguage(): Language {
    return when (this.code) {
        Language.INDONESIA.code -> Language.INDONESIA
        else -> Language.ENGLISH
    }
}
