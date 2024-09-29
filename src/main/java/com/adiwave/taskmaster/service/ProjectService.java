package com.adiwave.taskmaster.service;

import com.adiwave.taskmaster.entity.Project;
import com.adiwave.taskmaster.repository.ProjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public Optional<Project> getProjectById(long projectId) {
        return projectRepository.findById(projectId);
    }
}
