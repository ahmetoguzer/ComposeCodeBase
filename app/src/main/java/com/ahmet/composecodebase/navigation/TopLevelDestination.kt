package com.ahmet.composecodebase.navigation

import com.ahmet.category.navigation.CategoryRoute
import com.ahmet.designsystems.icon.AppIcons
import com.ahmet.designsystems.icon.Icon
import com.ahmet.home.navigation.HomeNavigationRoute
import com.ahmet.profile.navigation.ProfileRoute
import com.ahmet.composecodebase.R

enum class TopLevelDestination(
    val route: String,
    val selectedIcon: Icon,
    val unselectedIcon: Icon,
    val titleTextId: Int,
) {
    HOME(
        route = HomeNavigationRoute,
        selectedIcon = Icon.ImageVectorIcon(AppIcons.Home),
        unselectedIcon = Icon.ImageVectorIcon(AppIcons.HomeOutlined),
        titleTextId = R.string.nav_home_title,
    ),
    CATEGORY(
        route = CategoryRoute,
        selectedIcon = Icon.ImageVectorIcon(AppIcons.Category),
        unselectedIcon = Icon.ImageVectorIcon(AppIcons.CategoryOutlined),
        titleTextId = R.string.nav_category_title,
    ),
    PROFILE(
        route = ProfileRoute,
        selectedIcon = Icon.ImageVectorIcon(AppIcons.Person),
        unselectedIcon = Icon.ImageVectorIcon(AppIcons.PersonOutlined),
        titleTextId = R.string.nav_profile_title,
    ),
}
