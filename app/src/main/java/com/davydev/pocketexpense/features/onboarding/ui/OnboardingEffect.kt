package com.davydev.pocketexpense.features.onboarding.ui

sealed interface OnboardingEffect {
    object ClosePage : OnboardingEffect
}
