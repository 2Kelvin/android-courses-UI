package com.example.coursesui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coursesui.ui.theme.CoursesUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CoursesUITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    CoursesUI()
                }
            }
        }
    }
}

//font mulish
val mulish = FontFamily(
    Font(R.font.mulish_bold, FontWeight.Normal),
    Font(R.font.mulish_medium, FontWeight.Medium),
    Font(R.font.mulish_extra_light, FontWeight.ExtraLight)
)

@Composable
fun CoursesUI() {
    Column(
        Modifier
            .fillMaxSize()
            .background(colorResource(R.color.bg_purple))
    ) {
        // hey James
        Row(
            Modifier
                .fillMaxWidth()
                .padding(top = 30.dp, start = 15.dp, end = 15.dp, bottom = 15.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column() {
                Text(
                    text = "Hey James",
                    color = Color.White,
                    fontFamily = mulish,
                    fontSize = 28.sp
                )

                Text(
                    text = "Find what you want",
                    fontFamily = mulish,
                    fontSize = 28.sp,
                    color = Color.White
                )
            }
            Column(
                verticalArrangement = Arrangement.Center
            ) {
                Card(
                    shape = CircleShape,
                    backgroundColor = colorResource(R.color.search_purple)
                ) {
                    Icon(
                        imageVector = Icons.Rounded.Search,
                        contentDescription = null,
                        tint = Color.White,
                        modifier = Modifier
                            .padding(7.dp)
                            .size(40.dp)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CoursesUIPreview() {
    CoursesUITheme {
        CoursesUI()
    }
}