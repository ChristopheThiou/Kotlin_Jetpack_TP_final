package com.example.projet_finance.navigation

import java.lang.IllegalArgumentException

enum class BudgetScreens {
    HomeScreen, // MovieScreens.HomeScreen => 0, MovieScreens.HomeScreen.name => "HomeScreen"
    DetailsScreen,
    SuiviScreen,
    BudgetScreen,
    EcoScreen;//
    companion object { // block statics
        fun fromRoute(route: String?): BudgetScreens
                = when(route?.substringBefore("/")){
            HomeScreen.name -> HomeScreen
            DetailsScreen.name -> DetailsScreen
            SuiviScreen.name -> SuiviScreen
            BudgetScreen.name -> BudgetScreen
            EcoScreen.name -> EcoScreen
            null -> HomeScreen
            else -> throw IllegalArgumentException("Route $route is not recognised")
        }
    }

}