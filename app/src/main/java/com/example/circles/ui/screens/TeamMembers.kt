package com.example.circles.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.circles.R

@Composable
fun TeamMembers(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .verticalScroll(rememberScrollState()),

    ) {

        Box(modifier = Modifier.padding(10.dp)) {
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.p2),
                    contentDescription = "background",
                    modifier = Modifier
                        .fillMaxSize(0.25f)
                        .padding(10.dp),
                    contentScale = ContentScale.FillWidth,
                )
                Column(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Rohan Kumar Pradhan"
                    ,
                        fontSize = 18.sp,
                        modifier = Modifier.padding(10.dp),
                        fontWeight = FontWeight.W500)
                    Text(text = "C++ HTML CSS")
                }
            }

        }
        Box(modifier = Modifier.padding(10.dp)) {
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.p2),
                    contentDescription = "background",
                    modifier = Modifier
                        .fillMaxSize(0.25f)
                        .padding(10.dp),
                    contentScale = ContentScale.FillWidth,
                )
                Column(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Rajat Kumar Nayak",
                        fontSize = 18.sp,
                        modifier = Modifier.padding(10.dp),
                        fontWeight = FontWeight.W500)
                    Text(text = "C++ HTML CSS")
                }
            }

        }
        Box(modifier = Modifier.padding(10.dp)) {
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.p2),
                    contentDescription = "background",
                    modifier = Modifier
                        .fillMaxSize(0.25f)
                        .padding(10.dp),
                    contentScale = ContentScale.FillWidth,
                )
                Column(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Suraj Kumar Mahapatra",
                        fontSize = 18.sp,
                        modifier = Modifier.padding(10.dp),
                        fontWeight = FontWeight.W500)
                    Text(text = "C++ HTML CSS")
                }
            }

        }
        Box(modifier = Modifier.padding(10.dp)) {
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.p2),
                    contentDescription = "background",
                    modifier = Modifier
                        .fillMaxSize(0.25f)
                        .padding(10.dp),
                    contentScale = ContentScale.FillWidth,
                )
                Column(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Swapnil Kumar Sahoo",
                        fontSize = 18.sp,
                        modifier = Modifier.padding(10.dp),
                        fontWeight = FontWeight.W500)
                    Text(text = "C++ HTML CSS")
                }
            }

        }
        Box(modifier = Modifier.padding(10.dp)) {
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.p2),
                    contentDescription = "background",
                    modifier = Modifier
                        .fillMaxSize(0.25f)
                        .padding(10.dp),
                    contentScale = ContentScale.FillWidth,
                )
                Column(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Lalit Kumar Jena",fontSize = 18.sp,
                        modifier = Modifier.padding(10.dp),
                        fontWeight = FontWeight.W500
                    )
                    Text(text = "C++ HTML CSS")
                }
            }

        }
        Box(modifier = Modifier.padding(10.dp)) {
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.p2),
                    contentDescription = "background",
                    modifier = Modifier
                        .fillMaxSize(0.25f)
                        .padding(10.dp),
                    contentScale = ContentScale.FillWidth,
                )
                Column(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Suraj Kumar Mahapatra",
                        fontSize = 18.sp,
                        modifier = Modifier.padding(10.dp),
                        fontWeight = FontWeight.W500)
                    Text(text = "C++ HTML CSS")
                }
            }

        }
        Box(modifier = Modifier.padding(10.dp)) {
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.p2),
                    contentDescription = "background",
                    modifier = Modifier
                        .fillMaxSize(0.25f)
                        .padding(10.dp),
                    contentScale = ContentScale.FillWidth,
                )
                Column(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Swapnil Kumar Sahoo",
                        fontSize = 18.sp,
                        modifier = Modifier.padding(10.dp),
                        fontWeight = FontWeight.W500)
                    Text(text = "C++ HTML CSS")
                }
            }

        }
        Box(modifier = Modifier.padding(10.dp)) {
            Row() {
                Image(
                    painter = painterResource(id = R.drawable.p2),
                    contentDescription = "background",
                    modifier = Modifier
                        .fillMaxSize(0.25f)
                        .padding(10.dp),
                    contentScale = ContentScale.FillWidth,
                )
                Column(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Lalit Kumar Jena",fontSize = 18.sp,
                        modifier = Modifier.padding(10.dp),
                        fontWeight = FontWeight.W500
                    )
                    Text(text = "C++ HTML CSS")
                }
            }

        }



    }


}