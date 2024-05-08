/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.List;

/**
 *
 * @author baran
 */
public class PersonalCustomer extends Customer{

    public PersonalCustomer(String surName, int zipCode, String address, String country, String city, List<Notes> notes, Long id, String name, String phone, String Address, String mail, String password) {
        super(surName, zipCode, address, country, city, notes, id, name, phone, Address, mail, password);
    }


    public PersonalCustomer() {
    }

    @Override
    public String toString() {
        return "PersonalCustomer{" + '}';
    }

  
}
