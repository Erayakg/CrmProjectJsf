/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author 90552
 **/

@Entity
@Table(name = "invoice")
public class Invoice extends BaseEntity {
    private LocalDateTime orderDate;
    private String shippingAddress;
    private float totalAmount;
    private boolean status;
    private String billingAddress;

    @OneToMany(mappedBy = "invoice")
    private List<Product> detail;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;
    
}