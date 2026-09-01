package com.chamkartech.composereview.lesson05

import android.R
import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/*
 * LESSON 5 — PRACTICE
 *
 * Fix this counter in TWO SEPARATE STEPS. Run it after each one.
 * Do not skip the middle step — it is the point of the lesson.
 *
 *   STEP 1: add mutableStateOf only  ->  var count by mutableStateOf(0)
 *           Run it. WRITE DOWN what happens.
 *   STEP 2: now wrap it in remember. Run it again.
 *   STEP 3: add a second Text that does NOT read count, put a Log line
 *           next to each Text, and see which one re-runs.
 *
 * Then answer on paper: why does step 1 still not work?
 * That written answer is what your teacher is actually marking.
 */
@Composable
fun CounterPractice() {
    var count by remember { mutableStateOf(0) }

    Column(modifier = Modifier.padding(24.dp)) {
        Text("Clicked $count times")

        Button(onClick = { count++ }) {
            Text("Click")
        }

        // STEP 3 goes here
        Text("Clicked $count times")
        Log.d("LESSON05", "reader re-ran")

        Text("Hello")
        Log.d("LESSON05", "non-reader re-ran")
    }
}
