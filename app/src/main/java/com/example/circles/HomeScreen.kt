package com.example.circles

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.circles.ui.common.CommonText
import com.example.circles.ui.theme.CirclesTheme


@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .verticalScroll(rememberScrollState())
    ) {


        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center

        ) {
            Text(text = "Explore")

        }
        Box(
            modifier = Modifier
                .padding(7.dp)
                .fillMaxWidth(),
            contentAlignment = Alignment.Center,

            ) {
            Text(text = "Find intelligent answers instantly !")

        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .border(
                    width = 3.dp,
                    color = Color(0xFFEAE9E9),
                    shape = RoundedCornerShape(5.dp)
                )
                .padding(5.dp)
                .background(color = Color(0xFFEAE9E9))
        ) {
            Text(text = "Search", Modifier.padding(7.dp))

        }
        Row(
            modifier = Modifier.horizontalScroll(rememberScrollState())
        ) {
            Box(
                modifier = Modifier
                    .padding(5.dp)
                    .background(
                        Color(0xFFEAE9E9), RoundedCornerShape(20.dp)
                    ),
            ) {
                Text(
                    text = "Hackthons", Modifier.padding(10.dp), color = Color.Blue
                )
            }
            Box(
                modifier = Modifier
                    .padding(5.dp)
                    .background(
                        Color(0xFFEAE9E9), RoundedCornerShape(20.dp)
                    ),

                ) {
                Text(
                    text = "Open Source Contest",
                    Modifier.padding(10.dp), color = Color.Blue
                )
            }
            Box(
                modifier = Modifier
                    .padding(5.dp)
                    .background(
                        Color(0xFFEAE9E9), RoundedCornerShape(20.dp)
                    ),
            ) {
                Text(
                    text = "Compeititve Programming",
                    Modifier.padding(10.dp), color = Color.Blue
                )
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(1.2f)
                .horizontalScroll(rememberScrollState())
        ) {
            Box(
                modifier = Modifier.padding(10.dp)
                    .fillMaxSize(1.8f)
            ) {
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.rectangle),
                        contentDescription = "background",
                        modifier = Modifier.fillMaxSize(1.5f),
                        contentScale = ContentScale.Crop,
                    )
                    Box(
                        modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center
                    ) {
                        Text(text = "Demo Hackathon")
                    }
                    CommonText(
                        text = "Hackathon Details",
                        color = Color.Blue,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.W500
                    ) {
                        navController.navigate("event_detail_homescreen")
                    }


                }
            }
            Box(
                modifier = Modifier.padding(10.dp)
            ) {
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.rectangle),
                        contentDescription = "background",
                        modifier = Modifier.fillMaxSize(0.4f),
                        contentScale = ContentScale.Crop,
                    )
                    Box(
                        modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center
                    ) {
                        Text(text = "Demo Hackathon")

                    }
                    CommonText(
                        text = "Hackathon Details",
                        color = Color.Blue,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.W500
                    ) {
                        navController.navigate("event_detail_homescreen")
                    }


                }

            }
            Box(
                modifier = Modifier.padding(10.dp)
            ) {
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.rectangle),
                        contentDescription = "background",
                        modifier = Modifier.fillMaxSize(0.4f),
                        contentScale = ContentScale.Crop,
                    )
                    Box(
                        modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center
                    ) {
                        Text(text = "Demo Hackathon")

                    }
                    CommonText(
                        text = "Hackathon Details",
                        color = Color.Blue,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.W500
                    ) {
                        navController.navigate("event_detail_homescreen")
                    }


                }

            }
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState())
        ) {
            Box(
                modifier = Modifier.padding(10.dp)
            ) {
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.rectangle2),
                        contentDescription = "background",
                        modifier = Modifier.fillMaxSize(0.4f),
                        contentScale = ContentScale.Crop,
                    )
                    Box(
                        modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center
                    ) {
                        Text(text = "Demo Hackathon")

                    }
                    CommonText(
                        text = "Contest Details",
                        color = Color.Blue,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.W500
                    ) {
                        navController.navigate("event_detail_homescreen")
                    }



                }

            }
            Box(
                modifier = Modifier.padding(10.dp)

            ) {
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.rectangle2),
                        contentDescription = "background",
                        modifier = Modifier.fillMaxSize(0.4f),
                        contentScale = ContentScale.Crop,
                    )
                    Box(
                        modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center
                    ) {
                        Text(text = "Demo Hackathon")

                    }
                    CommonText(
                        text = "Contest Details",
                        color = Color.Blue,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.W500
                    ) {
                        navController.navigate("event_detail_homescreen")
                    }


                }

            }
            Box(
                modifier = Modifier.padding(10.dp)

            ) {
                Column {
                    Image(
                        painter = painterResource(id = R.drawable.rectangle2),
                        contentDescription = "background",
                        modifier = Modifier.fillMaxSize(0.4f),

                        contentScale = ContentScale.Crop,
                    )
                    Box(
                        modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center
                    ) {
                        Text(text = "Demo Hackathon")

                    }
                    CommonText(
                        text = "Contest Details",
                        color = Color.Blue,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.W500
                    ) {
                        navController.navigate("event_detail_homescreen")
                    }


                }

            }
        }


    }
}


