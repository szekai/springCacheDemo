package com.szekai.hazelcastDemo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

@Getter
@ToString
@RequiredArgsConstructor
public class TaskDTO implements Serializable {
    private final long id;
    private final String task;
    private final boolean completed;
}
