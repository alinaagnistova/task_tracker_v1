package ru.alina.task_tracker_v1.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.alina.task_tracker_v1.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
