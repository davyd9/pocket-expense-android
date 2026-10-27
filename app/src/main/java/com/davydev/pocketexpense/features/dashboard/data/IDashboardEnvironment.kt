package com.davydev.pocketexpense.features.dashboard.data

import com.davydev.pocketexpense.model.User
import kotlinx.coroutines.flow.Flow

interface IDashboardEnvironment {
    fun getUser(): Flow<User>
}
