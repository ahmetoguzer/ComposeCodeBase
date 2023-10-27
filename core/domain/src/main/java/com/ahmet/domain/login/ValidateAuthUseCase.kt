package com.ahmet.domain.login

import com.ahmet.domain.PasswordLengthException
import com.ahmet.domain.PasswordRequiredException
import com.ahmet.domain.UsernameLengthException
import com.ahmet.domain.UsernameRequiredException
import com.ahmet.common.result.Resource
import com.ahmet.common.result.asResource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

/**
 * Created by mertcantoptas on 12.05.2023
 */

private const val MinUsernameLength = 6
private const val MinPasswordLength = 6

class ValidateAuthUseCase @Inject constructor() {
    operator fun invoke(username: String, password: String): Flow<Resource<Unit>> {
        return flow {
            if (username.isEmpty()) {
                throw UsernameRequiredException()
            }
            if (username.length < MinUsernameLength) {
                throw UsernameLengthException()
            }
            if (password.isEmpty()) {
                throw PasswordRequiredException()
            }
            if (password.length < MinPasswordLength) {
                throw PasswordLengthException()
            }
            emit(Unit)
        }.asResource()
    }
}
