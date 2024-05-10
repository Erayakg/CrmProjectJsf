/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;


import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author 90552
 */

public class Product implements BaseEntity {
   
    private Long id;
    private String name;
    private String description;
    private float price;
    private int stockQuantity ;
    private LocalDateTime createdDate ;
    private boolean isActive;

    public Product() {
        
    }

    @Override
    public Long getId() {
        return id;
    }

    public Product(Long id, String name, String description, float price, int stockQuantity, LocalDateTime createdDate, boolean isActive) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.createdDate = createdDate;
        this.isActive = isActive;
    }
    
   
    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(int stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + ", stockQuantity=" + stockQuantity + ", createdDate=" + createdDate  + ", isActive=" + isActive + '}';
    }
    

    
}
