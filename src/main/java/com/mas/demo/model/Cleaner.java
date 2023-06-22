package com.mas.demo.model;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="hasKeys", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("no")
public class Cleaner extends Person implements CleanerInterface {
//    @Id
//    @GeneratedValue(strategy = GenerationType.TABLE)
//    private Long id;
    private int cleanerBadgeNr;

    public Cleaner() {
    }

    public Cleaner(String name, String surname, String PESEL, int cleanerBadgeNr) {
        super(name, surname, PESEL);
        this.cleanerBadgeNr = cleanerBadgeNr;
    }


    public Cleaner(CleanerWithKeys cleanerWithKeys) {
        super(cleanerWithKeys.getName(), cleanerWithKeys.getSurname(), cleanerWithKeys.getPESEL());
        this.cleanerBadgeNr = cleanerWithKeys.getCleanerBadgeNr();
    }

//    @Override
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


}
