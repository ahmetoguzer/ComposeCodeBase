package com.ahmet.composecodebase.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.navOptions
import com.ahmet.category.navigation.categoryScreen
import com.ahmet.home.navigation.HomeNavigationRoute
import com.ahmet.home.navigation.homeScreen
import com.ahmet.home.navigation.navigateToHome
import com.ahmet.login.navigation.LoginNavigationRoute
import com.ahmet.login.navigation.loginScreen
import com.ahmet.productdetail.navigation.navigateToProductDetail
import com.ahmet.productdetail.navigation.productDetail
import com.ahmet.profile.navigation.profileScreen

/**
 * Created by mertcantoptas on 10.03.2023
 */

@Composable
fun MainNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    startDestination: String = HomeNavigationRoute,
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination,
    ) {
        homeScreen(
            navigateToDetail = { id ->
                navController.navigateToProductDetail(id = id)
            },
        )
        loginScreen(navigateToHome = {
            navController.navigateToHome(
                navOptions = navOptions {
                    popUpTo(LoginNavigationRoute) {
                        inclusive = true
                    }
                },
            )
        })
        categoryScreen()
        profileScreen()
        productDetail()
    }
}
