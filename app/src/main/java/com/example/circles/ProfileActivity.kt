package com.example.circles

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import com.example.circles.data.model.User
import com.example.circles.ui.theme.MyTheme

class ProfileActivity : AppCompatActivity() {

    private val user: User by lazy {
        intent?.getSerializableExtra(user_ID) as User
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyTheme {
                ProfileScreen(user)
            }
        }
    }

    companion object {
        private const val user_ID = "user_id"
        fun newIntent(context: Context, user: User) =
            Intent(context, ProfileActivity::class.java).apply {
                putExtra(user_ID, user)
            }
    }
}
