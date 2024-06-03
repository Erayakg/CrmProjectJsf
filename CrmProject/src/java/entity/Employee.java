/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
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
}