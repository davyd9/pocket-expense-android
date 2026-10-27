package com.davydev.pocketexpense.foundation.di

import com.davydev.pocketexpense.foundation.wrapper.DateTimeProvider
import com.davydev.pocketexpense.foundation.wrapper.DateTimeProviderImpl
import com.davydev.pocketexpense.foundation.wrapper.IdProvider
import com.davydev.pocketexpense.foundation.wrapper.IdProviderImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object CommonModule {

    @Singleton
    @Provides
    fun provideIdProvider(): IdProvider {
        return IdProviderImpl()
    }

    @Singleton
    @Provides
    fun provideDateTimeProvider(): DateTimeProvider {
        return DateTimeProviderImpl()
    }

}
