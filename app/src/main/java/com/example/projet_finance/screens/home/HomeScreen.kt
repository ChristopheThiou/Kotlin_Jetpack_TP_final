package com.example.projet_finance.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.projet_finance.model.Budget
import com.example.projet_finance.model.getBudget
import com.example.projet_finance.navigation.BudgetScreens
import com.example.projet_finance.widgets.BudgetRow
import kotlinx.coroutines.launch




@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                Text("Pages", modifier = Modifier.padding(16.dp))
                Divider()
                NavigationDrawerItem(
                    label = { Text(text = "Home screen") },
                    selected = false,
                    onClick = { navController.navigate(route = BudgetScreens.HomeScreen.name) }
                )
                NavigationDrawerItem(
                    label = { Text(text = "Suivi screen") },
                    selected = false,
                    onClick = { navController.navigate(route = BudgetScreens.SuiviScreen.name) }
                )
                NavigationDrawerItem(
                    label = { Text(text = "Budget screen") },
                    selected = false,
                    onClick = { navController.navigate(route = BudgetScreens.BudgetScreen.name) }
                )
                NavigationDrawerItem(
                    label = { Text(text = "Economy screen") },
                    selected = false,
                    onClick = { navController.navigate(route = BudgetScreens.EcoScreen.name) }
                )
                // ...other drawer items
            }
        },
    ) {
        Scaffold(
            floatingActionButton = {
                ExtendedFloatingActionButton(
                    text = { Text("Pages list") },
                    icon = { },
                    onClick = {
                        scope.launch {
                            drawerState.apply {
                                if (isClosed) open() else close()
                            }
                        }
                    }
                )
            }
        ) { contentPadding ->
            Column(
                modifier = Modifier.fillMaxSize().padding(contentPadding),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                MainContent(navController = navController, budgetList = getBudget())
            }
        }
    }
}

@Composable
fun MainContent(
    navController: NavController,
    budgetList: List<Budget> = getBudget()
) {
    Column(modifier = Modifier.padding(12.dp)) {
        LazyColumn {
            items(items = budgetList) {
                BudgetRow(budget = it) { budget ->
                    navController.navigate(route = BudgetScreens.DetailsScreen.name + "/$budget")
                }
            }
        }
    }
}

