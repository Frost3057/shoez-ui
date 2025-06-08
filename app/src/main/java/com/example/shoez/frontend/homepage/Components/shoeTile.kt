package com.example.shoez.frontend.homepage.Components

import android.graphics.Paint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shoez.ui.theme.ShoezTheme
import com.example.shoez.ui.theme.background
import kotlin.contracts.contract

@Composable
fun shoeTile(shoeName:String,category:String,price: Int){
    Box(
        modifier = Modifier.background(MaterialTheme.colorScheme.primary).size(200.dp).clip(
            RoundedCornerShape(23)
        )
    ){
        Column(modifier = Modifier.fillMaxSize().padding(20.dp), horizontalAlignment = Alignment.Start, verticalArrangement = Arrangement.Center) {
            Text(shoeName, fontWeight = FontWeight.SemiBold)
            Spacer(modifier = Modifier.padding(top = 5.dp))
            Text(category,fontSize = 15.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color(0xFFCDCDCD))
            Spacer(modifier = Modifier.padding(top = 20.dp))
            Row (modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween, verticalAlignment = Alignment.CenterVertically){
                Text("₹"+price.toString(), color = MaterialTheme.colorScheme.onBackground, fontWeight = FontWeight.SemiBold)
                Button(modifier = Modifier.height(50.dp).width(70.dp), onClick = {},
                    shape = RoundedCornerShape(25),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = MaterialTheme.colorScheme.onBackground,
                        contentColor = Color.White
                    )
                ) {
                    Icon(imageVector = Icons.Outlined.ShoppingCart,contentDescription = null, modifier = Modifier.fillMaxSize())
                }
            }

        }
    }
}

@Composable
@Preview()
fun shoeTilePreview(){
    ShoezTheme (dynamicColor = false){
        shoeTile("Air Jordan 1 Retro High OG","Shoes",10499)
    }
}