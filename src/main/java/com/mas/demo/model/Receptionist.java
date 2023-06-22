package com.mas.demo.model;

import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="isCleaning", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("no")
public class Receptionist extends Person{
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int id;
    private int receptionistBadgeNr;

    public Receptionist() {
    }

    public Receptionist(String name, String surname, String PESEL,int receptionistBadgeNr) {
        super(name, surname, PESEL);
        this.receptionistBadgeNr = receptionistBadgeNr;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReceptionistBadgeNr() {
        return receptionistBadgeNr;
    }

    public void setReceptionistBadgeNr(int receptionistBadgeNr) {
        this.receptionistBadgeNr = receptionistBadgeNr;
    }
}
