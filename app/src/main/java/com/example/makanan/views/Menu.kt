package com.example.makanan.views

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.defaultMinSize
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
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.makanan.R
import com.example.makanan.components.BottomBar
import com.example.makanan.components.TopBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Menu(navController: NavController) {
    var search by remember {
        mutableStateOf("")
    }

    val horizontalState = rememberScrollState()
    val horizontalState2 = rememberScrollState()
    val verticalScrollState = rememberScrollState()


    Scaffold(
        topBar = { TopBar() },
        bottomBar = { BottomBar() }
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.onBackground)
                .padding(it),
        ) {
            Column(
                modifier = Modifier
                    .verticalScroll(verticalScrollState)
                    .padding(bottom = 20.dp)
            ) {

                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp),
                ) {
                    OutlinedTextField(
                        label = { Text(text = "Search") },
                        value = search,
                        onValueChange = { search = it },
                        shape = RoundedCornerShape(50),
                        leadingIcon = {
                            Icon(
                                Icons.Filled.Search,
                                contentDescription = "Search",
                                modifier = Modifier
                                    .size(32.dp),
                                tint = colorResource(R.color.third)
                            )
                        },
                        colors = TextFieldDefaults.textFieldColors(
                            textColor = colorResource(R.color.third),
                            containerColor = colorResource(R.color.empat),
                            focusedIndicatorColor = colorResource(R.color.empat),
                            focusedLabelColor = colorResource(R.color.third)
                        ),
                        modifier = Modifier
                            .defaultMinSize(minHeight = 50.dp)
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Row(
                        modifier = Modifier
                            .horizontalScroll(horizontalState)
                            .fillMaxWidth()
                            .padding(top = 30.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.spacedBy(-30.dp),
                    ) {
                        Box(
                            modifier = Modifier
                                .width(380.dp)
                                .height(120.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.banenr2),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxSize()
                            )
                        }
                        Box(
                            modifier = Modifier
                                .width(340.dp)
                                .height(120.dp)
                        ) {
                            Image(
                                painter = painterResource(R.drawable.banner1),
                                contentDescription = null,
                                modifier = Modifier
                                    .fillMaxSize()
                            )
                        }
                    }
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp, start = 20.dp, end = 20.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Column(
                            verticalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            Text(
                                text = "Today New Arivable",
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "Best of the today  food list update",
                                color = Color.Black,
                                fontSize = 12.sp
                            )
                        }
                        Row(
                            modifier = Modifier
                                .clickable { }
                        ) {
                            Text(
                                text = "See All",
                                color = Color.Black
                            )
                            Icon(
                                Icons.Filled.KeyboardArrowRight,
                                contentDescription = null,
                                tint = Color.Black
                            )
                        }
                    }
                    Row(
                        Modifier
                            .fillMaxWidth()
                            .horizontalScroll(horizontalState2)
                            .padding(top = 70.dp),
                        horizontalArrangement = Arrangement.spacedBy(12.dp)
                    ) {
                        for (i in 1..4) {
                            Card(
                                shape = RoundedCornerShape(5),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.White
                                ),
                                modifier = Modifier
                                    .size(width = 170.dp, height = 226.dp)
                                    .clickable { }
                            ) {
                                Column(
                                ) {
                                    if (i % 2 == 0) {
                                        Image(
                                            painter = painterResource(R.drawable.makan2),
                                            contentDescription = null,
                                            modifier = Modifier
                                                .size(width = 200.dp, height = 120.dp)
                                                .padding(top = 12.dp)
                                                .clip(RoundedCornerShape(5))
                                        )
                                    } else {
                                        Image(
                                            painter = painterResource(R.drawable.makan3),
                                            contentDescription = null,
                                            modifier = Modifier
                                                .size(width = 200.dp, height = 120.dp)
                                                .padding(top = 12.dp)
                                                .clip(RoundedCornerShape(5))
                                        )
                                    }
                                    Text(
                                        text = "Chicken Biryani",
                                        color = Color.Black,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier
                                            .padding(start = 20.dp, top = 12.dp)
                                    )
                                    Row(
                                        Modifier
                                            .padding(start = 20.dp, top = 12.dp),
                                        horizontalArrangement = Arrangement.spacedBy(5.dp)
                                    ) {
                                        Icon(
                                            Icons.Filled.LocationOn,
                                            contentDescription = null,
                                            tint = colorResource(id = R.color.secondary),
                                            modifier = Modifier
                                                .size(20.dp)
                                        )
                                        Text(
                                            text = "Ambrosia Hotel & Restaurant",
                                            color = colorResource(id = R.color.third),
                                            fontSize = 12.sp
                                        )
                                    }
                                }
                            }
                        }
                    }

                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp, start = 20.dp, end = 20.dp)
                ) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier
                            .fillMaxWidth()
                    ) {
                        Column(
                            verticalArrangement = Arrangement.spacedBy(4.dp)
                        ) {
                            Text(
                                text = "Explore Restaurant",
                                color = Color.Black,
                                fontWeight = FontWeight.Bold
                            )
                            Text(
                                text = "Check your city Near by Restaurant",
                                color = Color.Black,
                                fontSize = 12.sp
                            )
                        }
                        Row(
                            modifier = Modifier
                                .clickable { }
                        ) {
                            Text(
                                text = "See All",
                                color = Color.Black
                            )
                            Icon(
                                Icons.Filled.KeyboardArrowRight,
                                contentDescription = null,
                                tint = Color.Black
                            )
                        }
                    }
                    Column(
                        modifier = Modifier
                            .padding(top = 60.dp),
                        verticalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        for (i in 1..5) {
                            Card(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(100.dp)
                                    .padding(start = 5.dp, end = 5.dp)
                                    .clickable { },
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.White
                                )
                            ) {
                                Row(
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically,
                                    modifier = Modifier
                                        .padding(10.dp)
                                ) {
                                    if (i % 2 == 0) {
                                        Image(
                                            painter = painterResource(id = R.drawable.hotel),
                                            contentDescription = null,
                                            modifier = Modifier
                                                .size(width = 100.dp, height = 100.dp)
                                        )
                                    } else {
                                        Image(
                                            painter = painterResource(id = R.drawable.hotel3),
                                            contentDescription = null,
                                            modifier = Modifier
                                                .size(width = 100.dp, height = 100.dp)
                                        )
                                    }
                                    Column {
                                        Row {
                                            Text(
                                                text = "Ambrosia Hotel & Restaurant",
                                                color = Color.Black,
                                                fontWeight = FontWeight.Bold,
                                                fontSize = 12.sp
                                            )
                                        }
                                        Row(
                                            horizontalArrangement = Arrangement.SpaceBetween,
                                            verticalAlignment = Alignment.CenterVertically,
                                        ) {
                                            Row(
                                                Modifier
                                                    .padding(top = 12.dp),
                                                horizontalArrangement = Arrangement.spacedBy(5.dp)
                                            ) {
                                                Icon(
                                                    Icons.Filled.LocationOn,
                                                    contentDescription = null,
                                                    tint = colorResource(id = R.color.secondary),
                                                    modifier = Modifier
                                                        .size(20.dp)
                                                )
                                                Text(
                                                    text = "kazi Deiry, Taiger Pass Chittagong",
                                                    color = colorResource(id = R.color.third),
                                                    fontSize = 16.sp
                                                )
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
    }
}