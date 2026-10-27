package com.davydev.pocketexpense.features.logout.data

import com.davydev.pocketexpense.foundation.datasource.preference.PreferenceManager
import com.davydev.pocketexpense.model.Credential
import com.davydev.pocketexpense.model.User
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow

class LogoutEnvironment @Inject constructor(
    private val preferenceManager: PreferenceManager
) : ILogoutEnvironment {
    override suspend fun logout() {
        preferenceManager.setCredential(Credential(token = ""))
        preferenceManager.setUser(User(email = ""))
    }

    override fun getUser(): Flow<User> {
        return preferenceManager.getUser()
    }

}
