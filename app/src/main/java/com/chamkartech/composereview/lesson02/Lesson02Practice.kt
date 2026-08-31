package com.chamkartech.composereview.lesson02

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

/*
 * LESSON 2 — PRACTICE
 *
 * Build a list row: label on the left, price pinned to the right edge,
 * on a rounded light-blue background that INCLUDES the padding.
 *
 * Two things are wrong and one is missing. Fix all three.
 *
 * Check yourself: the blue touches both screen edges, has space inside it,
 * and the price sits hard against the right.
 */
@Composable
fun ExpenseRowPractice() {
    // PROBLEM 1: this stacks vertically, you need horizontal
    Row(
        modifier = Modifier
            // PROBLEM 2: the background does not cover the padding
            .background(Color(0xFFE8ECFF))
            .padding(16.dp)
            .fillMaxWidth()
    ) {
        Text("Iced coffee")

        // TODO: push the price to the right edge
        Spacer(Modifier.weight(1f))

        Text("6,000 R")
    }
}

/*
 * Extra, if you finish early — from the handout's Practice 1:
 * a Row with "Left" at the far left, "Right" at the far right,
 * and "Middle" exactly in the centre. No pixel maths allowed.
 */
@Composable
fun ThreeAcrossPractice() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text("Left")
        Spacer(Modifier.weight(1f))
        Text("Middle")
        Spacer(Modifier.weight(1f))
        Text("Right")
    }
}
