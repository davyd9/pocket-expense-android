package com.davydev.pocketexpense.features.transaction.all.ui

sealed interface AllTransactionEffect {
    object Initial : AllTransactionEffect
}
