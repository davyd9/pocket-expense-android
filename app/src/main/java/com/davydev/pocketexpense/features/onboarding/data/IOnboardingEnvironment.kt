package com.davydev.pocketexpense.features.onboarding.data

import com.davydev.pocketexpense.model.Currency
import kotlinx.coroutines.flow.Flow

interface IOnboardingEnvironment {
    fun getCurrentCountryCode(): Flow<String>
    suspend fun saveAccount(currency: Currency)
}
