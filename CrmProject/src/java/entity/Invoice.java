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
    private List<Product> detail;
    private String billingAddress;

    private Order order;

    public Order getOrder() {
        if (this.order == null) {
            order = new Order();
        }
        return order;
    }

    public void setOrder(Order order) {

        this.order = order;
    }

    @Override
    public Long getId() {
        return Id;
    }

    public void setId(long Id) {
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

    public List<Product> getDetail() {
        return detail;
    }

    public void setDetail(List<Product> detail) {
        this.detail = detail;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Invoice(long Id, LocalDateTime orderDate, String shippingAddress, float totalAmount, boolean status, List<Product> detail, String billingAddress, Order order) {
        this.Id = Id;
        this.orderDate = orderDate;
        this.shippingAddress = shippingAddress;
        this.totalAmount = totalAmount;
        this.status = status;
        this.detail = detail;
        this.billingAddress = billingAddress;
        this.order = order;
    }

    public Invoice() {
    }

    public Invoice(long Id) {
        this.Id = Id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + (int) (this.Id ^ (this.Id >>> 32));
        hash = 23 * hash + Objects.hashCode(this.orderDate);
        hash = 23 * hash + Objects.hashCode(this.shippingAddress);
        hash = 23 * hash + Float.floatToIntBits(this.totalAmount);
        hash = 23 * hash + (this.status ? 1 : 0);
        hash = 23 * hash + Objects.hashCode(this.detail);
        hash = 23 * hash + Objects.hashCode(this.billingAddress);
        hash = 23 * hash + Objects.hashCode(this.order);
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
        if (this.Id != other.Id) {
            return false;
        }
        if (Float.floatToIntBits(this.totalAmount) != Float.floatToIntBits(other.totalAmount)) {
            return false;
        }
        if (this.status != other.status) {
            return false;
        }
        if (!Objects.equals(this.shippingAddress, other.shippingAddress)) {
            return false;
        }
        if (!Objects.equals(this.billingAddress, other.billingAddress)) {
            return false;
        }
        if (!Objects.equals(this.orderDate, other.orderDate)) {
            return false;
        }
        if (!Objects.equals(this.detail, other.detail)) {
            return false;
        }
        return Objects.equals(this.order, other.order);
    }

    @Override
    public String toString() {
        return "Invoice{" + "Id=" + Id + ", orderDate=" + orderDate + ", shippingAddress=" + shippingAddress + ", totalAmount=" + totalAmount + ", status=" + status + ", detail=" + detail + ", billingAddress=" + billingAddress + ", order=" + order + '}';
    }
    

}
