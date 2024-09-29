package com.adiwave.taskmaster.service;

import com.adiwave.taskmaster.entity.Task;
import com.adiwave.taskmaster.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public Optional<Task> getById(Long id) {
        return taskRepository.findById(id);
    }

}
