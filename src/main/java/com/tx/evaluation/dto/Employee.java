package com.tx.evaluation.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee
{
    private long id;

    private String name;

    private int age;

    private String gender;

    private String dob;
}
