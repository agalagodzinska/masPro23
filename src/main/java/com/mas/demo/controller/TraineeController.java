package com.mas.demo.controller;

import com.mas.demo.model.FacilityRepository;
import com.mas.demo.model.TraineeRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.RestController;

@RepositoryRestController
public class TraineeController {
    private final TraineeRepository repository;

    public TraineeController(TraineeRepository repository) {
        this.repository = repository;
    }
}
