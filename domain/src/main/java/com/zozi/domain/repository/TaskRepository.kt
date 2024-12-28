package com.zozi.domain.repository

import com.zozi.domain.model.Task

interface TaskRepository {
    suspend fun getTasks(): List<Task>
    suspend fun addTask(task: Task)
    suspend fun updateTask(task: Task)
    suspend fun deleteTask(task: Task)
}