@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    alias(libs.plugins.composecodebase.android.feature)
    alias(libs.plugins.composecodebase.android.library.compose)
    alias(libs.plugins.composecodebase.android.library.jacoco)
}

android {
    namespace = "com.ahmet.composecodebase.feature.login"
}

dependencies {
    implementation(libs.kotlinx.datetime)
    implementation(libs.androidx.activity.compose)
}
