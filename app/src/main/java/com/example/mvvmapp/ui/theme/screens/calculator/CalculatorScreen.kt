package com.example.mvvmapp.ui.theme.screens.calculator

import android.os.Bundle
import androidx.compose.foundation.Image
import androidx.compose.foundation.MarqueeSpacing
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mvvmapp.R
import com.example.mvvmapp.navigation.ROUTE_LOGIN
import com.example.mvvmapp.navigation.ROUTE_REGISTER
import com.example.mvvmapp.ui.theme.LightGray
import com.example.mvvmapp.ui.theme.Orange

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun CalculatorScreen(navController: NavHostController,
    state: CalculatorState,
    modifier: Modifier =Modifier,
    buttonSpacing: Dp=8.dp,
    onAction: (CalculatorActions) -> Unit
){
    Box(modifier = modifier){

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)){

            Text(
                text = state.number1 + (state.operation ?: " ") + state.number2,
                textAlign = TextAlign.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 32.dp),
                fontWeight = FontWeight.Light,
                fontSize = 80.sp,
                color = Color.White,
                maxLines = 2
            )
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){
                CalculatorButton(
                    symbol ="AC",
                    modifier = Modifier
                        .background(LightGray)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick={
                        onAction(CalculatorActions.Clear)
                    }
                )
                CalculatorButton(
                    symbol ="Del",
                            modifier = Modifier
                                .background(LightGray)
                                .aspectRatio(1f)
                                .weight(1f),
                onClick={
                    onAction(CalculatorActions.Delete)
                }
                )

                CalculatorButton(
                    symbol ="/",
                            modifier = Modifier
                                .background(Orange)
                                .aspectRatio(1f)
                                .weight(1f),
                onClick={
                    onAction(CalculatorActions.Operation(CalculatorOperation.Divide))
                }
                )
            }
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){
                CalculatorButton(
                    symbol ="7 ",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                onClick={
                    onAction(CalculatorActions.Number(7))
                }
                )
                CalculatorButton(
                    symbol ="8 ",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick={
                        onAction(CalculatorActions.Number(8))
                    }
                )
                CalculatorButton(
                    symbol ="9 ",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick={
                        onAction(CalculatorActions.Number(9))
                    }
                )

                CalculatorButton(
                    symbol ="*",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                onClick={
                    onAction(CalculatorActions.Operation(CalculatorOperation.Multiply))
                }
                )
            }
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){
                CalculatorButton(
                    symbol ="4 ",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick={
                        onAction(CalculatorActions.Number(4))
                    }
                )
                CalculatorButton(
                    symbol ="5 ",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick={
                        onAction(CalculatorActions.Number(5))
                    }
                )
                CalculatorButton(
                    symbol ="6 ",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick={
                        onAction(CalculatorActions.Number(6))
                    }
                )

                CalculatorButton(
                    symbol ="-",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick={
                        onAction(CalculatorActions.Operation(CalculatorOperation.Subtract))
                    }
                )
            }
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){
                CalculatorButton(
                    symbol ="1 ",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick={
                        onAction(CalculatorActions.Number(1))
                    }
                )
                CalculatorButton(
                    symbol ="2 ",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick={
                        onAction(CalculatorActions.Number(2))
                    }
                )
                CalculatorButton(
                    symbol ="3 ",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick={
                        onAction(CalculatorActions.Number(3))
                    }
                )

                CalculatorButton(
                    symbol ="+",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick={
                        onAction(CalculatorActions.Operation(CalculatorOperation.Add))
                    }
                )
            }
            Row (
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){
                CalculatorButton(
                    symbol ="0 ",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(2f)
                        .weight(2f),

                    onClick={
                        onAction(CalculatorActions.Number(0))
                    }
                )
                CalculatorButton(
                    symbol =". ",
                    modifier = Modifier
                        .background(Color.DarkGray)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick={
                        onAction(CalculatorActions.Decimal)
                    }
                )
                CalculatorButton(
                    symbol ="= ",
                    modifier = Modifier
                        .background(Orange)
                        .aspectRatio(1f)
                        .weight(1f),

                    onClick={
                        onAction(CalculatorActions.Calculate)
                    }
                )

            }
        }
        }
    }

@Preview
@Composable
fun calprev() {

    //CalculatorScreen()

}




                  