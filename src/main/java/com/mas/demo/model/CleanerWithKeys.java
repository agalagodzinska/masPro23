package com.mas.demo.model;

import javax.persistence.*;

@Entity
@DiscriminatorValue("yes")
public class CleanerWithKeys extends Cleaner {

    private int keyNumber;

    public CleanerWithKeys() {
    }

    public CleanerWithKeys(String name, String surname, String PESEL , int cleanerBadgeNr, int keyNumber) {
        super(name, surname, PESEL, cleanerBadgeNr);
        this.keyNumber=keyNumber;
    }

    public CleanerWithKeys(Cleaner cleaner, int keyNumber) {
        super(cleaner.getName(), cleaner.getSurname(), cleaner.getPESEL(), cleaner.getCleanerBadgeNr());
        this.keyNumber = keyNumber;
    }


    public int getKeyNumber() {
        return keyNumber;
    }

    public void setKeyNumber(int keyNumber) {
        this.keyNumber = keyNumber;
    }
}
