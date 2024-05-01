/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author baran
 */
public class Employee extends Account {

    private int serviceNumber;
    private boolean isEnabled;
    private Double salary;
    private String SurName;
    public Employee(int serviceNumber, boolean isEnabled, Double salary, Long id, String name, String phone, String Address, String mail, String password, String surName) {
        super(id, name, phone, Address, mail, password);
        this.serviceNumber = serviceNumber;
        this.isEnabled = isEnabled;
        this.salary = salary;
    }

    public Employee(int serviceNumber, boolean isEnabled, Double salary, String name, String phone, String Address, String mail, String password, String surName) {
        super(name, phone, Address, mail, password);
        this.serviceNumber = serviceNumber;
        this.isEnabled = isEnabled;
        this.salary = salary;
        this.SurName=surName;
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

    public String getSurName() {
        return SurName;
    }

    public void setSurName(String SurName) {
        this.SurName = SurName;
    }
    

}
