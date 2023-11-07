package com.example.mvvmapp.ui.theme.screens.customview

import android.graphics.ColorSpace
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mvvmapp.R
import com.google.android.gms.tflite.acceleration.Model
import android.graphics.ColorSpace.Model as Model1

data class FruitModel(val name: String, val image: Int)

private val fruitsList =  mutableListOf<FruitModel>(
    //"fruitsList.add(
    FruitModel(" Apple ", R.drawable.apple),
    FruitModel(" Orange ", R.drawable.orange),
    FruitModel(" Banana ", R.drawable.banana),
    FruitModel(" Strawberry ", R.drawable.strawberry),
    FruitModel(" Mango ", R.drawable.mango))


@Composable
fun CustomViewScreen(navController: NavHostController, model: FruitModel) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .background(color = Color.Blue)
    ) {

        Image(
            painter = painterResource(id = model.image),
            contentDescription = " ",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .padding(20.dp)
        )
        Text(
            text = model.name,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        )
    }
}
    @Composable
    fun Newfruitslist(navController: NavHostController) {

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.LightGray)
        ) {

            items(fruitsList) { model ->

                CustomViewScreen(navController = navController, model = model)
            }
        }

    }


    @Preview
    @Composable
    fun customlistprev() {

        Newfruitslist(rememberNavController()
        )


    }