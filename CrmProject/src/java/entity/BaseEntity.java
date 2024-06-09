/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author baran
 */
@MappedSuperclass
public abstract class BaseEntity implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    LocalDateTime createdDate;
    LocalDateTime updatedDate;
    
    @PrePersist
    public void setCreatedDate(){
        this.createdDate=LocalDateTime.now();
    }
    @PreUpdate
    public void setUpdatedDate(){
        this.updatedDate=LocalDateTime.now();
    }
    
}
