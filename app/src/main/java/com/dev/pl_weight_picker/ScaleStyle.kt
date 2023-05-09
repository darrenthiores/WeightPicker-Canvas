package com.dev.pl_weight_picker

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class ScaleStyle(
    val scaleWidth: Dp = 150.dp, // height of the weight picker
    val radius: Dp = 550.dp, // radius of the circle
    val normalLineColor: Color = Color.LightGray,
    val fiveStepLineColor: Color = Color.Green,
    val tenStepLineColor: Color = Color.Black,
    val normalLineLength: Dp = 15.dp, // length of the normal line
    val fiveStepLineLength: Dp = 25.dp, // length of the five step line,
    val tenStepLineLength: Dp = 35.dp, // length of the ten step line
    val scaleIndicatorColor: Color = Color.Green, // color of the indicator of current weight
    val scaleIndicatorLength: Dp = 60.dp, // length of the indicator
    val textSize: TextUnit = 18.sp // text size of the number
)
