package com.davydev.pocketexpense.features.dashboard.ui

import androidx.lifecycle.viewModelScope
import com.davydev.foundation.coreviewmodel.StatefulViewModel
import com.davydev.pocketexpense.features.dashboard.data.IDashboardEnvironment
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.launch

@HiltViewModel
class DashboardViewModel @Inject constructor(
    dashboardEnvironment: IDashboardEnvironment,
) :
    StatefulViewModel<DashboardState, Unit, Unit, IDashboardEnvironment>(DashboardState(), dashboardEnvironment) {

    init {
        initUser()
    }

    private fun initUser() {
        viewModelScope.launch {
            environment.getUser()
                .collect { setState { copy(user = it) } }
        }
    }

    override fun dispatch(action: Unit) {

    }
}
