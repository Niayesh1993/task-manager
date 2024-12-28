package com.zozi.domain.model

data class Task(
    val id: Int,
    val title: String,
    val description: String,
    val isCompleted: Boolean
)
