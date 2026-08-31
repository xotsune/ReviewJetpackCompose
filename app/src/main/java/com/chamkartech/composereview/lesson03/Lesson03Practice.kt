package com.chamkartech.composereview.lesson03

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.key
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.chamkartech.composereview.common.Expense
import com.chamkartech.composereview.common.ExpenseRow
import com.chamkartech.composereview.common.loadExpenses

/*
 * LESSON 3 — PRACTICE
 *
 * 200 expenses in a Column, so scrolling stutters.
 *
 * Your job: convert to LazyColumn, add a key, and give the list
 * 16dp padding around the edges and 8dp between rows.
 * Every Expense already has an `id`.
 *
 * Check yourself: Logcat (tag LESSON03) prints about a dozen rows at
 * startup, not 200. Scrolling is smooth, and the last row scrolls
 * clear of the bottom edge.
 */
@Composable
fun ExpenseListPractice(expenses: List<Expense> = loadExpenses(200)) {
    // TODO 1: switch to LazyColumn
    LazyColumn(
        modifier = Modifier
            .fillMaxSize(),
            // TODO 3: this padding must go inside the scroll area
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)

    ) {
        // TODO 2: use items() and add a key
        items(expenses, key = { it.id }) { item ->
            ExpenseRow(item)
        }
    }
}
