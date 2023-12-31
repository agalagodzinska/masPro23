package com.mas.demo.controller;

import com.mas.demo.model.*;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RepositoryRestController
public class CourseController {
    private final CourseRepository repository;
    private final TrainerRepository trainerRepository;

    public CourseController(CourseRepository repository, TrainerRepository trainerRepository) {
        this.repository = repository;
        this.trainerRepository = trainerRepository;
    }

    @GetMapping("/courses")
    public String showCourses(Model model) {
        List<Course> courses = repository.findAll();
        List<Trainer> trainers = trainerRepository.findAll();
        model.addAttribute("courses", courses);
        model.addAttribute("trainers", trainers);
        return "courses";
    }

    @GetMapping("/courses/{courseId}/trainer")
    public ResponseEntity<String> getAssignedTrainer(@PathVariable Long courseId) {
        Course course = repository.findById(courseId).orElse(null);
        if (course != null) {
            Trainer assignedTrainer = course.getTrainer();
            if (assignedTrainer != null) {
                // You can format the course details as desired
                String trainerDetails = "Current trainer: " + assignedTrainer.getName() + " " + assignedTrainer.getSurname();
                return ResponseEntity.ok(trainerDetails);
            }
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/courses/{courseId}/trainer/{trainerId}")
    public ResponseEntity<Void> updateAssignedTrainer(@PathVariable Long courseId, @PathVariable Long trainerId) {
        Course course = repository.findById(courseId).orElse(null);
        Trainer trainer = trainerRepository.findById(trainerId).orElse(null);
        if (course != null && trainer != null) {
            course.setTrainer(trainer);

// musimy do setu courses w entity Trainer dodac ten course

            trainer.getCourses().add(course);
            trainerRepository.save(trainer);
            repository.save(course);

            return ResponseEntity.ok().build();
        }

        return ResponseEntity.notFound().build();
    }
}
