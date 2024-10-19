package ru.alina.task_tracker_v1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ru.alina.task_tracker_v1.entity.requests.RegRequest;
import ru.alina.task_tracker_v1.service.AuthService;

import static ru.alina.task_tracker_v1.entity.utils.Role.*;

@SpringBootApplication
public class TaskTrackerV1Application {

    public static void main(String[] args) {
        SpringApplication.run(TaskTrackerV1Application.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(
            AuthService service
    ) {
        return args -> {
            var admin = RegRequest.builder()
                    .name("Admin")
                    .email("admin@mail.com")
                    .password("password")
                    .role(ADMIN)
                    .build();
            System.out.println("Admin token: " + service.register(admin).getToken());

            var manager = RegRequest.builder()
                    .name("Manager")
                    .email("manager@mail.com")
                    .password("password")
                    .role(MANAGER)
                    .build();
            System.out.println("Manager token: " + service.register(manager).getToken());
            var user = RegRequest.builder()
                    .name("User")
                    .email("user@mail.com")
                    .password("password")
                    .role(USER)
                    .build();
            System.out.println("User token: " + service.register(user).getToken());

        };
    }
}
