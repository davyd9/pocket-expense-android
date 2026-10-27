package com.davydev.pocketexpense.model

data class TransactionWithAccount(
    val transaction: Transaction,
    val account: Account,
    val transferAccount: Account? = null
)
