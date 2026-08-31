package com.chamkartech.composereview.lesson01

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/*
 * LESSON 1 — PRACTICE
 *
 * Practice 1: make the text switch between "On" and "Off" on every click.
 * Fill in the three TODOs. Do not rewrite the file.
 *
 * Check yourself: click three times, you should see On -> Off -> On.
 */
@Composable
fun TogglePractice() {
    // TODO 1: declare the state here
    var isOn by remember { mutableStateOf(false) }

    Column(modifier = Modifier.padding(24.dp)) {

        // TODO 2: make this text depend on the state
        Text(text = if (isOn) "On" else "Off")
        Text(if (isOn) "🟢 Running" else "🔴 Stopped")
        Button(onClick = {
            // TODO 3: change the state here
            isOn = !isOn
        }) {
            Text("Toggle")
        }
    }
}

/*
 * Practice 3: this compiles and runs. Clicking does nothing visible.
 * Find the bug BY READING before you run it.
 *
 * Answer these in order and the bug will find itself:
 *   1. Where does the state live?
 *   2. What does the Text actually read?
 *   3. What does the button do to the state?
 */
@Composable
fun BrokenToggle() {
    var isOn by remember { mutableStateOf(false) }

    Column(modifier = Modifier.padding(24.dp)) {
        Text(text = if (isOn) "On" else "Off")

        Button(onClick = { isOn = !isOn }) {
            Text("Toggle")
        }
    }
}
