package com.mas.demo.model;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank
    private String postalCode;
    @NotBlank
    private String country;
    @NotBlank
    private String city;
    @NotBlank
    private String streetName;
    @NotBlank
    private int houseNumber;
    private Integer flatNumber;
    @OneToOne(mappedBy = "address")
    private Facility facility;

    public Address() {
    }

//    public Address(String postalCode, String country, String city, String streetName, int houseNumber, int flatNumber) {
//        this.postalCode = postalCode;
//        this.country = country;
//        this.city = city;
//        this.streetName = streetName;
//        this.houseNumber = houseNumber;
//        this.flatNumber = flatNumber;
//    }
//    //przeciazenie metody
//    public Address(String postalCode, String country, String city, String streetName, int houseNumber) {
//        this.postalCode = postalCode;
//        this.country = country;
//        this.city = city;
//        this.streetName = streetName;
//        this.houseNumber = houseNumber;
//        this.flatNumber = null;
//    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public Integer getFlatNumber() {
        return flatNumber;
    }

    public void setFlatNumber(Integer flatNumber) {
        this.flatNumber = flatNumber;
    }
}
