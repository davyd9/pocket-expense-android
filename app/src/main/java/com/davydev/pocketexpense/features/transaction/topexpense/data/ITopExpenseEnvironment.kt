package com.davydev.pocketexpense.features.transaction.topexpense.data

import com.davydev.pocketexpense.model.Currency
import com.davydev.pocketexpense.model.TopTransaction
import kotlinx.coroutines.flow.Flow

interface ITopExpenseEnvironment {
    fun getTopExpense(): Flow<List<TopTransaction>>
    fun getCurrency(): Flow<Currency>
}
