/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Objects;

/**
 *
 * @author baran
 */
public class Employee extends Account {
    private Double salary;
    private String name;
    private String surname;

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Employee(Double salary, String name, String surname, Long id, String phone, String address, String mail, String password) {
        super(id, phone, address, mail, password);
        this.salary = salary;
        this.name = name;
        this.surname = surname;
    }

    public Employee() {
    }

    public Employee(Long id) {
        super(id);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.salary);
        hash = 43 * hash + Objects.hashCode(this.name);
        hash = 43 * hash + Objects.hashCode(this.surname);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Employee other = (Employee) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.surname, other.surname)) {
            return false;
        }
        return Objects.equals(this.salary, other.salary);
    }

    @Override
    public String toString() {
        return "Employee{" + "salary=" + salary + ", name=" + name + ", surname=" + surname + '}';
    }
    


   
}
