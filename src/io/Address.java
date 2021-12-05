package io;

import java.io.Serializable;

public class Address implements Serializable {

    private String country;
    private String city;
    private String zipCode;
    private String street;
    private String line1;
    static final long serialVersionUID = 77L;
    public Address() {
    }

    public Address(String country, String city, String zipCode, String street, String line1) {
        this.country = country;
        this.city = city;
        this.zipCode = zipCode;
        this.street = street;
        this.line1 = line1;
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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }
}
