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
import androidx.compose.runtime.*
import com.airbnb.lottie.compose.*

@Composable
fun SplashScreen(navController: NavController) {
    LaunchedEffect(key1 = true) {
        delay(800)
        navController.navigate("login_screen") {
            popUpTo("splash_screen") { inclusive = true }
        }
    }
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        LottieExample()
    }
}

@Composable
fun LottieExample() {
    // to keep track if the animation is playing
    // and play pause accordingly
    var isPlaying by remember {
        mutableStateOf(true)
    }
    // for speed
    var speed by remember {
        mutableStateOf(1f)
    }

    // remember lottie composition ,which
    // accepts the lottie composition result
    val composition by rememberLottieComposition(
        LottieCompositionSpec
            .RawRes(R.raw.splash)
    )


    // to control the animation
    val progress by animateLottieCompositionAsState(
        // pass the composition created above
        composition,

        // Iterates Forever
        iterations = LottieConstants.IterateForever,

        // pass isPlaying we created above,
        // changing isPlaying will recompose
        // Lottie and pause/play
        isPlaying = isPlaying,

        // pass speed we created above,
        // changing speed will increase Lottie
        speed = speed,

        // this makes animation to restart when paused and play
        // pass false to continue the animation at which is was paused
        restartOnPlay = false

    )

}
