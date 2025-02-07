package com.redexpress.responsiveui.screens.main_screen

import androidx.compose.foundation.layout.fillMaxSize
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
fun MainScreenPhonePortrait() {

    Scaffold {

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {

            items(10) { index ->
                NumItem(num = index, color = Color.Yellow)
            }

            items(10) { index ->
                NumItem(num = index, color = Color.Green)
            }

        }
    }

}
