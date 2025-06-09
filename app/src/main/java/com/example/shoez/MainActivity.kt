package com.example.shoez

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.shoez.frontend.homepage.homePage
import com.example.shoez.frontend.intropage.introPage
import com.example.shoez.ui.theme.ShoezTheme
import kotlinx.serialization.Serializable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ShoezTheme (
                darkTheme = false,
                dynamicColor = false
            ){
                val navController = rememberNavController()
                NavHost(navController = navController, startDestination = Intro ){
                    composable<Intro>{
                        introPage(navController)
                    }
                    composable<homepage>{
                        homePage()
                    }
                }
            }
        }
    }
}

@Serializable
object Intro
@Serializable
object homepage

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ShoezTheme {
        Greeting("Android")
    }
}