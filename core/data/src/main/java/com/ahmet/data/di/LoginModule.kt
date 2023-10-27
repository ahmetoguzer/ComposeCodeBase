package com.ahmet.data.di

import com.ahmet.data.remote.source.AuthenticationRemoteDataSource
import com.ahmet.data.remote.source.AuthenticationRemoteDataSourceImpl
import com.ahmet.data.repository.AuthenticationRepository
import com.ahmet.data.repository.AuthenticationRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

/**
 * Created by mertcantoptas on 13.04.2023
 */

@Module
@InstallIn(ViewModelComponent::class)
interface LoginModule {

    @Binds
    fun bindLoginRemoteDataSource(sourceImpl: AuthenticationRemoteDataSourceImpl): AuthenticationRemoteDataSource

    @Binds
    fun bindAuthRepository(repositoryImpl: AuthenticationRepositoryImpl): AuthenticationRepository
}
