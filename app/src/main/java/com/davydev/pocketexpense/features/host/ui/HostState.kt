package com.davydev.pocketexpense.features.host.ui

import com.davydev.pocketexpense.model.Theme
import javax.annotation.concurrent.Immutable

@Immutable
data class HostState(val theme: Theme = Theme.SYSTEM)
