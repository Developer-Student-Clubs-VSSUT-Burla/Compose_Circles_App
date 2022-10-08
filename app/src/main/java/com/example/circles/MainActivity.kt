package com.example.opensource

import android.os.Bundle
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.ui.Alignment
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.opensource.ui.theme.OpensourceTheme
import androidx.compose.foundation.clickable as clickable1
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OpensourceTheme {
                Body(onClick = {})
                Header()

            }
        }
    }
}

@Composable
fun Body(onClick:()->Unit){
    Box(modifier=Modifier.paddingFromBaseline(top=40.dp))
    LazyColumn(modifier = Modifier.padding(start = 10.dp)) {
        items(count = 50) {


            Card(modifier= Modifier
                .padding(start = 3.dp, top = 20.dp, end = 7.dp)
                .wrapContentSize(align = Alignment.CenterStart)
                .background(color = Color.LightGray, shape = RoundedCornerShape(10.dp))
                .clickable1 { onClick }, elevation = 10.dp
            ) {
                Column {

                    Text(
                        text = "   # Demo OpenSource", fontSize = 24.sp,
                        textAlign = TextAlign.Left,
                        fontWeight = FontWeight.SemiBold,


                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 10.dp),
                        style = MaterialTheme.typography.h4

                    )
                    Text(
                        text = "            Tap to View->", fontSize = 15.sp,
                        textAlign = TextAlign.Left,


                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(bottom=5.dp),
                        style = MaterialTheme.typography.h2

                    )
                }
            }

        }



    }
}


@Composable
fun Header() {
    Box(
        modifier = Modifier
            .height(55.dp)
            .fillMaxWidth()
            .background(Color.Black)
    ){
        val painter= painterResource(id =R.drawable.backarrow)
        val notification = rememberSaveable { mutableStateOf("") }
        if (notification.value.isNotEmpty()) {
            Toast.makeText(LocalContext.current, notification.value, Toast.LENGTH_SHORT).show()
            notification.value = ""
        }
        Image(painter = painter,contentDescription = null,modifier= Modifier
            .clickable1 { notification.value = "back" }

            .padding(start = 10.dp, top = 17.dp)
            .background(color = Color.Cyan, shape = RoundedCornerShape(15.dp))
        )

    }
    Text(
        text = "OpenSource",
        modifier = Modifier

            .padding(start=50.dp,top=10.dp),


        color = Color.Cyan,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        fontSize = 24.sp,
        letterSpacing = 1.sp

    )

}





@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    OpensourceTheme {
        Header()
        Body(onClick = {})
    }
}
