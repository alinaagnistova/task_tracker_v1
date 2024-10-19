package ru.alina.task_tracker_v1.entity.requests;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.alina.task_tracker_v1.entity.utils.Role;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegRequest {
    private String name;
    private String email;
    private String password;
    private Role role;
}
