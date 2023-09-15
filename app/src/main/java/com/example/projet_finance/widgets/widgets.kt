package com.example.projet_finance.widgets

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.projet_finance.model.Budget
import com.example.projet_finance.model.getBudget


@Composable
fun BudgetRow(budget: Budget = getBudget()[0], onItemClick: (String) -> Unit = {}) {


    Card(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()

            .clickable {
                onItemClick(budget.id)
            },
        shape = RoundedCornerShape(corner = CornerSize(12.dp)),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 6.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.padding(4.dp)) {
            Text(
                text = "Montant : ${budget.amount}",
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = budget.date,
                style = MaterialTheme.typography.labelMedium
            )
            Text(
                text = "Categorie : ${budget.category}",
                style = MaterialTheme.typography.labelMedium
            )
        }
    }
}

@Composable
fun BudgetScreenRow() {


    Card(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            .clickable {

            },
        shape = RoundedCornerShape(corner = CornerSize(12.dp)),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 6.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.padding(4.dp)) {
            Text(
                text = "Budget vacances : 5842.65 €",
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = "Bravo ! Vous avez économiser 200 € ce mois-ci !",
                style = MaterialTheme.typography.labelMedium
            )
            Text(
                text = "Prepare ton meilleur slip de bain !",
                style = MaterialTheme.typography.labelMedium
            )
        }
    }
    Card(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            .clickable {

            },
        shape = RoundedCornerShape(corner = CornerSize(12.dp)),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 6.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.padding(4.dp)) {
            Text(
                text = "Palier dépense",
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = "Vous avez dépenser 78.6 % de vos revenu ce mois-ci !",
                style = MaterialTheme.typography.labelMedium
            )
            Text(
                text = "C'est 14.2 % de plus que le mois dernier !",
                style = MaterialTheme.typography.labelMedium
            )
        }
    }
}

@Composable
fun SuiviScreenRow() {


    Card(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            .clickable {

            },
        shape = RoundedCornerShape(corner = CornerSize(12.dp)),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 6.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.padding(4.dp)) {
            Text(
                text = "Ajoutez un revenu/dépense",
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = "Afin d'avoir un suivi en temps réel",
                style = MaterialTheme.typography.labelMedium
            )
        }
    }
    Card(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            .clickable {

            },
        shape = RoundedCornerShape(corner = CornerSize(12.dp)),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 6.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.padding(4.dp)) {
            Text(
                text = "Définisez un budget",
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = "Pour recevoir une alert en cas de dépassement",
                style = MaterialTheme.typography.labelMedium
            )
        }
    }
    Card(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            .clickable {

            },
        shape = RoundedCornerShape(corner = CornerSize(12.dp)),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 6.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.padding(4.dp)) {
            Text(
                text = "Ajoutez vos revenus/dépenses régulier",
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = "Pour ne pas avoir à les ajouter à chaque fois",
                style = MaterialTheme.typography.labelMedium
            )
        }
    }
    Card(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            .clickable {

            },
        shape = RoundedCornerShape(corner = CornerSize(12.dp)),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 6.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.padding(4.dp)) {
            Text(
                text = "Définisez découvert",
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = "Pour recevoir une alert quand vous êtes bientot à découvert",
                style = MaterialTheme.typography.labelMedium
            )
        }
    }
    Card(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            .clickable {

            },
        shape = RoundedCornerShape(corner = CornerSize(12.dp)),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 6.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.padding(4.dp)) {
            Text(
                text = "Définisez un palier de dépenses",
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = "Pour recevoir une alert quand vous atteignez votre palier",
                style = MaterialTheme.typography.labelMedium
            )
            Text(
                text = "afin de faire des économies",
                style = MaterialTheme.typography.labelMedium
            )
        }
    }
}

@Composable
fun EcoScreenRow() {


    Card(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            .clickable {

            },
        shape = RoundedCornerShape(corner = CornerSize(12.dp)),
        elevation = CardDefaults.elevatedCardElevation(defaultElevation = 6.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.padding(4.dp)) {
            Text(
                text = "Balance revenu/dépense",
                style = MaterialTheme.typography.headlineSmall
            )
            Text(
                text = "Vous avez 35 500 € de revenu et 32 000 € de dépense",
                style = MaterialTheme.typography.labelMedium
            )
            Text(
                text = "Votre balance et donc de 3 500 € ce mois ci pour le moment",
                style = MaterialTheme.typography.labelMedium
            )
        }
    }
}


