package com.mas.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Set;

@Entity
@DiscriminatorValue("yes")
public class Owner extends Trainer {

    @OneToMany(mappedBy = "owner")
    private Set<Facility> facilities;

    public Owner() {

    }

    public Set<Facility> getFacilities() {
        return facilities;
    }

    public void setFacilities(Set<Facility> facilities) {
        this.facilities = facilities;
    }
}
