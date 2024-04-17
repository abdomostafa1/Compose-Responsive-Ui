package com.redexpress.responsiveui.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun NumItem(num: Int, color: Color) {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(color)
            .padding(8.dp)
    ) {
        Text(text = "item $num")
    }
}