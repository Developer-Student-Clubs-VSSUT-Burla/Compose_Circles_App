package com.example.circles.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.runtime.*
import androidx.navigation.NavController
import com.example.circles.R
import kotlinx.coroutines.delay
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import com.airbnb.lottie.compose.*
import kotlin.math.min
import kotlin.math.pow
import kotlin.math.sqrt

@Composable
fun SplashScreen(navController: NavController) {
    LaunchedEffect(key1 = true) {
        delay(1500)
        navController.navigate("login_screen") {
            popUpTo("splash_screen") { inclusive = true }
        }
    }
    Scaffold(
        content = {
// Creating a Column Layout
            Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                Box(
                    Modifier
                        .fillMaxSize()
                        .gradientBackground(listOf(Color.Blue, Color.Black), angle = 90f))

            }
        }
    )
}

private fun Modifier.gradientBackground(colors: List<Color>, angle: Float) = this.then(
    Modifier.drawBehind {

        // Setting the angle in radians
        val angleRad = angle / 180f * Math.PI

        // Fractional x
        val x = kotlin.math.cos(angleRad).toFloat()

        // Fractional y
        val y = kotlin.math.sin(angleRad).toFloat()

        // Set the Radius and offset as shown below
        val radius = sqrt(size.width.pow(2) + size.height.pow(2)) / 2f
        val offset = center + Offset(x * radius, y * radius)

        // Setting the exact offset
        val exactOffset = Offset(
            x = min(offset.x.coerceAtLeast(0f), size.width),
            y = size.height - min(offset.y.coerceAtLeast(0f), size.height)
        )

        // Draw a rectangle with the above values
        drawRect(
            brush = Brush.linearGradient(
                colors = colors,
                start = Offset(size.width, size.height) - exactOffset,
                end = exactOffset
            ),
            size = size
        )
    }
)


//@Composable
//fun LottieExample() {
//    // to keep track if the animation is playing
//    // and play pause accordingly
//    var isPlaying by remember {
//        mutableStateOf(true)
//    }
//    // for speed
//    var speed by remember {
//        mutableStateOf(1f)
//    }
//
//    // remember lottie composition ,which
//    // accepts the lottie composition result
//    val composition by rememberLottieComposition(
//        LottieCompositionSpec
//            .RawRes(R.raw.splash)
//    )
//
//
//    // to control the animation
//    val progress by animateLottieCompositionAsState(
//        // pass the composition created above
//        composition,
//
//        // Iterates Forever
//        iterations = LottieConstants.IterateForever,
//
//        // pass isPlaying we created above,
//        // changing isPlaying will recompose
//        // Lottie and pause/play
//        isPlaying = isPlaying,
//
//        // pass speed we created above,
//        // changing speed will increase Lottie
//        speed = speed,
//
//        // this makes animation to restart when paused and play
//        // pass false to continue the animation at which is was paused
//        restartOnPlay = false
//
//    )
//
//}
