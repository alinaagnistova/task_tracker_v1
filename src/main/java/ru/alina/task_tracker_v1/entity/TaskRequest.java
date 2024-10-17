package ru.alina.task_tracker_v1.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class TaskRequest {
    private Long id;
    private String title;
    private String description;
    private TaskType taskType;

}
