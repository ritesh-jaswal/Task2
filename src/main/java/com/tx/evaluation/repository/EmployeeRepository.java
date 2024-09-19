package com.tx.evaluation.repository;

import com.tx.evaluation.entity.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<EmployeeEntity,Long> {

}
