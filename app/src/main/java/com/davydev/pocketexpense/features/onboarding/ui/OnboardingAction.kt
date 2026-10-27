package com.davydev.pocketexpense.features.onboarding.ui

import com.davydev.pocketexpense.model.Currency

sealed interface OnboardingAction {
    object ClickSave : OnboardingAction
    data class SelectCurrency(val item: Currency) : OnboardingAction
}
