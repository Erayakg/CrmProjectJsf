/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.Objects;

/**
 *
 * @author baran
 */
@Entity
public class Note extends BaseEntity {
    
    private String content;
    private String title;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}