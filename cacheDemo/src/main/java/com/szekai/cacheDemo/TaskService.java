package com.szekai.cacheDemo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class TaskService {

    @Cacheable(value = "tasks", key = "'ALL'")
    public List<TaskDTO> findAll() {
        log.info("Retrieving tasks");
        return List.of(
                new TaskDTO(1L, "My first task", true),
                new TaskDTO(2L, "My second task", false));
    }

    @CacheEvict(value = "tasks", allEntries = true)
    public void clearCache() {
        // not need to do anything
    }
}
