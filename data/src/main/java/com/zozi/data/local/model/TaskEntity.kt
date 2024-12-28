package com.zozi.data.local.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tasks")
data class TaskEntity(
    @PrimaryKey(autoGenerate = true)  val taskId: Int = 0,
     val taskTitle: String,
     val taskDescription: String,
     val isCompleted: Boolean
)
