package com.example.circles.ui.screens

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBackIos
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.circles.R
import com.example.circles.ui.theme.CirclesTheme

data class SupportCardDetails(
    @DrawableRes val image: Int,
    val heading: String,
    val description: String
)

val supportCardItems = listOf(
    SupportCardDetails(R.drawable.rectangle_2, "FAQs", "Find intelligent answers instantly"),
    SupportCardDetails(R.drawable.rectangle_2__1_, "Chat", "Start a conversation now"),
    SupportCardDetails(R.drawable.rectangle_2__2_, "Email", "Get a solution through mail")
)

@Composable
fun SupportScreen(modifier: Modifier = Modifier) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
    ) {
        item {
            TopInformationCard()
            Spacer(modifier = Modifier.height(30.dp))
        }

        item {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 40.dp)
            ) {
                Text(
                    text = "Tell us how we can help!",
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp
                )
                Text(
                    text = "Our crew of techies are standing by for your service and support",
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(10.dp))
            }
        }

        items(supportCardItems) {
            SupportCard(it)
        }

    }
}

@Composable
fun TopInformationCard(modifier: Modifier = Modifier) {
    Box(modifier = Modifier) {
        Card(
            shape = RoundedCornerShape(bottomStart = 30.dp, bottomEnd = 30.dp),
            modifier = Modifier
                .height(300.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.ss_1),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
        ) {
            IconButton(
                onClick = { /*TODO*/ },
                modifier = Modifier
                    .size(50.dp)
            ) {
                Icon(
                    imageVector = Icons.Outlined.ArrowBackIos,
                    contentDescription = null,
                    tint = Color.Black,
                    modifier = Modifier
                        .size(25.dp)
                )
            }
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    text = "Need Help?",
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .padding(top = 6.dp)
                )
                Text(
                    text = "24/7 Support Center",
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Composable
fun SupportCard(
    cardDetails: SupportCardDetails,
    modifier: Modifier = Modifier
) {
    Card(
        shape = RoundedCornerShape(20.dp),
        elevation = 4.dp,
        modifier = modifier
            .fillMaxWidth()
            .height(120.dp)
            .padding(horizontal = 12.dp, vertical = 8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(horizontal = 12.dp)
        ) {
            Image(
                painter = painterResource(id = cardDetails.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(60.dp)
            )
            Column(
                modifier = Modifier
                    .padding(horizontal = 12.dp)
            ) {
                Text(
                    text = cardDetails.heading,
                    fontWeight = FontWeight.Bold,
                    fontSize = 22.sp
                )
                Text(
                    text = cardDetails.description,
                    fontSize = 18.sp,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SupportScreenPreview() {
    CirclesTheme {
        SupportScreen()
    }
}