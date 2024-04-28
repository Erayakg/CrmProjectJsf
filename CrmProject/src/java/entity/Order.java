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

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id; 
    private LocalDateTime OrderDate;// Sipariş tarihi
    private Address ShippingAddress ; // Gönderim adresi
    private Address BillingAddress ; // Fatura adresi
    private String Items ; // Sipariş kalemleri
    private float TotalAmount ; // Toplam tutar
    private boolean Status ; // Sipariş durumu

    public Order() {
    }

    public Order(long Id) {
        this.Id = Id;
    }

    public Order(long Id, LocalDateTime OrderDate, Address ShippingAddress, Address BillingAddress, String Items, float TotalAmount, boolean Status) {
        this.Id = Id;
        this.OrderDate = OrderDate;
        this.ShippingAddress = ShippingAddress;
        this.BillingAddress = BillingAddress;
        this.Items = Items;
        this.TotalAmount = TotalAmount;
        this.Status = Status;
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

    public Address getShippingAddress() {
        return ShippingAddress;
    }

    public void setShippingAddress(Address ShippingAddress) {
        this.ShippingAddress = ShippingAddress;
    }

    public Address getBillingAddress() {
        return BillingAddress;
    }

    public void setBillingAddress(Address BillingAddress) {
        this.BillingAddress = BillingAddress;
    }

    public String getItems() {
        return Items;
    }

    public void setItems(String Items) {
        this.Items = Items;
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
