package com.davydev.pocketexpense.features.transaction.all.data

import com.davydev.pocketexpense.model.TransactionWithAccount
import kotlinx.coroutines.flow.Flow

interface IAllTransactionEnvironment {
    fun getTransactions(): Flow<List<TransactionWithAccount>>
}
