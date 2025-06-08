package com.example.shoez.frontend.intropage


import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.detectDragGestures
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.dotlottie.dlplayer.Mode
import com.example.shoez.R
import com.example.shoez.frontend.homepage.homePage
import com.example.shoez.ui.theme.ShoezTheme
import com.lottiefiles.dotlottie.core.compose.ui.DotLottieAnimation
import com.lottiefiles.dotlottie.core.util.DotLottieSource


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun introPage(navController: NavController){
    var isSwipedUp by remember {
        mutableStateOf(false)
    }
    var currentOffset by remember{
        mutableStateOf(0f)
    }

    val animatedb by animateDpAsState(
        targetValue = if (isSwipedUp) (-1000).dp else currentOffset.dp,
        animationSpec = tween(
            durationMillis = 500,
            easing = FastOutSlowInEasing
        )
    )
    val finalOffset = if(isSwipedUp) animatedb.value else currentOffset
    Box(
        modifier = Modifier.fillMaxSize()
    ){
        homePage()
        intro(modifier = Modifier.offset(y=finalOffset.dp).pointerInput(Unit){
            detectDragGestures(onDragStart = {
                isSwipedUp = false
                currentOffset = 0f
            },onDragEnd = {
                if(currentOffset<-200){
                    isSwipedUp = true
                }
                currentOffset = 0f
            },){
                _,dragAmount->
                val drag = dragAmount.y + currentOffset
                if(drag<=0){
                    currentOffset = drag
                }
                if(currentOffset<-300){
                    isSwipedUp = true
                }
            }
        })
    }
}
@Composable
fun intro(
    modifier: Modifier
){
    Column (
        modifier= modifier
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
                Spacer(Modifier.padding(top = 120.dp))
                Box(modifier= Modifier.size(100.dp)){
                    DotLottieAnimation(
                        source = DotLottieSource.Url("https://lottie.host/cfa7ffcf-2c38-4829-9b72-64054bf1db29/MVPb2GUaxC.lottie"),
                        autoplay = true,
                        loop = true,
                        speed = 1f,
                        useFrameInterpolation = false,
                        playMode = Mode.FORWARD,
                        modifier = Modifier.background(MaterialTheme.colorScheme.onBackground)
                    )
                }
            }
        }
        Spacer(Modifier.padding(top = 25.dp))
    }
}


@Composable
@Preview
fun introPreview(){
    ShoezTheme(
        darkTheme = false,
        dynamicColor = false
    ) {


    }
}