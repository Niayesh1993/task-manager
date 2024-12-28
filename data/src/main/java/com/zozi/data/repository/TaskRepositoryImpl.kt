package com.zozi.data.repository

import com.zozi.data.local.database.TaskDao
import com.zozi.data.local.model.mapper.toDomain
import com.zozi.data.local.model.mapper.toTaskEntity
import com.zozi.domain.model.Task
import com.zozi.domain.repository.TaskRepository

class TaskRepositoryImpl(private val taskDao: TaskDao): TaskRepository {

    override suspend fun getTasks(): List<Task> {
        return taskDao.getAllTasks().map { it.toDomain() }
    }

    override suspend fun addTask(task: Task) {
        return taskDao.insertTask(task.toTaskEntity())
    }

    override suspend fun updateTask(task: Task) {
        return taskDao.updateTask(task.toTaskEntity())
    }

    override suspend fun deleteTask(task: Task) {
        return taskDao.deleteTask(task.toTaskEntity())
    }
}