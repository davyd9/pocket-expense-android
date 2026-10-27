package com.davydev.pocketexpense.foundation.extension

import com.davydev.pocketexpense.foundation.datasource.local.model.AccountDb
import com.davydev.pocketexpense.foundation.datasource.local.model.AccountRecordDb
import com.davydev.pocketexpense.foundation.datasource.local.model.TransactionDb
import com.davydev.pocketexpense.foundation.datasource.local.model.TransactionRecordDb
import com.davydev.pocketexpense.model.Account
import com.davydev.pocketexpense.model.AccountRecord
import com.davydev.pocketexpense.model.Transaction
import com.davydev.pocketexpense.model.TransactionRecord

fun Account.toAccountDb(): AccountDb {
    return AccountDb(
        id = id,
        currencyCode = currency.currencyCode,
        countryCode = currency.countryCode,
        amount = amount.toLong(),
        name = name,
        type = type,
        createdAt = createdAt,
        updatedAt = updatedAt
    )
}

fun Transaction.toTransactionDb(accountId: String, transferAccountId: String?): TransactionDb {
    return TransactionDb(
        id = id,
        accountId = accountId,
        categoryType = categoryType,
        currencyCode = currency.currencyCode,
        countryCode = currency.countryCode,
        amount = amount.toLong(),
        type = type,
        date = date,
        createdAt = createdAt,
        updatedAt = updatedAt,
        note = note,
        transferAccountId = transferAccountId
    )
}

fun AccountRecord.toAccountRecordDb(): AccountRecordDb {
    return AccountRecordDb(
        id = id,
        accountId = accountId,
        amount = amount.toLong(),
        createdAt = createdAt
    )
}

fun TransactionRecord.toTransactionRecordDb(): TransactionRecordDb {
    return TransactionRecordDb(
        id = id,
        transactionId = transactionId,
        amount = amount.toLong(),
        createdAt = createdAt
    )
}
