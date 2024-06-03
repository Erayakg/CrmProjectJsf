/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author 90552
 */
@Entity
public class Report extends BaseEntity {
    
    private String subject;
    private String description;
    private String title;
    private LocalDateTime date;
    private String reportEmail;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}