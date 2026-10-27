package com.davydev.pocketexpense.features.transaction.all.ui

import androidx.compose.runtime.Immutable
import com.davydev.pocketexpense.features.transaction.summary.ui.TransactionItem

@Immutable
data class AllTransactionState(
    val transactionItems: List<TransactionItem> = listOf(),
)
