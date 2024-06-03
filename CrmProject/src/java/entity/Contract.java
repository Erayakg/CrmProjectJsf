/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author baran
 */
@Entity
public class Contract extends BaseEntity {

    private String name;
    private Date startDate;
    private Date finishDate;
    private String status;
    private Long amount;
    private String description;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
}