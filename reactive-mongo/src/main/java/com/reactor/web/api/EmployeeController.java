package com.reactor.web.api;

import com.reactor.web.model.Employee;
import com.reactor.web.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController("/rest")
public class EmployeeController {

    @Autowired
    EmployeeService service;


    @GetMapping(value = "/emp")
    public Flux<Employee> getEmployeeDetails() {
        return service.getAllEmployees();
    }


    @PostMapping(value = "/emp")
    public Mono<String> getEmployeeDetails(@RequestBody Mono<Employee> employee) {
        service.createEmployees(employee);
        return Mono.just("Created");
    }
}
