package com.example.demo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.example.demo.dto.PostTaskDTO;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class TaskService {

    @Async
    public void saveTask(PostTaskDTO request) throws InterruptedException {
        log.info("Start Process Save Task...");

        try {
            for (int i = 0; i < request.getTask().size(); i++) {
                Thread.sleep(60000);
            }
        } catch (Exception ex) {
            log.info(ex.getMessage());
            throw ex;
        }

        log.info("End Process Save Task...");
    }
}
