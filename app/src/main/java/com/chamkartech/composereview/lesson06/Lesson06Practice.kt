package com.chamkartech.composereview.lesson06

import android.os.Parcelable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.parcelize.Parcelize

/*
 * LESSON 6 — PRACTICE
 *
 * FIRST: turn on auto-rotate in your emulator, or you cannot test anything.
 * Settings > Display > Auto-rotate screen.
 *
 * A small signup form. Rotate and all three fields reset.
 * Your job: make all three survive rotation, then rotate to verify.
 *
 * Check yourself: fill in all three, rotate, and check ALL THREE.
 * It is easy to fix two and miss one.
 */
@Composable
fun SignUpFormPractice() {
    // TODO: all three of these are lost on rotation
    var name by rememberSaveable { mutableStateOf("") }
    var email by rememberSaveable { mutableStateOf("") }
    var agreed by rememberSaveable { mutableStateOf(false) }

    Column(modifier = Modifier.padding(24.dp)) {
        OutlinedTextField(
            value = name,
            onValueChange = { name = it },
            label = { Text("Name") }
        )
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") }
        )
        Row {
            Checkbox(checked = agreed, onCheckedChange = { agreed = it })
            Text("I agree to the terms")
        }
    }

    /*
     * EXTRA, if you finish early:
     * add this line and rotate. It crashes. Read the error BEFORE fixing it,
     * then work out why and fix it.
     *
     *     data class Plan(val name: String, val price: Int)
     *     var plan by rememberSaveable { mutableStateOf(Plan("Free", 0)) }
     *
     * The kotlin-parcelize plugin is already enabled in this project.
     */
}
@Parcelize
data class Plan(val name: String, val price: Int) : Parcelable
