package com.example.circles.data

import com.example.circles.R
import com.example.circles.data.model.User

object DataProvider {

    val user =
        User(
            id = 1,
            title = "Prerit",
            tech_stack = "MongoDb, React, Express js, Node js, Firebase , Android , Meteor js , Next js , Spring Boot",
            age = 20,
            description = "Open Source Developer , GSoC-21 ,core team member GDSC-VSSUT",
            puppyImageId = R.drawable.p1
        )

    val userList = listOf(
        user,
        User(
            id = 2,
            title = "Soham",
            tech_stack = "React , Node js, Express js , MongoDB , Next js, Three js , Figma , Adobe Illustrator",
            age = 20,
            description = "Figma designer , good hold on HTML ,CSS , Javascipt , React . Candidate master at Codeforces. CSE undergrad at VSSUT , Burla.",
            puppyImageId = R.drawable.p2
        ),
        User(
            id = 3,
            title = "Ayushi",
            tech_stack = "Kotlin , Jetpack Compose , Firebase , Flutter , ASP.net , RoomDB",
            age = 19,
            description = "Native Android developer , core team member at Enigma VSSUT . Exploring web dev and good hold on HTML ,CSS , Javascript",
            puppyImageId = R.drawable.p3
        ),
        User(
            id = 4,
            title = "Ravindra",
            tech_stack = "React , MongoDB, Express js , Node js , strapi , Angular,PostGre sql , GraphQL, Postman",
            age = 23,
            description = "Hola friends! I am a full stack developer . MERN developer . Assistant Secretary Enigma, VSSUT. Loves cat.",
            puppyImageId = R.drawable.p4
        ),
        User(
            id = 5,
            title = "Shruti",
            tech_stack = "Angular , MongoDB , Firebase, Tailwind, Github",
            age = 19,
            description = "Web developer . MERN stack. I love painting and illustration is my way of speaking . Adobe is love.",
            puppyImageId = R.drawable.p5
        ),
        User(
            id = 6,
            title = "Swastik",
            tech_stack = "Android , Jetpack Compose, Tensorflow , Kaggle , openCV , Apache Maven , Gradle",
            age = 20,
            description = "Android Developer . ML enthusiast . Loves to play with python. Anime and Jenshin Impact is life.",
            puppyImageId = R.drawable.p6
        ),
        User(
            id = 7,
            title = "Ishita",
            tech_stack = "Unity, Godot, PyGame , React , Firebase",
            age = 24,
            description = "Game Developer , Unity. Full stack MERN Developer. Dance is hobby. 4* at Codechef.",
            puppyImageId = R.drawable.p7
        ),
        User(
            id = 8,
            title = "Asutosh",
            tech_stack = "Rust, Typescript , Django , React , MySQL , Docker, Adobe photoshop , Illustrator, AfterEffects",
            age = 20,
            description = "Full stack web developer . MEAN stack.Adobe Illustrator. Figma.",
            puppyImageId = R.drawable.p8
        ),
        User(
            id = 9,
            title = "Amisha",
            tech_stack = "Flutter, React-Native, Github, Postman",
            age = 19,
            description = "Flutter Developer . Jetpack Compose . IT undergrad at VSSUT, Burla.",
            puppyImageId = R.drawable.p9
        ),
        User(
            id = 10,
            title = "Mehek",
            tech_stack = "React , MongoDB, Node js , Express js , Vercel , Next js , Postman , Strapi",
            age = 28,
            description = "ML enthusiast. Kaggle . Open source at MLH. 3* at Codechef.",
            puppyImageId = R.drawable.p10
        ),
        User(
            id = 11,
            title = "Sagar",
            tech_stack = "Android , Node js , Post man , Apache Maven , Next js , Firebase",
            age = 20,
            description = "I am an Native android developer . Jetpack Compose . Master at codeforces. Opensource  developer.",
            puppyImageId = R.drawable.p11
        ),

    )
}