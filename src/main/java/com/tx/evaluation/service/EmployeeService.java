package com.tx.evaluation.service;

import com.tx.evaluation.dto.Employee;

public interface EmployeeService
{
    Employee getEmployeeById(Long id);

    void saveEmployee(Employee employee);
}
