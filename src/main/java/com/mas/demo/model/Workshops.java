package com.mas.demo.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.EnumSet;

@Entity
@Table(name = "workshops")
public class Workshops {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;

    @ManyToOne
    @JoinColumn(name="facility_id", nullable=true)
    private Facility facility;
    private double price;
    private int totalSpots;
    private int spotsAvailable;
    private LocalDateTime dateTime;


    public Workshops() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
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

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
}
