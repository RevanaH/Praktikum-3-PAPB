package com.example.praktikum3

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

data class todoList(
    val text: String,
    val checkBox: MutableState<Boolean> = mutableStateOf(false)
)