package com.mas.demo.controller;
import com.mas.demo.model.Course;
import com.mas.demo.model.Trainer;
import com.mas.demo.model.TrainerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RepositoryRestController
public class TrainerController {
    private final TrainerRepository repository;

    public TrainerController(TrainerRepository repository) {
        this.repository = repository;
    }

    private static final Logger logger = LoggerFactory.getLogger(AddressController.class);

    @GetMapping("/trainers")
    public String showTrainers(Model model) {
        List<Trainer> trainers = repository.findAll();
        model.addAttribute("trainers", trainers);
        return "trainers";
    }
//    @GetMapping("/trainers/{trainerId}/courses")
//    public List<Course> getCoursesForTrainer(@PathVariable int trainerId) {
//        Trainer trainer = repository.findById(trainerId).orElse(null);
//        if (trainer == null) {
//            // Handle trainer not found
//        }
//        return repository.findCoursesByTrainer(trainer);
//    }


//    @GetMapping
//    public List<Trainer> getTrainers() {
//        return repository.findAll();
//    }
//
//    @GetMapping("/{id}")
//    public Trainer getTrainer(@PathVariable Integer id) {
//        return repository.findById(id).orElseThrow(RuntimeException::new);
//    }

    @PostMapping
    public ResponseEntity createTrainer(@RequestBody Trainer trainer) throws URISyntaxException {
        Trainer savedTrainer = repository.save(trainer);
        return ResponseEntity.created(new URI("/trainers/" + savedTrainer.getId())).body(savedTrainer);
    }

    @PutMapping("/{id}")
    public ResponseEntity updateTrainer(@PathVariable Long id, @RequestBody Trainer trainer) {
        Trainer currentTrainer = repository.findById(id).orElseThrow(RuntimeException::new);
        currentTrainer.setName(trainer.getName());
        currentTrainer.setSurname(trainer.getSurname());
        currentTrainer.setPESEL(trainer.getPESEL());
        currentTrainer = repository.save(trainer);

        return ResponseEntity.ok(currentTrainer);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteTrainer(@PathVariable Long id) {
        repository.deleteById(id);
        return ResponseEntity.ok().build();
    }



}
