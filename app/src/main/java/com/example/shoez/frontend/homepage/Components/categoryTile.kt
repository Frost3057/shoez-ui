 package com.example.shoez.frontend.homepage.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.content.MediaType.Companion.Text
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.shoez.ui.theme.ShoezTheme

@Composable
fun categoryTile(name:String){
    var isSelected by remember {
        mutableStateOf(false)
    };
    val backgroundcolor = if(isSelected) Color(0xFF010101) else Color(0xFFE9E9E9)
    val fontColor = if(isSelected) Color.White else Color.Black
    Button(
        onClick = {
            isSelected =!isSelected
        },
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundcolor,
            contentColor = fontColor
        ),
        shape = RoundedCornerShape(25),
    ) {
        Text(name, color = fontColor, modifier = Modifier.padding(top=5.dp, bottom = 5.dp, end = 7.dp, start = 7.dp))
    }
}

@Composable
@Preview
fun categoryTilePreview(){
    ShoezTheme (
        dynamicColor = false
    ){
        categoryTile("Nike")
    }
}