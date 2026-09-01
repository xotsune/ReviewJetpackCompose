package com.chamkartech.composereview.lesson04

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.chamkartech.composereview.common.Expense
import com.chamkartech.composereview.common.ExpenseRow
import com.chamkartech.composereview.common.loadExpenses

/*
 * LESSON 4 — PRACTICE
 *
 * Wrap this list in a Scaffold with a top bar titled "Expenses"
 * and a FAB with a plus icon, and make sure no row is hidden by either.
 *
 * You will need:
 *   @OptIn(ExperimentalMaterial3Api::class)   above the function
 *   imports from androidx.compose.material3   (NOT material)
 *
 * Check yourself: scroll to the top, the first row sits below the bar.
 * Scroll to the bottom, the last row clears the FAB.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExpenseScreenPractice(expenses: List<Expense> = loadExpenses(50)) {

    // TODO 1: wrap everything in a Scaffold
    // TODO 2: add a topBar titled "Expenses"
    // TODO 3: add a floatingActionButton using Icons.Default.Add
    // TODO 4: use innerPadding so nothing is hidden
    Scaffold(
        topBar = { TopAppBar(title = { Text("Expenses") }) },
        floatingActionButton = {
            FloatingActionButton(onClick = { }) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentPadding = PaddingValues(
                start = 16.dp, end = 16.dp,
                top = 16.dp, bottom = 88.dp
            ),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(expenses, key = { it.id }) { item ->
                ExpenseRow(item)
            }
        }
    }
}

