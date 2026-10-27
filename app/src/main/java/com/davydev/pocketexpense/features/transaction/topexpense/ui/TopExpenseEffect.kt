package com.davydev.pocketexpense.features.transaction.topexpense.ui

sealed interface TopExpenseEffect {
    object Initial : TopExpenseEffect
}
