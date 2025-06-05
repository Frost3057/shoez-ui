package com.example.shoez.frontend.intropage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun intro(

){
    Column (
        modifier= Modifier.fillMaxSize().background(color = Color(0xFFB71C1C)),
    ){
        Text(
            "PAMPER YOUR FEET",
        )
        Text(
            "WITH OUR SHOES"
        )
        Text(
            "Smart,gorgeous & fashionable"
        )
        Text(
            "collection make you cool"
        )
    }
}

@Composable
@Preview()
fun introPreview(){
    intro()
}