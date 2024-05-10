/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Orders  implements  BaseEntity{
  //invoice, customer,
    private long Id; 
    private LocalDateTime orderDate;// Sipariş tarihi
    private String shippingAddress ; // gonderim adresi
    private float totalAmount ; // Toplam tutar
    private boolean status ; // Sipariş durumu
    private List<Product> detail;

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

    public Orders(long Id, LocalDateTime orderDate, String shippingAddress, float totalAmount, boolean status, List<Product> detail) {
        this.Id = Id;
        this.orderDate = orderDate;
        this.shippingAddress = shippingAddress;
        this.totalAmount = totalAmount;
        this.status = status;
        this.detail = detail;
    }

    public Orders() {
    }

    public Orders(long Id) {
        this.Id = Id;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (int) (this.Id ^ (this.Id >>> 32));
        hash = 37 * hash + Objects.hashCode(this.orderDate);
        hash = 37 * hash + Objects.hashCode(this.shippingAddress);
        hash = 37 * hash + Float.floatToIntBits(this.totalAmount);
        hash = 37 * hash + (this.status ? 1 : 0);
        hash = 37 * hash + Objects.hashCode(this.detail);
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
        final Orders other = (Orders) obj;
        return this.Id == other.Id;
    }

    @Override
    public String toString() {
        return "Order{" + "Id=" + Id + ", orderDate=" + orderDate + ", shippingAddress=" + shippingAddress + ", totalAmount=" + totalAmount + ", status=" + status + ", detail=" + detail + '}';
    }

   

    
   
   


  
    
}
