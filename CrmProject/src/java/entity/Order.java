/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;
import java.time.LocalDateTime;


public class Order {
  
    private long id; 
    private LocalDateTime orderDate;// Sipariş tarihi
    private String shippingAddress  ; // Gönderim adresi
    private String billingAddress ; // Fatura adresi
    private float totalAmount ; // Toplam tutar
    private boolean status ; // Sipariş durumu

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
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

    public Order(long id, LocalDateTime orderDate, String shippingAddress, String billingAddress, float totalAmount, boolean status) {
        this.id = id;
        this.orderDate = orderDate;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public Order() {
    }

    public Order(long id) {
        this.id = id;
    }

    
    
}
