package com.davydev.pocketexpense.features.transaction.summary.data

import com.davydev.pocketexpense.model.Account
import com.davydev.pocketexpense.model.TopTransaction
import com.davydev.pocketexpense.model.Transaction
import com.davydev.pocketexpense.model.TransactionWithAccount
import kotlinx.coroutines.flow.Flow

interface ITransactionSummaryEnvironment {
    fun getCashFlow(): Flow<Triple<Account, List<Transaction>, List<Transaction>>>
    fun getLastTransaction(): Flow<List<TransactionWithAccount>>
    fun getTopExpense(): Flow<List<TopTransaction>>
}
