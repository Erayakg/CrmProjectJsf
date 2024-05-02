/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import jakarta.mail.Address;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;
import java.util.List;

public class Order {
  
    private long Id; 
    private LocalDateTime OrderDate;// Sipariş tarihi
    private String ShippingAddress ; // Gönderim adresi
    private String BillingAddress ; // Fatura adresi
    private float TotalAmount ; // Toplam tutar
    private boolean Status ; // Sipariş durumu

    public Order() {
    }

    public Order(long Id, LocalDateTime OrderDate, String ShippingAddress, String BillingAddress, float TotalAmount, boolean Status) {
        this.Id = Id;
        this.OrderDate = OrderDate;
        this.ShippingAddress = ShippingAddress;
        this.BillingAddress = BillingAddress;
        this.TotalAmount = TotalAmount;
        this.Status = Status;
    }
    

    public Order(long Id) {
        this.Id = Id;
    }

    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public LocalDateTime getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(LocalDateTime OrderDate) {
        this.OrderDate = OrderDate;
    }

    public String getShippingAddress() {
        return ShippingAddress;
    }

    public void setShippingAddress(String ShippingAddress) {
        this.ShippingAddress = ShippingAddress;
    }

    public String getBillingAddress() {
        return BillingAddress;
    }

    public void setBillingAddress(String BillingAddress) {
        this.BillingAddress = BillingAddress;
    }

    public float getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(float TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }

   


  
    
}
