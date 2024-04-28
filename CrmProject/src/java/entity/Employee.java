/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import jakarta.persistence.Entity;

/**
 *
 * @author baran
 */
@Entity
public class Employee extends Account {

    private int serviceNumber;
    private boolean isEnabled;
    private Double salary;

    public Employee(int serviceNumber, boolean isEnabled, Double salary, Long id, String name, String phone, String Address, String mail, String password) {
        super(id, name, phone, Address, mail, password);
        this.serviceNumber = serviceNumber;
        this.isEnabled = isEnabled;
        this.salary = salary;
    }

    public Employee(int serviceNumber, boolean isEnabled, Double salary, String name, String phone, String Address, String mail, String password) {
        super(name, phone, Address, mail, password);
        this.serviceNumber = serviceNumber;
        this.isEnabled = isEnabled;
        this.salary = salary;
    }

    public Employee(Long id) {
        super(id);
    }

    public Employee() {
    }

    public int getServiceNumber() {
        return serviceNumber;
    }

    public void setServiceNumber(int serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    public boolean isIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

}