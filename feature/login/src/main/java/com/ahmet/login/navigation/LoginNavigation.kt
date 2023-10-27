package com.ahmet.login.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.ahmet.login.LoginScreenRoute

/**
 * Created by mertcantoptas on 10.05.2023
 */

const val LoginNavigationRoute = "login_route"

fun NavController.navigateLoginScreen(navOptions: NavOptions? = null) {
    this.navigate(LoginNavigationRoute, navOptions)
}

fun NavGraphBuilder.loginScreen(navigateToHome: () -> Unit) {
    composable(LoginNavigationRoute) {
        LoginScreenRoute(navigateToHome = navigateToHome)
    }
}
