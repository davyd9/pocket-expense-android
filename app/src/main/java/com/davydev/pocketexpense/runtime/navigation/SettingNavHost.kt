package com.davydev.pocketexpense.runtime.navigation

import androidx.compose.material.navigation.bottomSheet
import androidx.compose.runtime.MutableState
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.navigation
import com.davydev.pocketexpense.features.localized.ui.LanguageScreen
import com.davydev.pocketexpense.features.localized.ui.LocalizedViewModel
import com.davydev.pocketexpense.features.logout.ui.LogoutScreen
import com.davydev.pocketexpense.features.logout.ui.LogoutViewModel
import com.davydev.pocketexpense.features.setting.ui.SettingScreen
import com.davydev.pocketexpense.features.setting.ui.SettingViewModel
import com.davydev.pocketexpense.features.theme.ui.ThemeScreen
import com.davydev.pocketexpense.features.theme.ui.ThemeViewModel
import com.davydev.pocketexpense.runtime.navigation.home.HomeFlow

fun NavGraphBuilder.SettingNavHost(
    navController: NavHostController,
    bottomSheetConfig: MutableState<BottomSheetConfig>
) {
    navigation(startDestination = SettingFlow.Setting.route, route = SettingFlow.Root.route) {
        bottomSheet(SettingFlow.Setting.route) {
            val viewModel = hiltViewModel<SettingViewModel>()
            bottomSheetConfig.value = DefaultBottomSheetConfig
            SettingScreen(
                viewModel = viewModel,
                onClick = { navController.navigate(it) }
            )
        }
        bottomSheet(SettingFlow.Theme.route) {
            val viewModel = hiltViewModel<ThemeViewModel>()
            bottomSheetConfig.value = DefaultBottomSheetConfig
            ThemeScreen(
                viewModel = viewModel,
                onClickBack = { navController.navigateUp() }
            )
        }
        bottomSheet(SettingFlow.Logout.route) {
            val viewModel = hiltViewModel<LogoutViewModel>()
            bottomSheetConfig.value = DefaultBottomSheetConfig
            LogoutScreen(
                viewModel = viewModel,
                onClickBack = {
                    navController.navigateUp()
                },
                onLogout = {
                    navController.navigate(MainFlow.Root.route) {
                        popUpTo(HomeFlow.DashboardScreen.route) {
                            inclusive = true
                        }
                    }
                }
            )
        }
        bottomSheet(SettingFlow.Language.route) {
            val viewModel = hiltViewModel<LocalizedViewModel>()
            bottomSheetConfig.value = DefaultBottomSheetConfig
            LanguageScreen(
                viewModel = viewModel,
                onClickBack = { navController.navigateUp() }
            )
        }
    }
}
