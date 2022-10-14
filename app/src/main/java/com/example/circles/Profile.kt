package com.example.circles

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.WbSunny
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.circles.ui.theme.GlassmorphismOnComposeTheme
import com.example.circles.ui.*
import com.example.circles.ui.theme.GlassmorphismOnComposeTheme

class Profile : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GlassmorphismOnComposeTheme {
                // A surface container using the 'background' color from the theme
                Glassmorpshism()

            }
        }
    }

    @OptIn(ExperimentalMaterialApi::class)
    @Preview(showBackground = true)
    @Composable
    fun Glassmorpshism() {
        val scrollState = rememberScrollState()
        Box(
        ) {
            Image(
                painter = painterResource(id = R.drawable.background),
                contentDescription = "background",
                modifier = Modifier
                    .fillMaxSize()
                    .blur(7.dp),
                contentScale = ContentScale.Crop,
            )
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color(0xDDF5F1F1)),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceEvenly
            ) {
                Column(
                    modifier = Modifier
                        .padding(top = 40.dp)
                        .fillMaxHeight()
                        .verticalScroll(scrollState),
                    verticalArrangement = Arrangement.SpaceEvenly,
                ) {
                    fullCard()
                }

            }
        }
    }
}


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun fullCard() {

    var expandedState by remember { mutableStateOf(false) }
    var size by remember {
        mutableStateOf(140.dp)
    }
    var isize by remember {
        mutableStateOf(100.dp)
    }
    Image(
        painterResource(R.drawable.rohit),
        contentDescription = "",
        contentScale = ContentScale.Crop,
        modifier = Modifier.height(120.dp).width(120.dp).offset(100.dp,isize)
    )
    Card(
        modifier = Modifier
            .padding(vertical = 16.dp)
            .width(330.dp)
            .height(size)
            .animateContentSize(
                animationSpec = tween(
                    durationMillis = 300,
                    easing = LinearOutSlowInEasing
                )
            ),
        onClick = {
            expandedState = !expandedState
        },
        backgroundColor = Color(0xFFDDD6D6),
        border = BorderStroke(1.dp, color = Color(0x25FFFFFF)),
        elevation = 0.dp,
        shape = RoundedCornerShape(16.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .alpha(1f)
                .blur(
                    radius = 28.dp,
                    edgeTreatment = BlurredEdgeTreatment.Unbounded
                )
                .background(
                    Brush.radialGradient(
                        listOf(
                            Color(0x12FFFFFF),
                            Color(0xDFFFFFF),
                            Color(0x9FFFFFFF)

                        ),
                        radius = 2200f,
                        center = Offset.Infinite
                    )
                )


        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                if(expandedState)
                {size=485.dp
                    isize=0.dp}
                else
                    size=125.dp


            }


        }
        Spacer(modifier = Modifier.padding(vertical = 10.dp))
        Text(modifier = Modifier
            .offset(75.dp),
            text = "Rohit Gogoi",
            style = MaterialTheme.typography.h4,
            color = Color.Magenta
        )


        Spacer(modifier = Modifier.height(20.dp))
        Text(modifier = Modifier
            .offset(15.dp,65.dp),
            text = "Place  :  Bhubaneshwar , Odisha\n\nAge :  24\n\n" +
                    "Languages : ",
            style = MaterialTheme.typography.h5,
            color = Color.DarkGray
        )


        Row(
            modifier = Modifier.offset(0.dp,250.dp)

        ) {
            Spacer(modifier = Modifier.width(10.dp))
            Image(
                painterResource(R.drawable.cpp),
                contentDescription = "",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.height(27.dp).width(70.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Image(
                painterResource(R.drawable.kotlin),
                contentDescription = "",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.height(27.dp).width(70.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Image(
                painterResource(R.drawable.html),
                contentDescription = "",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.height(27.dp).width(70.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Image(
                painterResource(R.drawable.css),
                contentDescription = "",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.height(27.dp).width(70.dp)
            )
        }

        Text(modifier = Modifier
            .offset(15.dp,305.dp),
            text = "Frameworks : ",
            style = MaterialTheme.typography.h5,
            color = Color.DarkGray
        )


        Row(
            modifier = Modifier.offset(0.dp,350.dp)

        ) {
            Spacer(modifier = Modifier.width(10.dp))
            Image(
                painterResource(R.drawable.react),
                contentDescription = "",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.height(25.dp).width(70.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Image(
                painterResource(R.drawable.django),
                contentDescription = "",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.height(25.dp).width(70.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Image(
                painterResource(R.drawable.mongo),
                contentDescription = "",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.height(25.dp).width(70.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Image(
                painterResource(R.drawable.larvel),
                contentDescription = "",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.height(25.dp).width(70.dp)
            )
        }

        Text(modifier = Modifier
            .offset(15.dp,390.dp),
            text = "Hackathon Rating : ",
            style = MaterialTheme.typography.h5,
            color = Color.DarkGray
        )
        Row(
            modifier = Modifier.offset(0.dp,430.dp)

        ) {

            Image(
                painterResource(R.drawable.star),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier.height(35.dp).width(65.dp)
            )

            Image(
                painterResource(R.drawable.star),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier.height(35.dp).width(65.dp)
            )

            Image(
                painterResource(R.drawable.star),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier.height(35.dp).width(65.dp)
            )

        }

        Text(modifier = Modifier
            .offset(15.dp,590.dp),
            text = "CP Rating : ",
            style = MaterialTheme.typography.h5,
            color = Color.DarkGray
        )
        Row(
            modifier = Modifier.offset(0.dp,430.dp)

        ) {

            Image(
                painterResource(R.drawable.star),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier.height(35.dp).width(65.dp)
            )

            Image(
                painterResource(R.drawable.star),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier.height(35.dp).width(65.dp)
            )

            Image(
                painterResource(R.drawable.star),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier.height(35.dp).width(65.dp)
            )

        }

    }
}