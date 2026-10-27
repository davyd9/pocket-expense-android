package com.davydev.pocketexpense.foundation.datasource.local.model

import com.davydev.pocketexpense.model.CategoryType

data class TopCategoryDb(
    val type: CategoryType,
    val total: Int,
)
