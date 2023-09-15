package com.example.projet_finance.screens.suivi

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.projet_finance.widgets.SuiviScreenRow

@OptIn(ExperimentalMaterial3Api::class)


@Composable
fun SuiviScreen(navController: NavController = NavController(LocalContext.current)){



    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(text = "Suivi") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White,
                    actionIconContentColor = Color.White
                ),
                navigationIcon = { IconButton(onClick = {
                    navController.popBackStack()
                }) {
                    Icon(imageVector = Icons.Filled.ArrowBack, contentDescription = "Menu") } },
            )
        }
    ) { paddingValues ->
        Surface(modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues)) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top
            ) {
                SuiviScreenRow()
                Spacer(modifier = Modifier.height(8.dp))
                LazyRow{
                }
            }
        }
    }
}