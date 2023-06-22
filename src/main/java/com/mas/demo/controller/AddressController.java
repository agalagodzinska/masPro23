package com.mas.demo.controller;

import com.mas.demo.model.Address;
import com.mas.demo.model.AddressRepository;
import org.slf4j.Logger;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Pageable;

import javax.validation.Valid;
import java.util.List;

@RestController
public class AddressController {
    private final AddressRepository repository;

    AddressController(final AddressRepository repository) {
        this.repository = repository;
    }


}
