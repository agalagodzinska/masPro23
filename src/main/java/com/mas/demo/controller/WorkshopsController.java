package com.mas.demo.controller;

import com.mas.demo.model.WorkshopsRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.RestController;

@RepositoryRestController
public class WorkshopsController {
    private final WorkshopsRepository repository;

    public WorkshopsController(WorkshopsRepository repository) {
        this.repository = repository;
    }
}
