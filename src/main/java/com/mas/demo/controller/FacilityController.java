package com.mas.demo.controller;

import com.mas.demo.model.FacilityRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public class FacilityController {
    private final FacilityRepository repository;

    public FacilityController(FacilityRepository repository) {
        this.repository = repository;
    }
}
