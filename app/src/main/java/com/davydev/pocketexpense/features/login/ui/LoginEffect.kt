package com.davydev.pocketexpense.features.login.ui

sealed class LoginEffect {
    object NavigateToDashboard : LoginEffect()
}
