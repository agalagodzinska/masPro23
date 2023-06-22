package com.mas.demo.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    @NotNull
    private double price;
    @NotNull
    private int totalSpots;
    @NotNull
    private int spotsAvailable;
    @NotNull
    private int totalHourCount;
    @NotNull
    private LocalDateTime dateTime;
    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "Course_Trainee",
            joinColumns = {@JoinColumn(name = "course_id")},
            inverseJoinColumns = {@JoinColumn(name = "trainee_id")}
    )
    Set<Trainee> trainees = new HashSet<>();
    @ManyToOne
    @JoinColumn(name = "trainer_id", nullable = false)
    private Trainer trainer;


    public Course() {
    }

//    public Course( double price, int totalSpots, int spotsAvailable,int totalHourCount, LocalDateTime dateTime, Trainer trainer) {
//       this.price = price;
//        this.totalSpots = totalSpots;
//        this.spotsAvailable = spotsAvailable;
//        this.totalHourCount=totalHourCount;
//        this.dateTime=dateTime;
//        this.trainer = trainer;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getTotalSpots() {
        return totalSpots;
    }

    public void setTotalSpots(int totalSpots) {
        this.totalSpots = totalSpots;
    }

    public int getSpotsAvailable() {
        return spotsAvailable;
    }

    public void setSpotsAvailable(int spotsAvailable) {
        this.spotsAvailable = spotsAvailable;
    }

    public int getTotalHourCount() {
        return totalHourCount;
    }

    public void setTotalHourCount(int totalHourCount) {
        this.totalHourCount = totalHourCount;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Set<Trainee> getTrainees() {
        return trainees;
    }

    public void setTrainees(Set<Trainee> trainees) {
        this.trainees = trainees;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }
}
