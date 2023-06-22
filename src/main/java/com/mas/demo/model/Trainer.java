package com.mas.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="isOwner", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("no")
public class Trainer extends Person {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    @NotBlank
    private int salary;

    @ManyToMany(mappedBy = "trainers")
    private Set<Facility> facilities = new HashSet<>();

    @OneToMany(mappedBy = "trainer")
    private Set<Course> courses;

    public Trainer() {
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Set<Facility> getFacilities() {
        return facilities;
    }

    public void setFacilities(Set<Facility> facilities) {
        this.facilities = facilities;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}
