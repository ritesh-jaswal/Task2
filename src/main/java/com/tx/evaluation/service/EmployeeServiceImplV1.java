package com.tx.evaluation.service;

import com.tx.evaluation.dto.Employee;
import com.tx.evaluation.entity.EmployeeEntity;
import com.tx.evaluation.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
@ConditionalOnProperty(name = "employee-service.version", havingValue = "v1")
public class EmployeeServiceImplV1 implements EmployeeService{

    @Autowired
    EmployeeRepository employeeRepository;

    public Employee getEmployeeById(Long id)
    {
        log.info("************* EmployeeServiceImplV1 Called*************");
        Optional<EmployeeEntity> employeeEntityOpt = employeeRepository.findById(id);



        if(employeeEntityOpt.isPresent()){
            EmployeeEntity employeeEntity = employeeEntityOpt.get();
            return Employee.builder()
                    .id(employeeEntity.getId())
                    .name(employeeEntity.getName())
                    .age(employeeEntity.getAge())
                    .dob(employeeEntity.getDob())
                    .gender(employeeEntity.getGender())
                    .build();
        } else {
            return null;
        }


    }

    @Override
    public void saveEmployee(Employee employee) {
       EmployeeEntity employeeEntity = EmployeeEntity.builder()
               .name(employee.getName())
               .age(employee.getAge())
               .dob(employee.getDob())
               .gender(employee.getGender())
               .build();
       employeeRepository.save(employeeEntity);
    }
}
