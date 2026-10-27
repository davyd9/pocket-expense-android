package com.davydev.pocketexpense.features.logout.data

import com.davydev.pocketexpense.model.User
import kotlinx.coroutines.flow.Flow

interface ILogoutEnvironment {
    suspend fun logout()
    fun getUser(): Flow<User>
}
