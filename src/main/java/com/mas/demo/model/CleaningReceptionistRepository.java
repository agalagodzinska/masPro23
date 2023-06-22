package com.mas.demo.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CleaningReceptionistRepository extends JpaRepository<CleaningReceptionist, Integer> {
}
