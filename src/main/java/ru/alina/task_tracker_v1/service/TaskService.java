package ru.alina.task_tracker_v1.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.alina.task_tracker_v1.entity.Task;
import ru.alina.task_tracker_v1.entity.TaskRequest;
import ru.alina.task_tracker_v1.repo.TaskRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;

    public void add(TaskRequest taskRequest) {
        var task = Task.builder()
                .id(taskRequest.getId())
                .title(taskRequest.getTitle())
                .description(taskRequest.getDescription())
                .taskType(taskRequest.getTaskType())
                .build();
        taskRepository.save(task);
    }

    public List<Task> findAll() {
        return taskRepository.findAll();
    }
    public Task findById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }
    public void delete(Long id) {
        taskRepository.deleteById(id);
    }
}
