package com.mas.demo.model;

import org.springframework.data.repository.cdi.Eager;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Trainee extends Person{
    private int totalHoursTraining;
    private static int totalNumberOfTrainees;

    @ManyToMany(mappedBy = "trainees")
    private Set<Course> courses = new HashSet<>();

    public Trainee() {
    }

    public int getTotalHoursTraining() {
        return totalHoursTraining;
    }

    public void setTotalHoursTraining(int totalHoursTraining) {
        this.totalHoursTraining = totalHoursTraining;
    }

    public static int getTotalNumberOfTrainees() {
        return totalNumberOfTrainees;
    }

    public static void setTotalNumberOfTrainees(int totalNumberOfTrainees) {
        Trainee.totalNumberOfTrainees = totalNumberOfTrainees;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}
