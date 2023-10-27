package com.ahmet.data.remote.api

import com.ahmet.data.model.login.LoginBody
import com.ahmet.data.model.login.LoginResponse
import retrofit2.http.Body
import retrofit2.http.POST

/**
 * Created by mertcantoptas on 13.04.2023
 */

interface AuthenticationService {
    @POST("auth/login")
    suspend fun login(
        @Body requestBody: LoginBody,
    ): LoginResponse
}
