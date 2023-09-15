package com.example.projet_finance

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.projet_finance.navigation.BudgetNavigation
import com.example.projet_finance.ui.theme.Projet_financeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
                BudgetNavigation()
        }
    }
}


@Composable
fun MyApp(content: @Composable () -> Unit){ // Unit = void
    Projet_financeTheme{
        content()
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApp {
        BudgetNavigation()
    }
}












