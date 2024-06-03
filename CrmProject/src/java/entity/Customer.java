/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.util.List;

/**
 *
 * @author erayb
 */

@Entity
public class Customer extends BaseEntity {
    
    private String name;
    
    private String surname;
    private int zipCode;
    private String address;
    private String country;
    private String city;

    @OneToMany(mappedBy = "customer")
    private List<Order> orders;

    @OneToMany(mappedBy = "customer")
    private List<Note> notes;
    
}
