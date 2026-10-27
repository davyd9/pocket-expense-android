package com.davydev.pocketexpense.features.account.detail.di

import com.davydev.pocketexpense.features.account.detail.data.AccountDetailEnvironment
import com.davydev.pocketexpense.features.account.detail.data.IAccountDetailEnvironment
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent


@Module
@InstallIn(ViewModelComponent::class)
abstract class AccountDetailModule {

    @Binds
    abstract fun provideEnvironment(
        environment: AccountDetailEnvironment
    ): IAccountDetailEnvironment

}
