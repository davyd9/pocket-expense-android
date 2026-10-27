package com.davydev.pocketexpense.features.dashboard.data

import com.davydev.pocketexpense.foundation.datasource.preference.PreferenceManager
import com.davydev.pocketexpense.model.User
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow

class DashboardEnvironment @Inject constructor(
    private val preferenceManager: PreferenceManager,
) : IDashboardEnvironment {

    override fun getUser(): Flow<User> {
        return preferenceManager.getUser()
    }

}
