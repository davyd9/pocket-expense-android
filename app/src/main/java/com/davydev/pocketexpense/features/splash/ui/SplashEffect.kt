package com.davydev.pocketexpense.features.splash.ui

sealed class SplashEffect {
    object NavigateToDashboard : SplashEffect()
    object NavigateToLogin : SplashEffect()
    object NavigateToOnboarding : SplashEffect()
}
