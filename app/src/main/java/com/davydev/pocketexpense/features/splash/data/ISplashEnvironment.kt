package com.davydev.pocketexpense.features.splash.data

import com.davydev.pocketexpense.model.Credential
import kotlinx.coroutines.flow.Flow

interface ISplashEnvironment {
    fun getCredential(): Flow<Credential>
    fun hasFinishOnboarding(): Flow<Boolean>
}
