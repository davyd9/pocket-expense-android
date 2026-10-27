package com.davydev.pocketexpense.features.transaction.topexpense.ui

import androidx.compose.runtime.Immutable
import com.davydev.pocketexpense.features.transaction.summary.ui.TopExpenseItem
import com.davydev.pocketexpense.model.Currency

@Immutable
data class TopExpenseState(
    val topExpenseItems: List<TopExpenseItem> = listOf(),
    val currency: Currency = Currency.DEFAULT
)
