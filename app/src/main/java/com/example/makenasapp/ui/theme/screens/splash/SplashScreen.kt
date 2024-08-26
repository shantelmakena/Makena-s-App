package com.example.makenasapp.ui.theme.screens.splash

import android.annotation.SuppressLint
import androidx.compose.foundation.Image

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text

import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.makenasapp.R
import com.example.makenasapp.navigation.ROUT_LOGIN
import com.example.makenasapp.ui.theme.newRed
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavController){
    Column (modifier = Modifier
        .fillMaxSize(),){

        var coroutineScope = rememberCoroutineScope()
        coroutineScope.launch {
            delay(2000)
            navController.navigate(ROUT_LOGIN)
        }






      Card (
          modifier = Modifier
              .fillMaxWidth()
              .height(500.dp),
          shape = RoundedCornerShape(bottomStart = 50.dp, bottomEnd = 50.dp),
          colors = CardDefaults.cardColors(newRed)){


          Spacer(modifier = Modifier.height(40.dp))

          Column (horizontalAlignment = Alignment.CenterHorizontally,
              verticalArrangement = Arrangement.Center,
              modifier = Modifier.fillMaxSize()){
             Image(
                 painter = painterResource(id =R.drawable.img),
                 contentDescription ="home",
                 modifier = Modifier
                     .size(200.dp)
             )
             Spacer(modifier = Modifier.height(40.dp))


              Text(
                  text ="Welcome to Amazon",
                  fontSize = 40.sp,
                  fontWeight = FontWeight.SemiBold,
                  fontFamily = FontFamily.Cursive,
                  color = Color.White,

                  )
              Spacer(modifier = Modifier.height(10.dp))


              Text(
                  text ="The future of faahion",
                  fontSize = 20.sp,
                  color = Color.White,

                  )



          }

      }

        Spacer(modifier = Modifier.height(40.dp))


        Text(
            text ="Amazon allows users to shop online, browse product catalogs, create wish lists, add items to a cart, and complete purchases. It also provides payment processing, shipping, and order management capabilities.",
            fontSize = 18.sp,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center

            )

        Spacer(modifier = Modifier.height(10.dp))


        Button(onClick = {

        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 40.dp, end = 40.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(newRed),
            shape = RoundedCornerShape(10.dp)

        ) {
            Text(text = "LET'S BEGIN!",
                fontWeight = FontWeight.ExtraBold,
                fontSize = 20.sp)
        }















    }

}






@Composable
@Preview(showBackground = true)
fun SplashScreenPreview(){
    SplashScreen(rememberNavController())

}