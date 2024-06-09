/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author baran
 */
@Entity
public class Employee extends BaseEntity {
    private String name;
    private String surname;
    private String phone;
    private String address;
    private String mail;
    private String password;
    private Double salary;

    @OneToMany(mappedBy = "employee")
    private List<Feedback> feedbacks;

    @OneToMany(mappedBy = "assignedEmployee")
    private List<Task> tasks;

    public Employee() {
    }

    public Employee(String mail, String password) {
        this.mail = mail;
        this.password = password;
    }

    public Employee(String name, String surname, String phone, String address, String mail, String password) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
        this.mail = mail;
        this.password = password;
    }

    public Employee(String name, String surname, String phone, String address, String mail, String password, Double salary, List<Feedback> feedbacks, List<Task> tasks) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
        this.mail = mail;
        this.password = password;
        this.salary = salary;
        this.feedbacks = feedbacks;
        this.tasks = tasks;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public List<Feedback> getFeedbacks() {
        return feedbacks;
    }

    public void setFeedbacks(List<Feedback> feedbacks) {
        this.feedbacks = feedbacks;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.name);
        hash = 47 * hash + Objects.hashCode(this.surname);
        hash = 47 * hash + Objects.hashCode(this.phone);
        hash = 47 * hash + Objects.hashCode(this.address);
        hash = 47 * hash + Objects.hashCode(this.mail);
        hash = 47 * hash + Objects.hashCode(this.password);
        hash = 47 * hash + Objects.hashCode(this.salary);
        hash = 47 * hash + Objects.hashCode(this.feedbacks);
        hash = 47 * hash + Objects.hashCode(this.tasks);
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
        if (!Objects.equals(this.phone, other.phone)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.mail, other.mail)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.salary, other.salary)) {
            return false;
        }
        if (!Objects.equals(this.feedbacks, other.feedbacks)) {
            return false;
        }
        return Objects.equals(this.tasks, other.tasks);
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", surname=" + surname + ", phone=" + phone + ", address=" + address + ", mail=" + mail + ", password=" + password + ", salary=" + salary + ", feedbacks=" + feedbacks + ", tasks=" + tasks + '}';
    }
    
}