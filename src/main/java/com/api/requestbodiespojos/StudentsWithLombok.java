package com.api.requestbodiespojos;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder(setterPrefix = "set")
public class StudentsWithLombok {
    private int id;
    private String name;
    private boolean isPassed;
    private List<? extends Object> CGPA;

}
