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

@Entity
@Table(name = "order")
public class Order extends BaseEntity {
    
    private LocalDateTime orderDate;
    private String shippingAddress;
    private String billingAddress;
    private float totalAmount;
    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;

    @OneToMany(mappedBy = "order")
    private List<Invoice> invoices;

    public Order() {
    }

    public Order(LocalDateTime orderDate, String shippingAddress, String billingAddress, float totalAmount, boolean status, Customer customer, Company company, List<Invoice> invoices) {
        this.orderDate = orderDate;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.totalAmount = totalAmount;
        this.status = status;
        this.customer = customer;
        this.company = company;
        this.invoices = invoices;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(List<Invoice> invoices) {
        this.invoices = invoices;
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
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.orderDate);
        hash = 37 * hash + Objects.hashCode(this.shippingAddress);
        hash = 37 * hash + Objects.hashCode(this.billingAddress);
        hash = 37 * hash + Float.floatToIntBits(this.totalAmount);
        hash = 37 * hash + (this.status ? 1 : 0);
        hash = 37 * hash + Objects.hashCode(this.customer);
        hash = 37 * hash + Objects.hashCode(this.company);
        hash = 37 * hash + Objects.hashCode(this.invoices);
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
        final Order other = (Order) obj;
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
        if (!Objects.equals(this.customer, other.customer)) {
            return false;
        }
        if (!Objects.equals(this.company, other.company)) {
            return false;
        }
        return Objects.equals(this.invoices, other.invoices);
    }

    @Override
    public String toString() {
        return "Order{" + "orderDate=" + orderDate + ", shippingAddress=" + shippingAddress + ", billingAddress=" + billingAddress + ", totalAmount=" + totalAmount + ", status=" + status + ", customer=" + customer + ", company=" + company + ", invoices=" + invoices + '}';
    }
    
    

}