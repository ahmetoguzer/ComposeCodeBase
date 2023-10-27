package com.ahmet.data.remote.source

import com.ahmet.data.model.login.LoginBody
import com.ahmet.data.model.login.LoginResponse
import com.ahmet.data.remote.api.AuthenticationService
import javax.inject.Inject

class AuthenticationRemoteDataSourceImpl @Inject constructor(
    private val authenticationService: AuthenticationService,
) : AuthenticationRemoteDataSource {

    override suspend fun login(username: String, password: String): Result<LoginResponse> {
        return runCatching {
            authenticationService.login(LoginBody(username, password))
        }
    }
}
