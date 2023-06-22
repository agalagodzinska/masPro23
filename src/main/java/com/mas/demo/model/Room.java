package com.mas.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    int number;
    @NotBlank
    int placesForTrainees;
    @ManyToOne
    @JoinColumn(name="facility_id", nullable=false)
    private Facility facility;

    public Room() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPlacesForTrainees() {
        return placesForTrainees;
    }

    public void setPlacesForTrainees(int placesForTrainees) {
        this.placesForTrainees = placesForTrainees;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }
}
