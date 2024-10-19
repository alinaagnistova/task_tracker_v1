package ru.alina.task_tracker_v1.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.alina.task_tracker_v1.entity.User;
import ru.alina.task_tracker_v1.repo.UserRepository;

import java.security.Principal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

}
