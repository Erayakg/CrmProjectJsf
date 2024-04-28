/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

/**
 *
 * @author 90552
 */
@Entity
public class Invoice implements BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String customerName;
    private LocalDateTime issueDate;
    private float totalAmount;
    private boolean isPaid;

    public Invoice() {
    }

    public Invoice(long Id) {
        this.Id = Id;
    }

    public Invoice(long Id, String customerName, LocalDateTime issueDate, float totalAmount, boolean isPaid) {
        this.Id = Id;
        this.customerName = customerName;
        this.issueDate = issueDate;
        this.totalAmount = totalAmount;
        this.isPaid = isPaid;
    }

    @Override
    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public LocalDateTime getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDateTime issueDate) {
        this.issueDate = issueDate;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public boolean isIsPaid() {
        return isPaid;
    }

    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }
    
}
