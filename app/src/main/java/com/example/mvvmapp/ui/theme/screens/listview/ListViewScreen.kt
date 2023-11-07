package com.example.mvvmapp.ui.theme.screens.listview

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

val studename = mutableListOf( "Erick", "Faith", "Victor", " Keith", "Brad", "Bill")
val listmodifier = Modifier
    .fillMaxSize()
    .background(Color.LightGray)
    .padding(28.dp)
val mytextstyle = TextStyle(fontSize = 35.sp, fontFamily = FontFamily.Cursive, color = Color.DarkGray)

@Composable
fun ListViewScreen(navController: NavHostController) {

    LazyColumn(modifier = listmodifier, horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Top ){
        items(studename){ stud->
            Text(text = stud,style= mytextstyle)
        }
    }

}

@Preview
@Composable
fun listviewprev() {

    ListViewScreen(rememberNavController() )

}