package com.davydev.pocketexpense.features.dashboard.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.ReceiptLong
import androidx.compose.material.icons.rounded.ReceiptLong
import androidx.compose.material.icons.rounded.Wallet
import androidx.lifecycle.viewModelScope
import com.davydev.foundation.coreviewmodel.StatefulViewModel
import com.davydev.pocketexpense.R
import com.davydev.pocketexpense.runtime.navigation.home.BalanceSummaryFlow
import com.davydev.pocketexpense.runtime.navigation.home.TransactionSummaryFlow
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.launch

@HiltViewModel
class DashboardHostViewModel @Inject constructor() : StatefulViewModel<DashboardHostState, Unit, Unit, Unit>(DashboardHostState(), Unit) {

    init {
        initTab()
    }

    override fun dispatch(action: Unit) {

    }

    private fun initTab() {
        viewModelScope.launch {
            setState { copy(sections = initial()) }
        }
    }

    private fun initial(): List<DashboardSection> {
        return listOf(
            DashboardSection(
                SectionType.TRANSACTION,
                R.string.dashboard_transaction,
                Icons.AutoMirrored.Rounded.ReceiptLong,
                TransactionSummaryFlow.Root.route
            ),
            DashboardSection(
                SectionType.BALANCE,
                R.string.dashboard_balance,
                Icons.Rounded.Wallet,
                BalanceSummaryFlow.Root.route
            ),
        )
    }

}
