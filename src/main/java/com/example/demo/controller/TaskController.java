package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.PostTaskDTO;
import com.example.demo.dto.SuccessPostTask;
import com.example.demo.service.TaskService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TaskController {
    private final TaskService taskService;

    @PostMapping("/save-task")
    public Object saveTask(@RequestBody PostTaskDTO request) throws InterruptedException {
        taskService.saveTask(request);
        return SuccessPostTask.builder()
                .code(200)
                .message("Save Task Sucessfully Process On Background")
                .build();
    }
}
