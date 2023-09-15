package com.example.projet_finance.model


data class Budget(
    val id: String,
    val amount: String,
    val date : String,
    val category: String,
)

fun getBudget(): List<Budget> {
    return listOf(
        Budget("1", "-45.99", "12/12/2021", "Alimentation"),
        Budget("2", "-14.99", "12/12/2021", "Netflix"),
        Budget("3", "+25684.00", "12/12/2021", "Salaire"),
        Budget("4", "+3762.00", "12/12/2021", "Rente"),
        Budget("5", "-1635.00", "12/12/2021", "Voyage"),
        Budget("6", "-1200.00", "12/12/2021", "Loyer"),
        Budget("7", "-15.64", "12/12/2021", "Uber eat"),
        Budget("8", "+250.69", "12/12/2021", "Remboursement"),
        Budget("9", "-9536.00", "12/12/2021", "Location"),
        Budget("10", "-45.99", "12/12/2021", "Alimentation"),
        Budget("11", "-14.99", "12/12/2021", "Netflix"),
        Budget("12", "+25684.00", "12/12/2021", "Salaire"),
        Budget("13", "+3762.00", "12/12/2021", "Rente"),
    )
}
