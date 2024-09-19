package com.tx.evaluation.endpoint;

import com.tx.evaluation.dto.Employee;
import com.tx.evaluation.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeWriteController
{
    @Autowired
    EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<Void> saveEmployee(@RequestBody Employee employee )
    {
        employeeService.saveEmployee(employee);
       return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
