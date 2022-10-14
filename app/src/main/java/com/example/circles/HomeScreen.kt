package com.example.circles

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.circles.ui.theme.CirclesTheme


    @Composable
    fun HomeScreen(navController: NavController){
        Column (modifier= Modifier
            .fillMaxSize()
            .padding(20.dp),){

            Text(text = "Explore")
            Text(text = "Find intelligent answers instantly !")

            Row{
                Text(text = "Hackthons")
                Text(text = "Open Source Contest")
                Text(text = "Compeititve Programming")
            }

        }
    }


