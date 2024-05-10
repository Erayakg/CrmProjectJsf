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
public class Invoice extends Order implements BaseEntity{
    
    private String billingAddress;
    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Invoice(String billingAddress, long Id, LocalDateTime orderDate, String shippingAddress, float totalAmount, boolean status, List<Product> detail) {
        super(Id, orderDate, shippingAddress, totalAmount, status, detail);
        this.billingAddress = billingAddress;
    }

   

    public Invoice() {
    }

    public Invoice(long Id) {
        super(Id);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.billingAddress);
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
        return Objects.equals(this.billingAddress, other.billingAddress);
    }

    @Override
    public String toString() {
        return "Invoice{" + "billingAddress=" + billingAddress + '}';
    }
    

  
    
}
