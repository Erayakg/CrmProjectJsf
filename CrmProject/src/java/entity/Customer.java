/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.util.List;

/**
 *
 * @author erayb
 */
@Entity
public class Customer extends Account {

    private int zipCode;
    private String address;
    private String country;
    private String city;
    private String Companyİnformation;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Notes> notes;

    public Customer(int zipCode, String address, String country, String city, String Companyİnformation, List<Notes> notes, Long id, String name, String phone, String Address, String mail, String password) {
        super(id, name, phone, Address, mail, password);
        this.zipCode = zipCode;
        this.address = address;
        this.country = country;
        this.city = city;
        this.Companyİnformation = Companyİnformation;
        this.notes = notes;
    }

    public Customer(Long id) {
        super(id);
    }

    public Customer(int zipCode, String address, String country, String city, String Companyİnformation, List<Notes> notes, String name, String phone, String Address, String mail, String password) {
        super(name, phone, Address, mail, password);
        this.zipCode = zipCode;
        this.address = address;
        this.country = country;
        this.city = city;
        this.Companyİnformation = Companyİnformation;
        this.notes = notes;
    }

    public Customer() {
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

    public String getCompanyİnformation() {
        return Companyİnformation;
    }

    public void setCompanyİnformation(String Companyİnformation) {
        this.Companyİnformation = Companyİnformation;
    }

    public List<Notes> getNotes() {
        return notes;
    }

    public void setNotes(List<Notes> notes) {
        this.notes = notes;
    }

}
