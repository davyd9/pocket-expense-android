package com.davydev.pocketexpense.features.transaction.summary.ui

sealed interface TransactionSummaryEffect {
    object Initial: TransactionSummaryEffect
}
