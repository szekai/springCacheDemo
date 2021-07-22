package com.szekai.cacheDemo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@RequiredArgsConstructor
public class TaskDTO {
    private final long id;
    private final String task;
    private final boolean completed;
}
