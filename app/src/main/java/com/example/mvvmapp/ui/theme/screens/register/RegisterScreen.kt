package com.example.mvvmapp.ui.theme.screens.register

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mvvmapp.R
import com.example.mvvmapp.navigation.ROUTE_HOME
import com.example.mvvmapp.navigation.ROUTE_REGISTER


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterScreen(navController: NavHostController) {

    var username by remember {
        mutableStateOf(TextFieldValue())
    }
    val email by remember {
        mutableStateOf(TextFieldValue())
    }
    var pasword by remember {
        mutableStateOf(TextFieldValue())
    }
    val confirmpassword by remember {
        mutableStateOf(TextFieldValue())
    }
    Column(horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Cyan)

    ) {
        Text(text = "Register Screen",
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Magenta
        )

        Image(painter = painterResource(id = R.drawable.faith), contentDescription = "Faith Pic" )
        Spacer(modifier = Modifier.height(20.dp))


        OutlinedTextField(
            value = username,
            label= { Text(text = "Username") },
            onValueChange = { username = it }
        )
        OutlinedTextField(
            value = email, label = { Text(text = "email") },
            onValueChange = {
                pasword = it }
        )
        OutlinedTextField(
            value = pasword,
            label= { Text(text = "Password") },
            onValueChange = { username = it }
        )
        OutlinedTextField(
            value = confirmpassword, label = { Text(text = "ConfirmPassword") },
            onValueChange = {
                pasword = it }
        )
        Spacer(modifier = Modifier.height(30.dp))

        Button(onClick = { navController.navigate(ROUTE_HOME)},
            colors = ButtonDefaults.buttonColors(Color.Blue),
            modifier = Modifier.width(300.dp)){
            Text(text = "Save",
                fontSize = 28.sp,
                color = Color.White)


        }
        Spacer(modifier = Modifier.height(60.dp))

        Button(onClick = { navController.navigate(ROUTE_REGISTER) },
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier
                .width(300.dp)
                .height(30.dp)) {
            Text(text = " Don't have an account? Click to Register",
                fontSize = 10.sp,
                color= Color.DarkGray)


        }

    }

}

@Preview
@Composable
fun `RegisterScreen-preview`() {

    RegisterScreen(rememberNavController())

}