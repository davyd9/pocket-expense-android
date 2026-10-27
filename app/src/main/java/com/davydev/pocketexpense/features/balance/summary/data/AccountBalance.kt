package com.davydev.pocketexpense.features.balance.summary.data

import com.davydev.pocketexpense.model.AccountType
import com.davydev.pocketexpense.model.Currency
import java.math.BigDecimal
import java.time.LocalDateTime

data class AccountBalance(
    val id: String,
    val currency: Currency,
    val amount: BigDecimal,
    val name: String,
    val type: AccountType,
    val createdAt: LocalDateTime,
)
