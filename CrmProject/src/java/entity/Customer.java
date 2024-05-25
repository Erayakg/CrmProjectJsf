/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.List;

/**
 *
 * @author erayb
 */
public class Customer extends Account {

    private String surname;
    private int zipCode;
    private String address;
    private String country;
    private String city;
    private List<Notes> notes;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public List<Notes> getNotes() {
        return notes;
    }

    public void setNotes(List<Notes> notes) {
        this.notes = notes;
    }

    public Customer(String surname, int zipCode, String address, String country, String city, List<Notes> notes, Long id, String name, String phone, String Address, String mail, String password) {
        super(id, name, phone, Address, mail, password);
        this.surname = surname;
        this.zipCode = zipCode;
        this.address = address;
        this.country = country;
        this.city = city;
        this.notes = notes;
    }

    public Customer() {
    }

    public Customer(String surname, int zipCode, String address, String country, String city, List<Notes> notes, String name, String phone, String Address, String mail, String password) {
        super(name, phone, Address, mail, password);
        this.surname = surname;
        this.zipCode = zipCode;
        this.address = address;
        this.country = country;
        this.city = city;
        this.notes = notes;
    }

    public Customer(Long id) {
        super(id);
    }
    

    
    

}
