package com.example.service_a;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    @GetMapping
    public ResponseEntity<List<Task>> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Task 1", "Description for Task 1"));
        tasks.add(new Task("Task 2", "Description for Task 2"));
        return ResponseEntity.ok(tasks);
    }
}
