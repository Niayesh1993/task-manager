package com.zozi.data.local.model.mapper

import com.zozi.data.local.model.TaskEntity
import com.zozi.domain.model.Task

fun TaskEntity.toDomain() =
    Task(id = taskId, title = taskTitle, description = taskDescription, isCompleted = isCompleted)

fun Task.toTaskEntity() = TaskEntity(
    taskId = id, taskTitle = title, taskDescription = description, isCompleted = isCompleted
)