package com.example.jetpackcompose.ui

import androidx.compose.Composable
import androidx.compose.state
import androidx.ui.core.Alignment
import androidx.ui.core.ContentScale
import androidx.ui.core.Modifier
import androidx.ui.core.clip
import androidx.ui.foundation.Image
import androidx.ui.foundation.Text
import androidx.ui.foundation.shape.corner.RoundedCornerShape
import androidx.ui.layout.*
import androidx.ui.material.MaterialTheme.typography
import androidx.ui.res.imageResource
import androidx.ui.text.TextStyle
import androidx.ui.tooling.preview.Preview
import androidx.ui.unit.dp
import androidx.ui.unit.sp
import com.example.jetpackcompose.R

@Composable
fun getHeaderImage() = imageResource(id = R.drawable.header)

@Composable
fun getImageModifier() = Modifier.preferredHeightIn(maxHeight = 180.dp).fillMaxWidth()

@Composable
fun getCustomTextStyle() = TextStyle(fontSize = 20.sp)

@Composable
fun MainContent(){
    val counterState = state { 0 }
    Column(modifier = Modifier.fillMaxHeight()) {
        Image(getHeaderImage(),
                alignment = Alignment.TopStart,
                contentScale = ContentScale.Crop,
                modifier = getImageModifier())
        Text(text = "Header Content")
        Text(text = "Test line 2", style = getCustomTextStyle())
        Text(text = "Test line 3", style = getCustomTextStyle())
        Row(modifier = Modifier.fillMaxWidth(),horizontalArrangement = Arrangement.Center) {
            ButtonWithCounter(count = counterState.value, tapCount = { counterState.value = it })
        }
    }
}

@Preview
@Composable
fun initContentHolder(){
    MainContent()
}