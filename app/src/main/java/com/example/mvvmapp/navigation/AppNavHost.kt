package com.example.mvvmapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.internal.composableLambdaInstance
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mvvmapp.ui.theme.screens.Calc.CalcScreen
import com.example.mvvmapp.ui.theme.screens.calculator.CalculatorScreen
import com.example.mvvmapp.ui.theme.screens.customview.CustomViewScreen
import com.example.mvvmapp.ui.theme.screens.customview.Newfruitslist
import com.example.mvvmapp.ui.theme.screens.home.HomeScreen
import com.example.mvvmapp.ui.theme.screens.intent.IntentScreen
import com.example.mvvmapp.ui.theme.screens.listview.ListViewScreen
import com.example.mvvmapp.ui.theme.screens.login.LoginScreen
import com.example.mvvmapp.ui.theme.screens.register.RegisterScreen

@Composable
fun AppNavHost(modifier: Modifier= Modifier,
               navController: NavHostController= rememberNavController(),
               startDestination: String= ROUTE_HOME)
{

    NavHost(navController=navController,
        modifier = modifier,
        startDestination = startDestination)
    {

        composable(ROUTE_HOME){
            HomeScreen(navController)
        }
        composable(ROUTE_LOGIN){
            LoginScreen(navController)
        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }
        composable(ROUTE_LISTVIEW){
            ListViewScreen(navController)
        }

        composable(ROUTE_CALC){
            CalcScreen(navController)
        }
        composable(ROUTE_INTENT){
            IntentScreen(navController )
        }

    }

}