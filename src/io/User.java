package io;

import java.io.Serializable;
import java.util.Base64;

public class User implements Serializable {

    private long id;
    private String username;
    private String password;
    private String bankCardNumber;
    private String phoneNumber;
    private Address address;

    public String toString() {
        return "\n Information about user [ " +
                "ID -   " + id + "\n" +
                "Username -   " + username +
                "Password - " + password +
                "Bank Card Number - " + getBankCardNumber() +"\n"+
                "Address - " + address + "\n" + "Phone Number -" + phoneNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBankCardNumber() {
        byte [] cardNumber = bankCardNumber.getBytes();
        Base64.getEncoder().encode(cardNumber);
        String s = cardNumber.toString();
        return s;
    }

    public void setBankCardNumber(String bankCardNumber) {
        this.bankCardNumber = bankCardNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
