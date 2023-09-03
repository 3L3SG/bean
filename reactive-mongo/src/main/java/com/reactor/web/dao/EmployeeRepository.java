package com.reactor.web.dao;

import com.reactor.web.model.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;


public interface EmployeeRepository extends ReactiveMongoRepository<Employee, Integer> {

}
