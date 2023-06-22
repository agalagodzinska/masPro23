package com.mas.demo.controller;

import com.mas.demo.model.Course;
import com.mas.demo.model.FacilityRepository;
import com.mas.demo.model.Room;
import com.mas.demo.model.RoomRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RepositoryRestController
public class RoomController {

    private final RoomRepository repository;

    public RoomController(RoomRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/rooms")
    public String showRooms(Model model) {
        List<Room> rooms = repository.findAll(); // Retrieve all trainers from the repository
        model.addAttribute("rooms", rooms); // Add the trainers list to the model
        return "rooms"; // Return the name of the Thymeleaf template (trainers.html)
    }
}


