package com.mas.demo.controller;

import com.mas.demo.model.CleaningReceptionistRepository;
import com.mas.demo.model.PersonRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.RestController;

@RepositoryRestController
public class CleaningReceptionistController {
    private final CleaningReceptionistRepository repository;

    public CleaningReceptionistController(CleaningReceptionistRepository repository) {
        this.repository = repository;
    }
}
