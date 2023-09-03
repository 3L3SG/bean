package com.reactor.web.service;

import com.reactor.web.dao.EmployeeRepository;
import com.reactor.web.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Component
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;

    public Flux<Employee> getAllEmployees() {
        return repository.findAll().delayElements(Duration.ofSeconds(3));
    }

    public void createEmployees(Mono<Employee> employee) {
        repository.save(employee.block()).subscribe();
    }
}

