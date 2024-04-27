/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDateTime;

/**
 *
 * @author 90552
 */
public class Product implements BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String Name;
    private String Description;
    private float Price;
    private int StockQuantity ;
    private LocalDateTime CreatedDate ;
    private LocalDateTime LastModifiedDate;
    private boolean IsActive;

    public Product() {
    }

    public Product(long Id) {
        this.Id = Id;
    }

    public Product(long Id, String Name, String Description, float Price, int StockQuantity, LocalDateTime CreatedDate, LocalDateTime LastModifiedDate, boolean IsActive) {
        this.Id = Id;
        this.Name = Name;
        this.Description = Description;
        this.Price = Price;
        this.StockQuantity = StockQuantity;
        this.CreatedDate = CreatedDate;
        this.LastModifiedDate = LastModifiedDate;
        this.IsActive = IsActive;
    }

    @Override
    public long getId() {
        return Id;
    }

    public void setId(long Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float Price) {
        this.Price = Price;
    }

    public int getStockQuantity() {
        return StockQuantity;
    }

    public void setStockQuantity(int StockQuantity) {
        this.StockQuantity = StockQuantity;
    }

    public LocalDateTime getCreatedDate() {
        return CreatedDate;
    }

    public void setCreatedDate(LocalDateTime CreatedDate) {
        this.CreatedDate = CreatedDate;
    }

    public LocalDateTime getLastModifiedDate() {
        return LastModifiedDate;
    }

    public void setLastModifiedDate(LocalDateTime LastModifiedDate) {
        this.LastModifiedDate = LastModifiedDate;
    }

    public boolean isIsActive() {
        return IsActive;
    }

    public void setIsActive(boolean IsActive) {
        this.IsActive = IsActive;
    }
    
    
}
