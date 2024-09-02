package com.example.makenasapp.ui.theme.screens.fashion

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.makenasapp.R
import com.example.makenasapp.navigation.ADD_PRODUCTS_URL
import com.example.makenasapp.navigation.ROUT_CLOTHES
import com.example.makenasapp.navigation.ROUT_HOME
import com.example.makenasapp.navigation.ROUT_HOME1
import com.example.makenasapp.navigation.VIEW_PRODUCTS_URL
import com.example.makenasapp.ui.theme.LightBlue
import com.example.makenasapp.ui.theme.newRed
import com.example.makenasapp.ui.theme.newRed1
import com.example.makenasapp.ui.theme.screens.products.BottomNavItem
import com.example.makenasapp.ui.theme.screens.products.bottomNavItems

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(navController:NavHostController) {
    Column(modifier = Modifier.fillMaxSize()) {

        var selected by remember { mutableIntStateOf(0) }
        Scaffold(
            bottomBar = {
                NavigationBar(
                    containerColor = newRed1
                ) {
                    bottomNavItems.forEachIndexed { index, bottomNavItem ->
                        NavigationBarItem(
                            selected = index == selected,
                            onClick = {
                                selected = index
                                navController.navigate(bottomNavItem.route)
                            },
                            icon = {
                                BadgedBox(
                                    badge = {
                                        if (bottomNavItem.badges != 0) {
                                            Badge {
                                                Text(text = bottomNavItem.badges.toString())
                                            }
                                        } else if (bottomNavItem.hasNews) {
                                            Badge()
                                        }
                                    }
                                ) {
                                    Icon(imageVector =
                                    if (index == selected)
                                        bottomNavItem.selectedIcon
                                    else
                                        bottomNavItem.unselectedIcon,
                                        contentDescription = bottomNavItem.title)
                                }

                            },
                            label = {
                                Text(text = bottomNavItem.title)
                            })
                    }

                }
            },
            topBar = {
                TopAppBar(title = {
                    Text(text = "Amazon",
                        fontFamily = FontFamily.Cursive,
                        fontSize = 40.sp,
                        color = (Color.Magenta),
                        colors = TopAppBarDefaults.mediumTopAppBarColors(newRed1),
                                  },

                    )
            },


            floatingActionButton = {
                FloatingActionButton(onClick = { /*TODO*/ }) {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(imageVector = Icons.Default.Add,
                            contentDescription = "menu")
                    }
                }
            },
            //Content Section
            content = @Composable{
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 80.dp, start = 20.dp)
                        .verticalScroll(rememberScrollState()),

                    ){

                        //main card

                        Card (modifier = Modifier
                            .fillMaxWidth()
                            .height(700.dp),
                            shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp),
                            colors = CardDefaults.cardColors(Color.White)

                        ){
                            //row1

                            Row(modifier = Modifier.padding(20.dp)) {
                                //card1
                                Card (modifier = Modifier
                                    .clickable { navController.navigate(ROUT_CLOTHES) }
                                    .width(160.dp)
                                    .height(180.dp),
                                    elevation = CardDefaults.cardElevation(30.dp)
                                ){
                                    Column {
                                        Spacer(modifier = Modifier.height(15.dp))
                                        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {

                                            Image(painter = painterResource(id = R.drawable.clothes) ,
                                                contentDescription ="",
                                                modifier = Modifier
                                                    .size(80.dp)
                                            )

                                        }
                                        Spacer(modifier = Modifier.height(15.dp))
                                        Text(
                                            text ="Home",
                                            fontSize = 18.sp,
                                            modifier = Modifier.fillMaxWidth(),
                                            textAlign = TextAlign.Center)

                                    }

                                }
                                //end of card1
                                Spacer(modifier = Modifier.width(20.dp))

                                //card2
                                Card (modifier = Modifier
                                    .clickable { navController.navigate(ROUT_HOME1) }
                                    .width(160.dp)
                                    .height(180.dp),
                                    elevation = CardDefaults.cardElevation(30.dp)
                                ){
                                    Column {
                                        Spacer(modifier = Modifier.height(15.dp))
                                        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {

                                            Image(painter = painterResource(id = R.drawable.property) ,
                                                contentDescription ="",
                                                modifier = Modifier
                                                    .size(80.dp)
                                            )

                                        }
                                        Spacer(modifier = Modifier.height(15.dp))
                                        Text(
                                            text ="Property",
                                            fontSize = 18.sp,
                                            modifier = Modifier.fillMaxWidth(),
                                            textAlign = TextAlign.Center)

                                    }

                                }
                                //end of card2

                            }
                            //end of row1

                            //row2

                            Row(modifier = Modifier.padding(20.dp)) {
                                //card1
                                Card (modifier = Modifier
                                    .width(160.dp)
                                    .height(180.dp),
                                    elevation = CardDefaults.cardElevation(30.dp)
                                ){
                                    Column {
                                        Spacer(modifier = Modifier.height(15.dp))
                                        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {

                                            Image(painter = painterResource(id = R.drawable.clothes) ,
                                                contentDescription ="",
                                                modifier = Modifier
                                                    .size(80.dp)
                                            )

                                        }
                                        Spacer(modifier = Modifier.height(15.dp))
                                        Text(
                                            text ="Settings",
                                            fontSize = 18.sp,
                                            modifier = Modifier.fillMaxWidth(),
                                            textAlign = TextAlign.Center)

                                    }

                                }
                                //end of card1
                                Spacer(modifier = Modifier.width(20.dp))

                                //card2
                                Card (modifier = Modifier
                                    .width(160.dp)
                                    .height(180.dp),
                                    elevation = CardDefaults.cardElevation(30.dp)
                                ){
                                    Column {
                                        Spacer(modifier = Modifier.height(15.dp))
                                        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {

                                            Image(painter = painterResource(id = R.drawable.watch) ,
                                                contentDescription ="",
                                                modifier = Modifier
                                                    .size(80.dp)
                                            )

                                        }
                                        Spacer(modifier = Modifier.height(15.dp))
                                        Text(
                                            text ="Profile",
                                            fontSize = 18.sp,
                                            modifier = Modifier.fillMaxWidth(),
                                            textAlign = TextAlign.Center)

                                    }

                                }
                                //end of card2

                            }
                            //end of row2

                            //row3

                            Row(modifier = Modifier.padding(20.dp)) {
                                //card1
                                Card (modifier = Modifier
                                    .width(160.dp)
                                    .clickable { navController.navigate(ADD_PRODUCTS_URL) }
                                    .height(180.dp),

                                    elevation = CardDefaults.cardElevation(30.dp)
                                ){
                                    Column {
                                        Spacer(modifier = Modifier.height(15.dp))
                                        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {

                                            Image(painter = painterResource(id = R.drawable.img_1) ,
                                                contentDescription ="",
                                                modifier = Modifier
                                                    .size(80.dp)
                                            )

                                        }
                                        Spacer(modifier = Modifier.height(15.dp))
                                        Text(
                                            text ="Add Products",
                                            fontSize = 18.sp,
                                            modifier = Modifier.fillMaxWidth(),
                                            textAlign = TextAlign.Center)

                                    }

                                }
                                //end of card1
                                Spacer(modifier = Modifier.width(20.dp))

                                //card2
                                Card (modifier = Modifier
                                    .width(160.dp)
                                    .clickable { navController.navigate(VIEW_PRODUCTS_URL) }
                                    .height(180.dp),
                                    elevation = CardDefaults.cardElevation(30.dp)
                                ){
                                    Column {
                                        Spacer(modifier = Modifier.height(15.dp))
                                        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {

                                            Image(painter = painterResource(id = R.drawable.img_1) ,
                                                contentDescription ="",
                                                modifier = Modifier
                                                    .size(80.dp)
                                            )

                                        }
                                        Spacer(modifier = Modifier.height(15.dp))
                                        Text(
                                            text ="View",
                                            fontSize = 18.sp,
                                            modifier = Modifier.fillMaxWidth(),
                                            textAlign = TextAlign.Center)

                                    }

                                }
                                //end of card2

                            }
                            //end of row3

                        }
                        //end of main card

                    }





            }

        )

    }



}

val bottomNavItems = listOf(
    BottomNavItem(
        title = "Homepage",
        route="home",
        selectedIcon=Icons.Filled.Home,
        unselectedIcon=Icons.Outlined.Home,
        hasNews = false,
        badges=0
    ),



    BottomNavItem(
        title = "Details",
        route="detail",
        selectedIcon=Icons.Filled.Info,
        unselectedIcon=Icons.Outlined.Info,
        hasNews = true,
        badges=5
    ),

    BottomNavItem(
        title = "Property",
        route="property",
        selectedIcon=Icons.Filled.FavoriteBorder,
        unselectedIcon=Icons.Outlined.FavoriteBorder,
        hasNews = true,
        badges=1
    ),


    )



data class BottomNavItem(
    val title :String,
    val route :String,
    val selectedIcon: ImageVector,
    val unselectedIcon : ImageVector,
    val hasNews :Boolean,
    val badges :Int
)


@Composable
@Preview(showBackground = true)
fun MainScreenPreview(){

    MainScreen(navController = rememberNavController())

}