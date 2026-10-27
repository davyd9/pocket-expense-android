package com.davydev.pocketexpense.features.transaction.detail.ui

sealed interface TransactionEffect {
    object ClosePage : TransactionEffect
    object ShowAmountKeyboard : TransactionEffect
}
