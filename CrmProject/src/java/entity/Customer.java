/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;

/**
 *
 * @author erayb
 */

@Entity
public class Customer implements BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String phone;
    private int zipCode;
    private String address;
    private String country;
    private String city;
    private String Companyİnformation;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Notes> notes;

    public Customer(Long İd, String firstName, String lastName, String phone, int zipCode, String address, String country, String city, String Companyİnformation, List<Notes> notes) {
        this.id = İd;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.zipCode = zipCode;
        this.address = address;
        this.country = country;
        this.city = city;
        this.Companyİnformation = Companyİnformation;
        this.notes = notes;
    }

    public Customer() {
    }

 

    public Customer(Long İd) {
        this.id = İd;
    }

    
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
    
    public void setİd(Long İd) {
        this.id = İd;
    }
   @Override
    public long getId() {
        return  id;
    }

   
}