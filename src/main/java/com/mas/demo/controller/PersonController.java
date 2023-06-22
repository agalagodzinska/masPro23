package com.mas.demo.controller;

import com.mas.demo.model.FacilityRepository;
import com.mas.demo.model.PersonRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.RestController;

@RepositoryRestController
public class PersonController {
    private final PersonRepository repository;

    public PersonController(PersonRepository repository) {
        this.repository = repository;
    }
}
