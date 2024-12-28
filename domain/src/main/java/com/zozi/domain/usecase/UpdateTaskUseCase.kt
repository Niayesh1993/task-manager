package com.zozi.domain.usecase

import com.zozi.domain.model.Task
import com.zozi.domain.repository.TaskRepository

class UpdateTaskUseCase(private val taskRepository: TaskRepository) {

    suspend operator fun invoke(task: Task) = taskRepository.updateTask(task)
}