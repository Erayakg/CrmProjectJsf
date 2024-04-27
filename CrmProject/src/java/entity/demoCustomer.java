/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author erayb
 */
public class demoCustomer {
    
    Long id;
    String name;
    String surName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surName;
    }

    public void setSurname(String Surname) {
        this.surName = Surname;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", Surname=" + surName + '}';
    }

    public demoCustomer() {
    }
    
}
