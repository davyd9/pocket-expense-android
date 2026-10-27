package com.davydev.pocketexpense.features.balance.summary.data

import com.davydev.pocketexpense.model.Account
import kotlinx.coroutines.flow.Flow

interface IBalanceSummaryEnvironment {
    fun getAccounts(): Flow<List<Account>>
}
