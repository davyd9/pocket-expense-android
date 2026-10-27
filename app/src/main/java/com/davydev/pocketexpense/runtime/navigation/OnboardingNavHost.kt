package com.davydev.pocketexpense.runtime.navigation

import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.davydev.pocketexpense.features.onboarding.ui.OnboardingScreen
import com.davydev.pocketexpense.features.onboarding.ui.OnboardingViewModel
import com.davydev.pocketexpense.runtime.navigation.home.HomeFlow

fun NavGraphBuilder.OnboardingNavHost(navController: NavHostController) {
    navigation(
        route = OnboardingFlow.Root.route,
        startDestination = OnboardingFlow.OnboardingScreen.route,
    ) {
        composable(route = OnboardingFlow.OnboardingScreen.route) {
            val viewModel = hiltViewModel<OnboardingViewModel>()
            OnboardingScreen(
                viewModel = viewModel,
                onClosePage = {
                    navController.navigate(HomeFlow.Root.route) {
                        popUpTo(OnboardingFlow.Root.route) {
                            inclusive = true
                        }
                    }
                },
                onSettingClick = {
                    navController.navigate(SettingFlow.Root.route)
                }
            )
        }
    }
}
