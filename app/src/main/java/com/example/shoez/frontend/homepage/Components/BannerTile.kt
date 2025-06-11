package com.example.shoez.frontend.homepage.Components

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shoez.ui.theme.ShoezTheme

@Composable
fun BannerTile(){
    Box(modifier = Modifier.height(200.dp).fillMaxWidth().clip(RoundedCornerShape(15)).background(MaterialTheme.colorScheme.surface)){
        Row (verticalAlignment = Alignment.CenterVertically, modifier = Modifier.fillMaxSize().padding(start = 30.dp, bottom = 20.dp)){
            Column(horizontalAlignment = Alignment.Start) {
                Text("New Release", color = MaterialTheme.colorScheme.onBackground, fontWeight = FontWeight.SemiBold, fontSize = 14.sp)
                Spacer(modifier = Modifier.padding(bottom = 7.dp))
                Text("Nike Lunar", fontWeight = FontWeight.Bold,color=Color.Black)
                Text("Force 1", fontWeight = FontWeight.Bold, color = Color.Black)
                Spacer(modifier = Modifier.padding(bottom = 18.dp))
                Button(
                    contentPadding = ButtonDefaults.TextButtonContentPadding,
                    modifier = Modifier.height(35.dp).width(80.dp),
                    shape = RoundedCornerShape(24),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.onBackground
                    ),
                    onClick = {

                    }
                ) {
                    Text("Shop Now", color = Color.White, fontSize = 12.sp, fontWeight = FontWeight.Normal)
                }
            }
        }
    }
}

@Composable
@Preview
fun BannerTilePreview(){
    ShoezTheme(
        dynamicColor = false
    ) {
        BannerTile()
    }
}
