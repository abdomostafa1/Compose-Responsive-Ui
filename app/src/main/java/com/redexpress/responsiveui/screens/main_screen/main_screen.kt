package com.redexpress.responsiveui.screens.main_screen

import android.content.res.Configuration.ORIENTATION_PORTRAIT
import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalConfiguration
import com.redexpress.responsiveui.Window

private const val TAG = "main_screen"
@Composable
fun MainScreen() {
    val window = Window.determineType()

    Log.e(TAG, "isPhone()=${isPhone(window)}")
    if (isPhone(window)) {
        val orientation = LocalConfiguration.current.orientation
        Log.e(TAG,"orientation=$orientation")
        if (orientation == ORIENTATION_PORTRAIT)
            MainScreenPhonePortrait()
        else
            MainScreenPhoneLandScape()
    }
}


fun isPhone(window: Window): Boolean {
    return window.widthType == Window.Type.Compact || window.heightType == Window.Type.Compact
}


