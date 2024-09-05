package com.example.makenasapp.ui.theme.screens.home1

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.AbsoluteCutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import com.example.makenasapp.navigation.ROUT_HOME3
import com.example.makenasapp.navigation.ROUT_MAIN
import com.example.makenasapp.ui.theme.newRed
import com.example.makenasapp.ui.theme.screens.home.HomeScreen

@Composable
fun Home3Screen(navController: NavController) {

    Column(modifier = Modifier
        .fillMaxSize()

    ) {


        Card (
            modifier = Modifier
                .fillMaxWidth()
                .height(500.dp),
            shape = AbsoluteCutCornerShape(bottomRight = 370.dp),
            colors = CardDefaults.cardColors(newRed)) {



            Column (horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxSize()){
                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text ="DELIVERED",
                    fontSize = 40.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White,

                    )




                Text(
                    text ="  By embracing these innovations and overcoming current challenges, Kenya's e-commerce sector can unlock the full potential of last-mile delivery",
                    fontSize = 18.sp,
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    color = Color.White

                )





            }



        }
        Spacer(modifier = Modifier.height(10.dp))

        Box( modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center){
            Image(
                painter = painterResource(id = R.drawable.img_1),
                contentDescription ="home",
                modifier = Modifier
                    .size(280.dp)
            )



        }

        Button(onClick = { navController.navigate(ROUT_MAIN) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(newRed),
            shape = RoundedCornerShape(10.dp)

        ) {
            Text(text = "Continue",
                fontSize = 20.sp

            )
        }
















    }


}




@Composable
@Preview(showBackground = true)
fun Home3ScreenPreview(){
    Home3Screen(rememberNavController() )

}


