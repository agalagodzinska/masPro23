package com.mas.demo.controller;

import com.mas.demo.model.OwnerRepository;
import com.mas.demo.model.RoomRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.RestController;

@RepositoryRestController
public class OwnerController {
    private final OwnerRepository repository;

    public OwnerController(OwnerRepository repository) {
        this.repository = repository;
    }
}
