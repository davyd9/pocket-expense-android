package com.davydev.pocketexpense.features.localized.di

import com.davydev.pocketexpense.features.localized.data.ILocalizedEnvironment
import com.davydev.pocketexpense.features.localized.data.LocalizedEnvironment
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class LocalizedModule {

    @Binds
    abstract fun provideEnvironment(
        environment: LocalizedEnvironment
    ): ILocalizedEnvironment

}
