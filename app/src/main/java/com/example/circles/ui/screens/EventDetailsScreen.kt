package com.example.circles

import android.content.Intent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.startActivity
import androidx.navigation.NavController
import com.example.circles.ui.common.CommonLoginButton

@Composable
fun EventDetailScreen(navController: NavController) {
    val mContext = LocalContext.current
    Surface() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
        ) {

            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    "Hackathon Details",
                    fontSize = 18.sp,
                    modifier = Modifier.padding(10.dp),
                    fontWeight = FontWeight.W500
                )
            }
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.rectangle3),
                    contentDescription = "background",
                    modifier = Modifier.fillMaxSize(2f),
                    contentScale = ContentScale.FillWidth,
                )
            }
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    "Larsen & Turbo Techgium 2022",
                    fontSize = 30.sp,
                    modifier = Modifier
                        .padding(10.dp)
                        .align(Alignment.Center),
                    fontWeight = FontWeight.W500
                )
            }
            Row(
                modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth()
            ) {
                Text(
                    text = "12th Sept 2022",
                    fontSize = 18.sp,
                    modifier = Modifier
                        .padding(10.dp),

                    fontWeight = FontWeight.W500,
                )
                Text(
                    text = "9:00PM",
                    fontSize = 18.sp,
                    modifier = Modifier
                        .padding(10.dp),

                    fontWeight = FontWeight.W500,
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center
            ) {
                Box(
                    modifier = Modifier
                        .background(color = Color(0xFF001B3A))
                        .border(2.dp, Color.White),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Free Registration",
                        modifier = Modifier.padding(15.dp),
                        color = Color.White
                    )
                }
                Box(
                    modifier = Modifier
                        .background(color = Color(0xFF001B3A))
                        .border(2.dp, Color.White),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "Online Mode",
                        modifier = Modifier.padding(15.dp),
                        color = Color.White
                    )
                }
                Box(
                    modifier = Modifier
                        .background(color = Color(0xFF001B3A))
                        .border(2.dp, Color.White),
                    contentAlignment = Alignment.Center
                ) {
                    Text(
                        text = "5 Members",

                        modifier = Modifier.padding(15.dp),
                        color = Color.White
                    )
                }
            }

            Box(
                modifier = Modifier.padding(5.dp)
            ) {
                Column() {
                    Text(
                        "Problem Statement Preference",
                        fontSize = 18.sp,
                        modifier = Modifier.padding(10.dp),
                        fontWeight = FontWeight.W500
                    )
                    Text(
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vehicula non odio " +
                                "enim amet arcu euismod augue molestie. In nibh dolor neque," +
                                " ac. Integer morbi fringilla phasellus sed tincidunt in est mauris cursus. " +
                                "Nisl mauris, arcu hendrerit non elementum mattis habitant eget."
                    )
                    Text(
                        "Stages and Levels",
                        fontSize = 18.sp,
                        modifier = Modifier.padding(10.dp),
                        fontWeight = FontWeight.W500
                    )
                    Text(
                        "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vehicula non odio " +
                                "enim amet arcu euismod augue molestie. In nibh dolor neque," +
                                " ac. Integer morbi fringilla phasellus sed tincidunt in est mauris cursus. " +
                                "Nisl mauris, arcu hendrerit non elementum mattis habitant eget."
                    )

                }



            }
            Row(
                modifier=Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center

            ){
                CommonLoginButton(text = "Find Teammates", modifier = Modifier.padding(7.dp)) {
                    navController.navigate("team_members_screen")

                }

                CommonLoginButton(text = "Register", modifier = Modifier.padding(7.dp),
                    ){

                }
            }



        }

    }
}