/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import jakarta.persistence.*;
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
}

    
    
