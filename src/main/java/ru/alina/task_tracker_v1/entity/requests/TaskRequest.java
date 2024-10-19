package ru.alina.task_tracker_v1.entity.requests;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import ru.alina.task_tracker_v1.entity.utils.TaskType;

@Getter
@Setter
@Builder
public class TaskRequest {
    private Long id;
    private String title;
    private String description;
    private TaskType taskType;

}
