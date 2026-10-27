package com.davydev.pocketexpense.features.transaction.all.data

import com.davydev.pocketexpense.foundation.datasource.local.LocalManager
import com.davydev.pocketexpense.model.TransactionWithAccount
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow

class AllTransactionEnvironment @Inject constructor(
    private val localManager: LocalManager,
) : IAllTransactionEnvironment {
    override fun getTransactions(): Flow<List<TransactionWithAccount>> {
        return localManager.getTransactionWithAccounts()
    }
}
