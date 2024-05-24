/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author 90552
 */
public class Invoice implements BaseEntity {

    private Long Id;
    private LocalDateTime orderDate;// Sipariş tarihi
    private String shippingAddress; // gonderim adresi
    private float totalAmount; // Toplam tutar
    private boolean status; // Sipariş durumu
    private String billingAddress;
    private Orders order;

    @Override
    public Long getId() {
        return Id;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Orders getOrder() {
        return order;
    }

    public void setOrder(Orders order) {
        this.order = order;
    }

    public Invoice(Long Id, LocalDateTime orderDate, String shippingAddress, float totalAmount, boolean status, String billingAddress, Orders order) {
        this.Id = Id;
        this.orderDate = orderDate;
        this.shippingAddress = shippingAddress;
        this.totalAmount = totalAmount;
        this.status = status;
        this.billingAddress = billingAddress;
        this.order = order;
    }

    public Invoice() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.Id);
        hash = 89 * hash + Objects.hashCode(this.orderDate);
        hash = 89 * hash + Objects.hashCode(this.shippingAddress);
        hash = 89 * hash + Float.floatToIntBits(this.totalAmount);
        hash = 89 * hash + (this.status ? 1 : 0);
        hash = 89 * hash + Objects.hashCode(this.billingAddress);
        hash = 89 * hash + Objects.hashCode(this.order);
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
        final Invoice other = (Invoice) obj;
        return Objects.equals(this.Id, other.Id);
    }

    @Override
    public String toString() {
        return "Invoice{" + "Id=" + Id + ", orderDate=" + orderDate + ", shippingAddress=" + shippingAddress + ", totalAmount=" + totalAmount + ", status=" + status + ", billingAddress=" + billingAddress + ", order=" + order + '}';
    }

   
    

    
}
