package com.mas.demo.model;

import javax.persistence.*;

@Entity
@DiscriminatorValue("yes")
public class CleaningReceptionist extends Receptionist implements CleanerInterface {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

    int cleanerBadgeNr;
    int receptionistBadgeNr;

    public CleaningReceptionist() {
    }

//    public CleaningReceptionist(String name, String surname, String PESEL, Address address, int receptionistId, int cleanerId) {
//        super(name, surname, PESEL, receptionistId);
//
//    }


//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public int getCleanerBadgeNr() {
        return cleanerBadgeNr;
    }

    public void setCleanerBadgeNr(int cleanerBadgeNr) {
        this.cleanerBadgeNr = cleanerBadgeNr;
    }

    public int getReceptionistBadgeNr() {
        return receptionistBadgeNr;
    }

    public void setReceptionistBadgeNr(int receptionistBadgeNr) {
        this.receptionistBadgeNr = receptionistBadgeNr;
    }
}
