package io;

import java.io.Serializable;
import java.util.Base64;

public class User implements Serializable {

    private long id;
    private String username;
    private String password;
    private String bankCardNumber;

    private transient String phoneNumber;
    private Address address;

    public User(long id, String username, String password, String bankCardNumber, String phoneNumber, Address address) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.bankCardNumber = Base64.getEncoder().encodeToString(bankCardNumber.getBytes());;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", bankCardNumber='" + bankCardNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address=" + address +
                '}';
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
        return new String(Base64.getDecoder().decode(bankCardNumber));
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