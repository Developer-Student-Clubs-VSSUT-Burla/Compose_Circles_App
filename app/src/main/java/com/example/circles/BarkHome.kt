
package com.example.circles

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme.typography
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.circles.data.DataProvider
import com.example.circles.data.model.User
//import com.example.circles.ui.theme.typography

@Composable
fun BarkHomeContent(navigateToProfile: (User) -> Unit) {
    val users = remember { DataProvider.userList }
    Column(modifier = Modifier.fillMaxSize()) {

        Card(modifier = Modifier.fillMaxWidth(), elevation = 3.dp , backgroundColor = Color.Transparent) {
            Text(text = "Your Circle", style = typography.h3, modifier = Modifier.offset(90.dp))
        }

        LazyColumn(
            contentPadding = PaddingValues(horizontal = 16.dp, vertical = 78.dp)
        ) {
            items(
                items = users,
                itemContent = {
                    UserListItem(user = it, navigateToProfile)
                }
            )
        }
    }
}
