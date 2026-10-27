package com.davydev.pocketexpense.features.balance.summary.data

import com.davydev.pocketexpense.foundation.datasource.local.LocalManager
import com.davydev.pocketexpense.model.Account
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow

class BalanceSummaryEnvironment @Inject constructor(
    private val localManager: LocalManager
) : IBalanceSummaryEnvironment {
    override fun getAccounts(): Flow<List<Account>> {
        return localManager.getAccountWithTransactions()
    }
}
