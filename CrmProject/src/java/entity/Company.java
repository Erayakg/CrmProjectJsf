/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;



/**
 *
 * @author baran
 */

@Entity
public class Company extends BaseEntity {
    private String name;
    private String phone;
    private String address;
    private String mail;
    private String password;
    private Long taxNumber;

    @ManyToMany
    @JoinTable(
        name = "company_campaign",
        joinColumns = @JoinColumn(name = "company_id"),
        inverseJoinColumns = @JoinColumn(name = "campaign_id")
    )
    private List<Campaign> campaigns;

    @OneToMany(mappedBy = "company")
    private List<Order> orders;

    public Company(String name, String phone, String address, String mail, String password, Long taxNumber, List<Campaign> campaigns, List<Order> orders) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.mail = mail;
        this.password = password;
        this.taxNumber = taxNumber;
        this.campaigns = campaigns;
        this.orders = orders;
    }

    public Company() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(Long taxNumber) {
        this.taxNumber = taxNumber;
    }

    public List<Campaign> getCampaigns() {
        return campaigns;
    }

    public void setCampaigns(List<Campaign> campaigns) {
        this.campaigns = campaigns;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
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
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.phone);
        hash = 97 * hash + Objects.hashCode(this.address);
        hash = 97 * hash + Objects.hashCode(this.mail);
        hash = 97 * hash + Objects.hashCode(this.password);
        hash = 97 * hash + Objects.hashCode(this.taxNumber);
        hash = 97 * hash + Objects.hashCode(this.campaigns);
        hash = 97 * hash + Objects.hashCode(this.orders);
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
        final Company other = (Company) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.phone, other.phone)) {
            return false;
        }
        if (!Objects.equals(this.address, other.address)) {
            return false;
        }
        if (!Objects.equals(this.mail, other.mail)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.taxNumber, other.taxNumber)) {
            return false;
        }
        if (!Objects.equals(this.campaigns, other.campaigns)) {
            return false;
        }
        return Objects.equals(this.orders, other.orders);
    }

    @Override
    public String toString() {
        return "Company{" + "name=" + name + ", phone=" + phone + ", address=" + address + ", mail=" + mail + ", password=" + password + ", taxNumber=" + taxNumber + ", campaigns=" + campaigns + ", orders=" + orders + '}';
    }
    
    
    
}

    
    
