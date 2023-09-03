package com.reactor.web.api;

import com.reactor.web.dao.EmployeeRepository;
import com.reactor.web.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import java.time.Duration;

@Configuration
public class EmployeeWebController {

    @Autowired
    EmployeeRepository repository;

    @Bean
    public RouterFunction<ServerResponse> getDetails() {
        return RouterFunctions.route().GET("/empd", request -> ServerResponse.ok()
                .contentType(MediaType.TEXT_EVENT_STREAM)
                .body(repository.findAll().delayElements(Duration.ofSeconds(2)), Employee.class)).build();
    }

}
