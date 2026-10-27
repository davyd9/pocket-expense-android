package com.davydev.pocketexpense.features.account.detail.data

import com.davydev.pocketexpense.features.balance.summary.data.AccountBalance
import com.davydev.pocketexpense.model.Account
import kotlinx.coroutines.flow.Flow

interface IAccountDetailEnvironment {
    fun getAccount(id: String): Flow<Account>
    suspend fun saveAccount(account: AccountBalance, changeReason: AdjustBalanceReason): Flow<Boolean>
    suspend fun deleteAccount(id: String)
}
