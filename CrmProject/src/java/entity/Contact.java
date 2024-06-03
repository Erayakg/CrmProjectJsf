/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import jakarta.persistence.*;
import java.util.Objects;

/**
 *
 * @author erayb
 */

@Entity
public class Contact extends BaseEntity {
    private String subject;
    private String description;
    private String title;

    @ManyToOne
    @JoinColumn(name = "company_id")
    private Company company;
}