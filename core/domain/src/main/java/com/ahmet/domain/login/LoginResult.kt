package com.ahmet.domain.login

import com.ahmet.data.model.login.LoginResponse


data class LoginResult(
    val token: String = "",
)

fun LoginResponse.toModel(): LoginResult {
    return LoginResult(this.token)
}
