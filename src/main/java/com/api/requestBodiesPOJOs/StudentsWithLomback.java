package com.api.requestBodiesPOJOs;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder(setterPrefix = "set")
public class StudentsWithLomback {
    private int id;
    private String name;
    private boolean isPassed;
    private List<Long> CGPA;
}
