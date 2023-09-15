package com.example.projet_finance.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.projet_finance.screens.budget.BudgetScreen
import com.example.projet_finance.screens.details.DetailsScreen
import com.example.projet_finance.screens.eco.EcoScreen
import com.example.projet_finance.screens.home.HomeScreen
import com.example.projet_finance.screens.suivi.SuiviScreen

@Composable
fun BudgetNavigation(){
    val navController = rememberNavController()
    // Pile (Retour) de composables qui composent les écrans de votre application ainsi que l'état de chaque ecran
    NavHost(navController = navController, startDestination = BudgetScreens.HomeScreen.name /* "HomeScreen" */){
        composable(BudgetScreens.HomeScreen.name){ // "HomeScreen"
            HomeScreen(
                navController = navController
            )
        }

        composable(
            BudgetScreens.DetailsScreen.name+"/{budget}",
            arguments = listOf(navArgument(name = "budget"){type = NavType.StringType})
        ){
                backStackEntry ->
            DetailsScreen(navController = navController, backStackEntry.arguments?.getString("budget"))
        }
        composable(BudgetScreens.BudgetScreen.name){ // "BudgetScreen"
            BudgetScreen(
                navController = navController
            )
        }
        composable(BudgetScreens.EcoScreen.name){ // "EcoScreen"
            EcoScreen(
                navController = navController
            )
        }
        composable(BudgetScreens.SuiviScreen.name){ // "SuiviScreen"
            SuiviScreen(
                navController = navController
            )
        }
    }
}