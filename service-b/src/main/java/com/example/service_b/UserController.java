package com.example.service_b;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody SecurityProperties.User user) {
        return ResponseEntity.ok("Пользователь успешно зарегистрирован");
    }
}
