package com.davydev.pocketexpense.features.logout.ui

import androidx.compose.runtime.Immutable
import com.davydev.pocketexpense.model.User

@Immutable
data class LogoutState(val user: User = User())
