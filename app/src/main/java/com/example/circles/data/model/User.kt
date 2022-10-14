package com.example.circles.data.model

import java.io.Serializable

data class User(
    val id: Int,
    val title: String,
    val tech_stack: String,
    val age: Int,
    val description: String,
    val puppyImageId: Int = 0
) : Serializable
