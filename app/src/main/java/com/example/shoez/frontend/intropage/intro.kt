package com.example.shoez.frontend.intropage

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.shoez.R
import com.example.shoez.frontend.ihomepage.homePage
import com.example.shoez.homepage
import com.example.shoez.ui.theme.ShoezTheme


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun introPage(navController: NavController){
    val pagerState = rememberPagerState(
        initialPage = 0,
        pageCount ={2}
    )
    Box{
        VerticalPager(
            state = pagerState,
            pageSpacing = 400.dp
        ) {
            index ->
            when(index){
                0-> {
                    intro()
                }
                1->{
                    homePage()
                }
            }
        }
    }
}
@Composable
fun intro(

){
    Column (
        modifier= Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.onBackground),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ){
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .requiredHeight(400.dp),
            contentAlignment = Alignment.CenterEnd,
        ){
            Image(
                painter = painterResource(R.drawable.shoe2),
                contentDescription = null,
                modifier = Modifier.fillMaxSize()

            )
        }
        Spacer(Modifier.padding(top = 75.dp))
        Box{
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    "PAMPER  YOUR  FEET",
                    style = MaterialTheme.typography.headlineLarge,
                    fontSize = 27.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )

                    Spacer(Modifier.padding(top = 12.dp))
                Text(
                    "WITH  OUR  SHOES",
                    style = MaterialTheme.typography.headlineLarge,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Spacer(Modifier.padding(top = 12.dp))
                Text(
                    "Smart, gorgeous & fashionable",
                    style = MaterialTheme.typography.labelSmall,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Light,
                    color = Color(0xFFE6E0E0)
                )
                Spacer(Modifier.padding(top = 8.dp))
                Text(
                    "collection make you cool",
                    style = MaterialTheme.typography.labelSmall,
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Light,
                    color = Color(0xFFE6E0E0)
                )
            }
        }
        Spacer(Modifier.padding(top = 150.dp))
    }
}

@Composable
@Preview
fun introPreview(){
    ShoezTheme(
        darkTheme = false,
        dynamicColor = false
    ) {

        intro()
    }
}