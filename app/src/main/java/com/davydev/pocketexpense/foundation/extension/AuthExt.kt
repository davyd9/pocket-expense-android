package com.davydev.pocketexpense.foundation.extension

import com.davydev.pocketexpense.model.Credential

fun Credential.isLoggedIn() = token.isNotBlank()
