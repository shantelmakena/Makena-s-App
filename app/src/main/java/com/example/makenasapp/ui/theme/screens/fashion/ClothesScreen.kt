package com.example.makenasapp.ui.theme.screens.fashion

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.makenasapp.R



@Composable
fun ClothesScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize()) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(500.dp),
        ) {
            Image(
                painter = painterResource(id = R.drawable.clothes1),
                contentDescription ="clothes",
                modifier = Modifier
                    .size(280.dp)
            )
            Text(
                text = "Oversize T-Shirt",
                fontSize = 20.sp
            )


        }

    }
}







@Composable
@Preview(showBackground = true)
fun ClothesScreenPreview(){
    ClothesScreen(rememberNavController() )

}
