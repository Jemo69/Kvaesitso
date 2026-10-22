package de.mm20.launcher2.ui.ktx

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

enum class WindowWidthSizeClass { Compact, Medium, Expanded }

fun getWindowWidthSizeClass(widthDp: Dp): WindowWidthSizeClass = when {
    widthDp < 600.dp -> WindowWidthSizeClass.Compact
    widthDp < 840.dp -> WindowWidthSizeClass.Medium
    else -> WindowWidthSizeClass.Expanded
}

fun scaledGridColumnCount(baseColumns: Int, windowWidthClass: WindowWidthSizeClass): Int =
    if (windowWidthClass != WindowWidthSizeClass.Compact) baseColumns * 2 else baseColumns
