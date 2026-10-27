package com.davydev.pocketexpense.features.dashboard.ui

import androidx.compose.runtime.Immutable
import com.davydev.pocketexpense.model.User

@Immutable
data class DashboardState(val user: User = User())
