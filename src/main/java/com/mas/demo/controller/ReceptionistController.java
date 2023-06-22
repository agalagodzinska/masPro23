package com.mas.demo.controller;

import com.mas.demo.model.PersonRepository;
import com.mas.demo.model.ReceptionistRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.RestController;

@RepositoryRestController
public class ReceptionistController {
    private final ReceptionistRepository repository;

    public ReceptionistController(ReceptionistRepository repository) {
        this.repository = repository;
    }
}
