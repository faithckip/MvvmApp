@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.mvvmapp.ui.theme.screens.Calc

import android.os.Bundle
import android.os.PersistableBundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mvvmapp.ui.theme.screens.calculator.CalculatorButton
import org.w3c.dom.Text


@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun CalcScreen(navController:NavHostController) {

    var firstNum by remember { mutableStateOf(TextFieldValue(" ")) }
    var secondNum by remember { mutableStateOf(TextFieldValue(" ")) }
    var answer by remember { mutableStateOf(" ") }
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {

        Text(
            text = answer,
            color = Color.White,
            fontSize = 30.sp
        )

        Spacer(modifier = Modifier.height(100.dp))

        OutlinedTextField(value = firstNum,
            label = {
                Text(
                    text = "Enter First No",
                    color = Color.White,
                    fontSize = 30.sp
                )
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            onValueChange = { firstNum = it })

        Spacer(modifier = Modifier.height(50.dp))

        OutlinedTextField(value = secondNum,
            label = {
                Text(
                    text = "Enter second No",
                    color = Color.White,
                    fontSize = 30.sp
                )
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            onValueChange = {
                secondNum = it
            })

        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Blue),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "+",
                fontSize = 30.sp
            )
        }

        Spacer(modifier = Modifier.height(50.dp))
        OutlinedButton(
            onClick = {
                val myfirstnum = firstNum.text.trim()
                val mysecondnum = secondNum.text.trim()
                if (myfirstnum.isEmpty() && mysecondnum.isEmpty()) {
                    answer = " please fill in all detail"
                } else {
                    val myanswer = myfirstnum.toDouble() - mysecondnum.toDouble()
                    answer = myanswer.toString()
                }
            },
            colors = ButtonDefaults.buttonColors(Color.Blue),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "-",
                fontSize = 30.sp
            )
        }
        Spacer(modifier = Modifier.height(50.dp))

        OutlinedButton(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Blue),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier.fillMaxWidth()
        ) {

            Text(
                text = " *",
                fontSize = 30.sp
            )
        }
        Spacer(modifier = Modifier.height(50.dp))

        OutlinedButton(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.Blue),
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "/",
                fontSize = 30.sp
            )

        }

    }

}
@Preview
@Composable
fun calcPreview() {

    CalcScreen(rememberNavController())

}
