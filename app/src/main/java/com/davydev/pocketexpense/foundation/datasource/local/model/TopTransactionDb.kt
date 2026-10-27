package com.davydev.pocketexpense.foundation.datasource.local.model

import com.davydev.pocketexpense.model.CategoryType

data class TopTransactionDb(
    val type: CategoryType,
    val amount: Long,
)
