package com.mas.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "facility")
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;
    @NotBlank
    private String NIP;
    @ManyToOne
    @JoinColumn(name="owner_id", nullable=false)
    private Owner owner;
    @OneToMany(mappedBy = "facility")
    private Set<Room> rooms;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Facility_Trainer",
            joinColumns = { @JoinColumn(name = "facility_id") },
            inverseJoinColumns = { @JoinColumn(name = "trainer_id") }
    )
    Set<Trainer> trainers = new HashSet<>();
    @OneToMany(mappedBy = "facility")
    private Set<Workshops> workshops;



    public Facility() {
    }

    public Facility(String name, Address address, String NIP, Owner owner) {
        this.name = name;
        this.address = address;
        this.NIP = NIP;
        this.owner = owner;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Set<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Set<Room> rooms) {
        this.rooms = rooms;
    }

    public Set<Trainer> getTrainers() {
        return trainers;
    }

    public void setTrainers(Set<Trainer> trainers) {
        this.trainers = trainers;
    }

    public Set<Workshops> getWorkshops() {
        return workshops;
    }

    public void setWorkshops(Set<Workshops> workshops) {
        this.workshops = workshops;
    }
}
