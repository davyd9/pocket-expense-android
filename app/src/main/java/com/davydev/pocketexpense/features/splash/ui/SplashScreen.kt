package com.davydev.pocketexpense.features.splash.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.davydev.pocketexpense.foundation.viewmodel.HandleEffect
import com.davydev.pocketexpense.foundation.window.WindowState
import com.davydev.pocketexpense.runtime.navigation.AuthFlow
import com.davydev.pocketexpense.runtime.navigation.MainFlow
import com.davydev.pocketexpense.runtime.navigation.OnboardingFlow
import com.davydev.pocketexpense.runtime.navigation.home.HomeFlow

@Composable
fun SplashScreen(
    navController: NavController,
    viewModel: SplashViewModel,
    windowState: WindowState
) {
    val isDualPortrait = windowState.isDualPortrait()

    HandleEffect(
        viewModel = viewModel,
    ) {
        when (it) {
            SplashEffect.NavigateToDashboard -> {
                navController.navigate(HomeFlow.Root.route(isDualPortrait.toString())) {
                    popUpTo(MainFlow.Root.route) {
                        inclusive = true
                    }
                }
            }
            SplashEffect.NavigateToLogin -> {
                navController.navigate(AuthFlow.Root.route) {
                    popUpTo(MainFlow.Root.route) {
                        inclusive = true
                    }
                }
            }
            SplashEffect.NavigateToOnboarding -> {
                navController.navigate(OnboardingFlow.Root.route) {
                    popUpTo(MainFlow.Root.route) {
                        inclusive = true
                    }
                }
            }
        }
    }
}
