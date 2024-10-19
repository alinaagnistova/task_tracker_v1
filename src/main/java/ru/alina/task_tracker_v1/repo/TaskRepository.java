package ru.alina.task_tracker_v1.repo;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.alina.task_tracker_v1.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
    @Modifying
    @Transactional
    @Query(value = "UPDATE task SET " +
            "title = COALESCE(:title, title), " +
            "description = COALESCE(:description, description), " +
            "task_type = COALESCE(:taskType, task_type) " +
            "WHERE id = :id", nativeQuery = true)
    int updateTask(@Param("id") Long id,
                   @Param("title") String title,
                   @Param("description") String description,
                   @Param("taskType") String taskType);
}
