package com.example.mvvmapp.ui.theme.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mvvmapp.navigation.ROUTE_CALC
import com.example.mvvmapp.navigation.ROUTE_INTENT
import com.example.mvvmapp.navigation.ROUTE_LISTVIEW
import com.example.mvvmapp.navigation.ROUTE_LOGIN
import com.example.mvvmapp.navigation.ROUTE_REGISTER

@Composable
fun HomeScreen(navController: NavHostController) {

    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)){
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Home Screen",
            fontSize = 37.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Green)

        Spacer(modifier = Modifier.height(100.dp))
        Button(onClick = { navController.navigate(ROUTE_LOGIN) },
            modifier = Modifier
                .width(250.dp)
                .background(Color.Blue)

            ) {
            Text(text = "Login here",
                fontSize = 36.sp,
                fontFamily = FontFamily.SansSerif,
                )
        }
        Spacer(modifier = Modifier.height(100.dp))
        Button(onClick = { navController.navigate(ROUTE_REGISTER) },
            modifier = Modifier
                .width(250.dp)
                .background(Color.Blue)

        ) {
            Text(text = "Sign up here",
                fontSize = 36.sp,
                fontFamily = FontFamily.SansSerif,
            )



        }
        Spacer(modifier = Modifier.height(100.dp))
        Button(onClick = { navController.navigate(ROUTE_LISTVIEW) },
            modifier = Modifier
                .width(250.dp)
                .background(Color.Blue)

        ) {
            Text(text = "ListView",
                fontSize = 36.sp,
                fontFamily = FontFamily.SansSerif,
            )



        }
        Spacer(modifier = Modifier.height(100.dp))
        Button(onClick = { navController.navigate(ROUTE_CALC) },
            modifier = Modifier
                .width(250.dp)
                .background(Color.Blue)

        ) {
            Text(text = "calculator",
                fontSize = 36.sp,
                fontFamily = FontFamily.SansSerif,
            )



        }
        Spacer(modifier = Modifier.height(100.dp))
        Button(onClick = { navController.navigate(ROUTE_INTENT) },
            modifier = Modifier
                .width(250.dp)
                .background(Color.Blue)

        ) {
            Text(text = "Intent",
                fontSize = 36.sp,
                fontFamily = FontFamily.SansSerif,
            )



        }

    }

}

@Preview
@Composable
fun HomeScreenPrev() {

    HomeScreen(rememberNavController())

}