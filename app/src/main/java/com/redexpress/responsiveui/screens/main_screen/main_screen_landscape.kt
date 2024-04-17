package com.redexpress.responsiveui.screens.main_screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.redexpress.responsiveui.composables.NumItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreenPhoneLandScape() {
    Scaffold {
        Row(modifier = Modifier.padding(it)) {
            LazyColumn(
                modifier = Modifier.weight(1f)
            ) {
                items(10) { index ->
                    NumItem(num = index, color = Color.Yellow)
                }
            }
            LazyColumn(
                modifier = Modifier.weight(1f)
            ) {
                items(10) { index ->
                    NumItem(num = index, color = Color.Green)
                }
            }

        }

    }
}