package ru.alina.task_tracker_v1.contoller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.alina.task_tracker_v1.entity.AuthRequest;
import ru.alina.task_tracker_v1.entity.AuthResponse;
import ru.alina.task_tracker_v1.entity.RegRequest;
import ru.alina.task_tracker_v1.service.AuthService;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;
    @PostMapping("/sign-up")
    public ResponseEntity<AuthResponse> signUp(@RequestBody RegRequest regRequest) {
        return ResponseEntity.ok(authService.register(regRequest));
    }

    @PostMapping("/sign-in")
    public ResponseEntity<AuthResponse> signIn(@RequestBody AuthRequest authRequest) {
        return ResponseEntity.ok(authService.authenticate(authRequest));
    }
}
