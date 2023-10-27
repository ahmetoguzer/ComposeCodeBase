package com.ahmet.data.repository

import com.ahmet.data.model.login.LoginResponse
import com.ahmet.data.remote.source.AuthenticationRemoteDataSource
import javax.inject.Inject

class AuthenticationRepositoryImpl @Inject constructor(
    private val authenticationRemoteDataSource: AuthenticationRemoteDataSource,
) : AuthenticationRepository {

    override suspend fun login(username: String, password: String): Result<LoginResponse> {
        return authenticationRemoteDataSource.login(username, password)
    }
}
