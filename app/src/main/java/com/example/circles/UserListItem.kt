package com.example.circles

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.circles.data.model.User
import com.example.circles.ui.theme.graySurface

@Composable
fun UserListItem(user: User, navigateToProfile: (User) -> Unit,) {
    Card(
        modifier = Modifier
            .padding(horizontal = 8.dp, vertical = 8.dp)
            .fillMaxWidth(),
        elevation = 2.dp,
        backgroundColor = graySurface,
        shape = RoundedCornerShape(corner = CornerSize(16.dp)),
    ) {
        Row(Modifier.clickable { navigateToProfile(user) }) {
            userImage(user)
            Column(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterVertically)
            ) {
                Text(text = user.title, style = typography.h6)

                Card(backgroundColor = Color.Transparent,
                    modifier = Modifier
                        .padding(8.dp)
                        .alpha(0.95f)
                        .fillMaxSize(),
                        elevation = 50.dp,
                ) {
                    Text(text = user.tech_stack, style = typography.body1)
                }


            }
        }
    }
}

@Composable
private fun userImage(user: User) {
    Image(
        painter = painterResource(id = user.puppyImageId),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(8.dp)
            .size(84.dp)
            .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
    )
}


