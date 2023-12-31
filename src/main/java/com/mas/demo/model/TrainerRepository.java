package com.mas.demo.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@RepositoryRestResource
public interface TrainerRepository extends JpaRepository<Trainer, Long> {
//    List<Course> findCoursesByTrainer(Trainer trainer);
}
