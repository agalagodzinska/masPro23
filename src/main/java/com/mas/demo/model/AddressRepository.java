package com.mas.demo.model;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface AddressRepository {
    List<Address> findAll();
    Optional<Address> findById(Integer i);
    Address save(Address entity);
    Page<Address> findAll(Pageable page);
    boolean existsById(Integer id);
}
