package com.davydev.pocketexpense.foundation.extension

import com.davydev.pocketexpense.foundation.datasource.preference.model.ThemePreference
import com.davydev.pocketexpense.model.Theme

fun ThemePreference.toTheme() = when (this.value) {
    Theme.LIGHT.value -> Theme.LIGHT
    Theme.TWILIGHT.value -> Theme.TWILIGHT
    Theme.NIGHT.value -> Theme.NIGHT
    Theme.SUNRISE.value -> Theme.SUNRISE
    Theme.AURORA.value -> Theme.AURORA
    Theme.WALLPAPER.value -> Theme.WALLPAPER
    else -> Theme.SYSTEM
}
