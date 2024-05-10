object Android {

    private const val ANDROID_CORE_VERSION = "1.13.1"
    const val ANDROID_CORE = "androidx.core:core-ktx:$ANDROID_CORE_VERSION"

    object Compose {
        private const val COMPOSE_BOM_VERSION = "2023.08.00"
        private const val ACTIVITY_COMPOSE_VERSION = "1.9.0"

        const val COMPOSE_BOM = "androidx.compose:compose-bom:$COMPOSE_BOM_VERSION"
        const val ACTIVITY_COMPOSE = "androidx.activity:activity-compose:$ACTIVITY_COMPOSE_VERSION"
        const val COMPOSE_UI = "androidx.compose.ui:ui"
        const val COMPOSE_UI_GRAPHICS = "androidx.compose.ui:ui"
        const val COMPOSE_UI_TOOLING_PREVIEW = "androidx.compose.ui:ui-tooling-preview"
        const val COMPOSE_MATERIAL3 = "androidx.compose.material3:material3"
    }
}