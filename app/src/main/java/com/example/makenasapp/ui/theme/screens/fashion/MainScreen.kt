package com.example.makenasapp.ui.theme.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.makenasapp.R
import com.example.makenasapp.navigation.ADD_PRODUCTS_URL
import com.example.makenasapp.navigation.ROUT_HOME
import com.example.makenasapp.navigation.ROUT_CLOTHES
import com.example.makenasapp.navigation.ROUT_SCARF
import com.example.makenasapp.navigation.ROUT_SHOES
import com.example.makenasapp.navigation.ROUT_WATCH
import com.example.makenasapp.navigation.VIEW_PRODUCTS_URL
import com.example.makenasapp.ui.theme.newRed1
import com.example.makenasapp.ui.theme.newRed

@Composable
fun MainScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Spacer(modifier = Modifier.height(10.dp))
        Image(painterResource(
            id = R.drawable.shopping2),
            contentDescription = "home",
            modifier = Modifier.size(100.dp),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(5.dp))
        Text(
            text = "Shop with us at a fair price",
            fontSize = 18.sp
        )
        Spacer(modifier = Modifier.height(15.dp))
        Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
            //Main Card
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(700.dp),
                shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp),



            ) {
                //Row1
                Row(modifier = Modifier.padding(20.dp)) {
                    //Card One
                    Card(
                        modifier = Modifier
                            .width(160.dp)
                            .height(180.dp)
                            .clickable { navController.navigate(ROUT_CLOTHES) },
                        elevation = CardDefaults.cardElevation(20.dp)

                    ) {
                        Column() {
                            Spacer(modifier = Modifier.height(10.dp))
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.clothes1),
                                    contentDescription = "",
                                    modifier = Modifier.size(100.dp)
                                )
                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Clothes",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )

                        }


                    }
                    //End of card one
                    Spacer(modifier = Modifier.width(25.dp))
                    //Card One
                    Card(modifier = Modifier
                        .clickable { navController.navigate(ROUT_WATCH) }
                        .width(160.dp)
                        .height(180.dp)) {
                        Column() {
                            Spacer(modifier = Modifier.height(10.dp))
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.watch),
                                    contentDescription = "",
                                    modifier = Modifier.size(100.dp)
                                )
                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Watches",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )

                        }


                    }
                    //End of card one

                }
                //End of row1
                //Row1
                Row(modifier = Modifier.padding(20.dp)) {
                    //Card One
                    Card(
                        modifier = Modifier
                            .clickable { navController.navigate(ROUT_SHOES) }
                            .width(160.dp)
                            .height(180.dp)
                    ) {
                        Column() {
                            Spacer(modifier = Modifier.height(10.dp))
                            Box(
                                modifier = Modifier.fillMaxWidth(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.shoes),
                                    contentDescription = "",
                                    modifier = Modifier.size(100.dp)
                                )
                            }
                            Spacer(modifier = Modifier.height(10.dp))
                            Text(
                                text = "Shoes",
                                fontSize = 18.sp,
                                modifier = Modifier.fillMaxWidth(),
                                textAlign = TextAlign.Center
                            )

                        }


                    }
                    //End of card one
                    Spacer(modifier = Modifier.width(25.dp))
                    //Card One
                    Card(
                        modifier = Modifier
                            .clickable { navController.navigate(ROUT_SCARF) }
                            .width(160.dp)
                            .height(180.dp)
                    ) {
                        Spacer(modifier = Modifier.height(10.dp))
                        Box(
                            modifier = Modifier.fillMaxWidth(),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.scarfs),
                                contentDescription = "",
                                modifier = Modifier.size(100.dp)
                            )
                        }
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = "Scarfs",
                            fontSize = 18.sp,
                            modifier = Modifier.fillMaxWidth(),
                            textAlign = TextAlign.Center
                        )

                    }


                }
                //End of card one


                //End of row2
                Spacer(modifier = Modifier.height(10.dp))

            }
            //End of main card



        }


    }

}




@Composable
@Preview(showBackground = true)
fun MainScreenPreview(){
    MainScreen(rememberNavController() )

}