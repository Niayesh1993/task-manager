package com.zozi.domain.usecase

import com.zozi.domain.model.Task
import com.zozi.domain.repository.TaskRepository

class DeleteTaskUseCase(private val taskRepository: TaskRepository) {

    suspend operator fun invoke(task: Task) = taskRepository.deleteTask(task)
}