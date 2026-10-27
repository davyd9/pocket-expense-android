package com.davydev.pocketexpense.features.transaction.all.ui

import androidx.lifecycle.viewModelScope
import com.davydev.foundation.coreviewmodel.StatefulViewModel
import com.davydev.pocketexpense.features.transaction.all.data.IAllTransactionEnvironment
import com.davydev.pocketexpense.features.transaction.summary.ui.toLastTransactionItems
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.launch

@HiltViewModel
class AllTransactionViewModel @Inject constructor(
    allTransactionEnvironment: IAllTransactionEnvironment,
) : StatefulViewModel<AllTransactionState, AllTransactionEffect, AllTransactionAction, IAllTransactionEnvironment>(AllTransactionState(), allTransactionEnvironment) {

    init {
        initLoad()
    }

    private fun initLoad() {
        viewModelScope.launch {
            environment.getTransactions()
                .collect {
                    setState { copy(transactionItems = it.toLastTransactionItems()) }
                }
        }
    }

    override fun dispatch(action: AllTransactionAction) {

    }

}
