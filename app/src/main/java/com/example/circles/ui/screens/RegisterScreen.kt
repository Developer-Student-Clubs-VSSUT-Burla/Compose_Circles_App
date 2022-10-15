package com.example.circles.ui.screens

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.circles.MainActivity
import com.example.circles.R
import com.example.circles.ui.common.CommonGoogleButton
import com.example.circles.ui.common.CommonLoginButton
import com.example.circles.ui.common.CommonText
import com.example.circles.ui.common.CommonTextField
import com.example.circles.ui.theme.LightGrayColor
import com.example.circles.ui.theme.PinkColor
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

@Composable
fun RegisterScreen(navController: NavController) {
    val auth = Firebase.auth
    var fullName = remember { mutableStateOf(TextFieldValue()) }
    var emailValue = remember { mutableStateOf(TextFieldValue()) }
    var passwordValue = remember { mutableStateOf(TextFieldValue()) }
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(start = 30.dp, end = 30.dp, top = 20.dp, bottom = 20.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start,
                modifier = Modifier.fillMaxWidth()
            ) {
                CommonText(
                    text = "Create Account,",
                    fontSize = 34.sp,
                    fontWeight = FontWeight.Bold
                ) {}
                Spacer(modifier = Modifier.height(5.dp))
                CommonText(
                    text = "Sign up to get started!",
                    fontSize = 28.sp,
                    color = LightGrayColor
                ) {}
            }
            Box(
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.register),
                    contentDescription = "background",
                    modifier = Modifier.fillMaxSize(0.5f),
                    contentScale = ContentScale.FillWidth,
                )
            }
            OutlinedTextField(
                label = {
                    Text("Email")
                },

                value = emailValue.value,
                singleLine = true,
                modifier=Modifier.fillMaxWidth(),
                onValueChange = {
                    emailValue.value = it
                })
            OutlinedTextField(
                label = {
                    Text("Password")
                },
                value = passwordValue.value,
                singleLine = true,
                modifier=Modifier.fillMaxWidth(),
                onValueChange = {
                    passwordValue.value = it
                })
            Spacer(modifier = Modifier.weight(0.2f))
            CommonLoginButton(text = "Register", modifier = Modifier.fillMaxWidth(),
                onClick = {
                    auth.createUserWithEmailAndPassword(
                        emailValue.value.text.trim(),
                        passwordValue.value.text.trim(),
                    ).addOnCompleteListener{task->
                        if(task.isSuccessful){
                            navController.navigate("login_screen")
                        }
                        else{
                            Log.d("TAG","Error Occured")
                        }

                    }

                })
            Spacer(modifier = Modifier.weight(0.3f))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                CommonText(text = "I'm a new user,", fontSize = 18.sp) {}
                Spacer(modifier = Modifier.width(4.dp))
                CommonText(
                    text = "Sign In",
                    color = Color(0xFF00316E),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.W500
                ) {
                    navController.navigate("login_screen") {
                        popUpTo("login_screen") { inclusive = true }
                    }
                }
            }
        }
    }
}