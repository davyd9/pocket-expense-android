package com.davydev.pocketexpense.features.transaction.detail.data

import com.davydev.pocketexpense.model.Account
import com.davydev.pocketexpense.model.CategoryType
import com.davydev.pocketexpense.model.TransactionWithAccount
import java.time.LocalDateTime
import kotlinx.coroutines.flow.Flow

interface ITransactionDetailEnvironment {
    fun getAccounts(): Flow<List<Account>>
    fun getTransaction(id: String): Flow<TransactionWithAccount>
    fun getCurrentDate(): LocalDateTime
    fun getTopCategory(): Flow<List<CategoryType>>
    suspend fun saveTransaction(transactionWithAccount: TransactionWithAccount): Flow<Account>
    suspend fun deleteTransaction(id: String): Flow<Boolean>
    fun trackSaveTransactionButtonClicked()
}
