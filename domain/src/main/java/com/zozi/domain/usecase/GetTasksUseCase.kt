package com.zozi.domain.usecase

import com.zozi.domain.model.Task
import com.zozi.domain.repository.TaskRepository

class GetTasksUseCase(private val taskRepository: TaskRepository) {

    suspend operator fun invoke():List<Task> = taskRepository.getTasks()
}