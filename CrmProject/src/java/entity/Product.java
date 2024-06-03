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

public class Product extends BaseEntity {

    private String name;
    private String description;
    private float price;
    private int stockQuantity;
    private LocalDateTime createdDate;
    private boolean isActive;
    
    
    @ManyToOne
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;

}
