package com.example.makenasapp.ui.theme.screens.home1

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
import com.example.makenasapp.ui.theme.newRed
import com.example.makenasapp.ui.theme.screens.home.HomeScreen

@Composable
fun Home1Screen(navController: NavController) {

    Column(modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {

        Spacer(modifier = Modifier.height(30.dp))

        Image(
            painter = painterResource(id = R.drawable.img),
            contentDescription ="home",
            modifier = Modifier
                .size(300.dp)
        )


        Spacer(modifier = Modifier.height(80.dp))

        Card (
            modifier = Modifier
                .fillMaxWidth()
                .height(500.dp),
            shape = RoundedCornerShape(topStart = 380.dp),
            colors = CardDefaults.cardColors(newRed)) {

            Spacer(modifier = Modifier.height(200.dp))


          Column (modifier = Modifier.padding(start = 160.dp)){
              Text(
                  text ="PURCHASE",
                  fontSize = 40.sp,
                  fontWeight = FontWeight.SemiBold,
                  color = Color.White,

                  )

              Spacer(modifier = Modifier.height(10.dp))

              Text(
                  text ="ONLINE",
                  fontSize = 40.sp,
                  fontWeight = FontWeight.SemiBold,
                  color = Color.White,

                  )



          }
            Text(
                text =" It also provides payment processing, shipping, and order management capabilities.",
                fontSize = 18.sp,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                color = Color.White

            )




        }



















        }


}




@Composable
@Preview(showBackground = true)
fun Home1ScreenPreview(){
    Home1Screen(rememberNavController() )

}
