@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.composecodebase.android.library)
    alias(libs.plugins.composecodebase.android.library.jacoco)
    alias(libs.plugins.composecodebase.android.hilt)
}

android {
    namespace = "com.ahmet.composecodebase.core.common"
}

dependencies {
    implementation(libs.kotlinx.coroutines.android)
    implementation(libs.compose.state.events)
}