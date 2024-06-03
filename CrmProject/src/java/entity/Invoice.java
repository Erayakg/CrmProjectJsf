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

    public Invoice() {
    }

    public Invoice(LocalDateTime orderDate, String shippingAddress, float totalAmount, boolean status, String billingAddress, List<Product> detail, Order order) {
        this.orderDate = orderDate;
        this.shippingAddress = shippingAddress;
        this.totalAmount = totalAmount;
        this.status = status;
        this.billingAddress = billingAddress;
        this.detail = detail;
        this.order = order;
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

    public List<Product> getDetail() {
        return detail;
    }

    public void setDetail(List<Product> detail) {
        this.detail = detail;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.orderDate);
        hash = 71 * hash + Objects.hashCode(this.shippingAddress);
        hash = 71 * hash + Float.floatToIntBits(this.totalAmount);
        hash = 71 * hash + (this.status ? 1 : 0);
        hash = 71 * hash + Objects.hashCode(this.billingAddress);
        hash = 71 * hash + Objects.hashCode(this.detail);
        hash = 71 * hash + Objects.hashCode(this.order);
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
        return "Invoice{" + "orderDate=" + orderDate + ", shippingAddress=" + shippingAddress + ", totalAmount=" + totalAmount + ", status=" + status + ", billingAddress=" + billingAddress + ", detail=" + detail + ", order=" + order + '}';
    }
    
    
}