package com.example.jetpackcompose.ui

import android.view.Gravity
import androidx.compose.Composable
import androidx.ui.core.Alignment
import androidx.ui.core.Modifier
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.graphics.Color
import androidx.ui.layout.Arrangement
import androidx.ui.layout.Column
import androidx.ui.layout.fillMaxHeight
import androidx.ui.layout.padding
import androidx.ui.material.Button
import androidx.ui.res.imageResource
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import com.example.jetpackcompose.R

@Composable
fun ButtonWithCounter(count: Int, tapCount: (Int) -> Unit) {
    Button(
            onClick = { tapCount(count + 1) },
            backgroundColor = if (count > 5) Color.Green else Color.White
    ) {
        Text("I've been clicked $count times")
    }
}