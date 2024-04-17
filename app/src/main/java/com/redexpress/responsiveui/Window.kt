package com.redexpress.responsiveui

import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration


class Window(
    val widthType: Type,
    val heightType: Type
) {

    enum class Type {
        Compact,
        Medium,
        Expanded
    }


    companion object {

        @Composable
        fun determineType(): Window {

            val configuration = LocalConfiguration.current
            val width = configuration.screenWidthDp
            val height = configuration.screenHeightDp

            val widthType = when {
                width < 600 -> Type.Compact
                width < 840 -> Type.Medium
                else -> {
                    Type.Expanded
                }
            }

            val heightType = when {
                height < 480 -> Type.Compact
                height < 900 -> Type.Medium
                else -> {
                    Type.Expanded
                }
            }

            return Window(widthType, heightType)
        }
    }
}